package br.com.rramirez;

import br.com.rramirez.dao.IProdutoDAO;
import br.com.rramirez.dao.ProdutoDaoMock;
import br.com.rramirez.domain.Produto;
import br.com.rramirez.exceptions.DAOException;
import br.com.rramirez.exceptions.TipoChaveNaoEncontradaException;
import br.com.rramirez.services.IProdutoService;
import br.com.rramirez.services.ProdutoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class ProdutoServiceTest {
    private IProdutoService produtoService;

    private Produto produto;

    public ProdutoServiceTest() {
        IProdutoDAO dao = new ProdutoDaoMock();
        produtoService = new ProdutoService(dao);
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Produto 1");
        produto.setNome("Produto 1");
        produto.setMarca("Marca 1");
        produto.setValor(BigDecimal.TEN);
    }

    @Test
    public void pesquisar() throws DAOException {
        Produto produtor = this.produtoService.consultar(produto.getCodigo());
        Assert.assertNotNull(produtor);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = produtoService.cadastrar(produto);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluir() throws DAOException {
        produtoService.excluir(produto.getCodigo());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        produto.setNome("Rodrigo");
        produtoService.alterar(produto);

        Assert.assertEquals("Rodrigo", produto.getNome());
    }
}
