package br.com.rramirez.dao;

import br.com.rramirez.domain.Produto;
import br.com.rramirez.exceptions.DAOException;
import br.com.rramirez.exceptions.MaisDeUmRegistroException;
import br.com.rramirez.exceptions.TableException;
import br.com.rramirez.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ProdutoDaoMock implements IProdutoDAO{
    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(String valor) {

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Produto consultar(String valor) {
        Produto produto = new Produto();
        produto.setCodigo(valor);
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return null;
    }
}
