package br.com.rramirez.dao;

import br.com.rramirez.domain.Cliente;
import br.com.rramirez.exceptions.DAOException;
import br.com.rramirez.exceptions.MaisDeUmRegistroException;
import br.com.rramirez.exceptions.TableException;
import br.com.rramirez.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ClienteDaoMock implements IClienteDAO{
    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException, DAOException {
        return true;
    }

    @Override
    public void excluir(Long valor) throws DAOException {

    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException, DAOException {

    }

    @Override
    public Cliente consultar(Long valor) throws MaisDeUmRegistroException, TableException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() throws DAOException {
        return null;
    }
}
