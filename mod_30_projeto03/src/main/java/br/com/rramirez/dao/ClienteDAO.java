package br.com.rramirez.dao;

import br.com.rramirez.dao.generic.GenericDAO;
import br.com.rramirez.domain.Cliente;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDAO(){
        super();
    }
    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setStatusCivil(entity.getStatusCivil());
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setEstado(entity.getEstado());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setNumero(entity.getNumero());
        entityCadastrado.setTel(entity.getTel());

    }

    @Override
    protected String getQueryInsercao() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO TB_CLIENTE ");
        sb.append("(ID, NOME, CPF, TEL, STATUS_CIVIL, ENDERECO, NUMERO, CIDADE, ESTADO)");
        sb.append("VALUES (nextval('sq_cliente'),?,?,?,?,?,?,?)");
        return sb.toString();
    }

    @Override
    protected String getQueryExclusao() {
        return "DELETE FROM TB_CLIENTE WHERE CPF = ?";
    }

    @Override
    protected String getQueryAtualizacao() {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE TB_CLIENTE ");
        sb.append("SET NOME = ?,");
        sb.append("TEL = ?,");
        sb.append("STATUS_CIVIL = ?,");
        sb.append("ENDERECO = ?,");
        sb.append("NUMERO = ?,");
        sb.append("CIDADE = ?,");
        sb.append("ESTADO = ?");
        sb.append(" WHERE CPF = ?");
        return sb.toString();
    }

    @Override
    protected void setParametrosQueryInsercao(PreparedStatement stmInsert, Cliente entity) throws SQLException {
        stmInsert.setString(1, entity.getNome());
        stmInsert.setLong(2, entity.getCpf());
        stmInsert.setLong(3, entity.getTel());
        stmInsert.setString(4, entity.getStatusCivil());
        stmInsert.setString(5, entity.getEnd());
        stmInsert.setLong(6, entity.getNumero());
        stmInsert.setString(7, entity.getCidade());
        stmInsert.setString(8, entity.getEstado());
    }

    @Override
    protected void setParametrosQueryExclusao(PreparedStatement stmDelete, Long valor) throws SQLException {
        stmDelete.setLong(1, valor);
    }

    @Override
    protected void setParametrosQueryAtualizacao(PreparedStatement stmUpdate, Cliente entity) throws SQLException {
        stmUpdate.setString(1, entity.getNome());
        stmUpdate.setLong(2, entity.getTel());
        stmUpdate.setString(3, entity.getStatusCivil());
        stmUpdate.setString(4, entity.getEnd());
        stmUpdate.setLong(5, entity.getNumero());
        stmUpdate.setString(6, entity.getCidade());
        stmUpdate.setString(7, entity.getEstado());
        stmUpdate.setLong(8, entity.getCpf());
    }

    @Override
    protected void setParametrosQuerySelect(PreparedStatement stmSelect, Long valor) throws SQLException {
        stmSelect.setLong(1, valor);
    }
}
