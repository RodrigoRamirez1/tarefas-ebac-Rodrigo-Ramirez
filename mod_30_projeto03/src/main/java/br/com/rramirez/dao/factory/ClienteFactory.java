package br.com.rramirez.dao.factory;

import br.com.rramirez.domain.Cliente;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteFactory {

    public static Cliente convert(ResultSet rs) throws SQLException{
        Cliente cliente = new Cliente();
        cliente.setId(rs.getLong("ID_CLIENTE"));
        cliente.setNome(rs.getString("NOME"));
        cliente.setCpf(rs.getLong("CPF"));
        cliente.setTel(rs.getLong("TEL"));
        cliente.setStatusCivil(rs.getString("STATUS_CIVIL"));
        cliente.setEnd(rs.getString("ENDERECO"));
        cliente.setNumero(rs.getInt("NUMERO"));
        cliente.setCidade(rs.getString("CIDADE"));
        cliente.setEstado(rs.getString("ESTADO"));
        return cliente;
    }
}
