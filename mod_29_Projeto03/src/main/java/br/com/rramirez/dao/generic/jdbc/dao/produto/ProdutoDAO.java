package br.com.rramirez.dao.generic.jdbc.dao.produto;

import br.com.rramirez.dao.generic.jdbc.ConnectionFactoryProduto;
import br.com.rramirez.domain.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO {


    @Override
    public Integer cadastrar(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactoryProduto.getConnection();
            String sql = "INSERT INTO PRODUTO (nome, codigo, valor) VALUES (?, ?, ?);";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getNome());
            stm.setInt(2, produto.getCodigo());
            stm.setDouble(3, produto.getValor());
            return stm.executeUpdate();
        } catch (Exception e){
            throw e;
        } finally {
            closeConnection(connection,stm,null);
        }
    }

    @Override
    public Integer atualizar(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try{
            connection = ConnectionFactoryProduto.getConnection();
            String sql = "UPDATE PRODUTO SET NOME = ?, CODIGO = ?, VALOR = ? WHERE ID = ?;";
            stm = connection.prepareStatement(sql);
            stm.setString(1, produto.getNome());
            stm.setInt(2, produto.getCodigo());
            stm.setDouble(3, produto.getValor());
            return stm.executeUpdate();
        } catch (Exception e){
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    @Override
    public Produto buscar(Integer codigo) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Produto produto = null;
        try{
            connection = ConnectionFactoryProduto.getConnection();
            String sql = "SELECT * FROM PRODUTO WHERE CODIGO = ?";
            stm = connection.prepareStatement(sql);
            stm.setInt(1, codigo);
            rs = stm.executeQuery();

            if (rs.next()){
                produto = new Produto();
                Long id = rs.getLong("ID");
                String nome = rs.getString("NOME");
                Integer cod = rs.getInt("CODIGO");
                Double valor = rs.getDouble("VALOR");
                produto.setId(id);
                produto.setNome(nome);
                produto.setCodigo(cod);
                produto.setValor(valor);
            }
        } catch (Exception e){
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return produto;
    }

    @Override
    public List<Produto> buscarTodos() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Produto> list = new ArrayList<>();
        Produto produto = null;
        try{
            connection = ConnectionFactoryProduto.getConnection();
            String sql = "SELECT * FROM PRODUTO";
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();

            while(rs.next()){
                produto = new Produto();
                Long id = rs.getLong("ID");
                String nome = rs.getString("NOME");
                Integer cod = rs.getInt("CODIGO");
                Double valor = rs.getDouble("VALOR");
                produto.setId(id);
                produto.setNome(nome);
                produto.setCodigo(cod);
                produto.setValor(valor);
                list.add(produto);
            }
        } catch (Exception e){
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return list;
    }

    @Override
    public Integer excluir(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try{
            connection = ConnectionFactoryProduto.getConnection();
            String sql = "DELETE FROM PRODUTO WHERE CODIGO = ?";
            stm = connection.prepareStatement(sql);
            stm.setInt(1, produto.getCodigo());
            return stm.executeUpdate();
        } catch (Exception e){
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
        try{
            if(rs != null && !rs.isClosed()){
                rs.close();
            }
            if(stm != null && !stm.isClosed()){
                stm.close();
            }
            if(connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e1){
            e1.printStackTrace();
        }
    }
}
