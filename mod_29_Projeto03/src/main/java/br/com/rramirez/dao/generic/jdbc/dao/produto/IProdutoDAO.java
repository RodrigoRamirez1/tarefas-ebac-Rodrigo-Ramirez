package br.com.rramirez.dao.generic.jdbc.dao.produto;

import br.com.rramirez.domain.Cliente;
import br.com.rramirez.domain.Produto;

import java.util.List;

public interface IProdutoDAO {
    public Integer cadastrar(Produto produto) throws Exception;
    public Integer atualizar(Produto produto) throws Exception;
    public Produto buscar(Integer codigo) throws Exception;
    public List<Produto> buscarTodos() throws Exception;
    public Integer excluir(Produto produto) throws Exception;
}
