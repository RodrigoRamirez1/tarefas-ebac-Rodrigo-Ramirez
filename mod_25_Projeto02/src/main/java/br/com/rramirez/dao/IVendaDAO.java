package br.com.rramirez.dao;

import br.com.rramirez.dao.generic.IGenericDAO;
import br.com.rramirez.domain.Venda;
import br.com.rramirez.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
