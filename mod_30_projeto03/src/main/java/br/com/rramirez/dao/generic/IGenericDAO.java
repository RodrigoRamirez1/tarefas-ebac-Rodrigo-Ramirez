package br.com.rramirez.dao.generic;

import br.com.rramirez.dao.Persistente;
import br.com.rramirez.exceptions.DAOException;
import br.com.rramirez.exceptions.MaisDeUmRegistroException;
import br.com.rramirez.exceptions.TableException;
import br.com.rramirez.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericDAO <T extends Persistente, E extends Serializable> {
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;
    public void excluir(E valor) throws DAOException;
    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;
    public Collection<T> buscarTodos() throws DAOException;

}
