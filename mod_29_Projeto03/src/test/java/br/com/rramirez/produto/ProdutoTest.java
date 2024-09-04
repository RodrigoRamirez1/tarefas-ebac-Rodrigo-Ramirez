package br.com.rramirez.produto;

import br.com.rramirez.dao.generic.jdbc.dao.cliente.ClienteDAO;
import br.com.rramirez.dao.generic.jdbc.dao.produto.IProdutoDAO;
import br.com.rramirez.dao.generic.jdbc.dao.produto.ProdutoDAO;
import br.com.rramirez.domain.Cliente;
import br.com.rramirez.domain.Produto;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class ProdutoTest {
    private IProdutoDAO produtoDAO;

    @Test
    public void cadastrarProdutoTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setNome("Arroz");
        produto.setCodigo(111);
        produto.setValor(7.90);
        Integer countPro = produtoDAO.cadastrar(produto);
        Assert.assertTrue(countPro == 1);

        Produto produtoBD = produtoDAO.buscar(111);
        Assert.assertNotNull(produtoBD);
        Assert.assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        Assert.assertEquals(produto.getNome(), produtoBD.getNome());
        Assert.assertEquals(produto.getValor(), produtoBD.getValor());

        Integer countDel = produtoDAO.excluir(produtoBD);
        Assert.assertTrue(countDel == 1);
    }

    @Test
    public void buscarTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo(741);
        produto.setNome("Laranja");
        Integer countCad = produtoDAO.cadastrar(produto);
        Assert.assertTrue(countCad == 1);

        Produto produtoBD = produtoDAO.buscar(741);
        Assert.assertNotNull(produtoBD);
        Assert.assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        Assert.assertEquals(produto.getNome(), produtoBD.getNome());

        Integer countDel = produtoDAO.excluir(produtoBD);
        Assert.assertTrue(countDel == 1);
    }

    @Test
    public void excluirTest() throws Exception{
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setNome("Arroz");
        produto.setCodigo(111);
        produto.setValor(7.90);
        Integer countPro = produtoDAO.cadastrar(produto);
        Assert.assertTrue(countPro == 1);

        Produto produtoBD = produtoDAO.buscar(111);
        Assert.assertNotNull(produtoBD);
        Assert.assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        Assert.assertEquals(produto.getNome(), produtoBD.getNome());
        Assert.assertEquals(produto.getValor(), produtoBD.getValor());

        Integer countDel = produtoDAO.excluir(produtoBD);
        Assert.assertTrue(countDel == 1);
    }

    @Test
    public void buscarTodosTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo(753);
        produto.setNome("Morango");
        produto.setValor(8.00);
        Integer countCad = produtoDAO.cadastrar(produto);
        Assert.assertTrue(countCad == 1);

        Produto produto1 = new Produto();
        produto1.setCodigo(852);
        produto1.setNome("Banana");
        produto1.setValor(9.00);
        Integer countCad2 = produtoDAO.cadastrar(produto1);
        Assert.assertTrue(countCad2 == 1);

        List<Produto> list = produtoDAO.buscarTodos();
        Assert.assertNotNull(list);
        Assert.assertEquals(2, list.size());

        int countDel = 0;
        for (Produto pro : list) {
            produtoDAO.excluir(pro);
            countDel++;
        }
        Assert.assertEquals(list.size(), countDel);

        list = produtoDAO.buscarTodos();
        Assert.assertEquals(list.size(), 0);
    }

    @Test
    public void atualizarTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo(10);
        produto.setNome("Leite");
        produto.setValor(5.00);
        Integer countCad = produtoDAO.cadastrar(produto);
        Assert.assertTrue(countCad == 1);

        Produto produtoBD = produtoDAO.buscar(10);
        Assert.assertNotNull(produtoBD);
        Assert.assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        Assert.assertEquals(produto.getNome(), produtoBD.getNome());
        Assert.assertEquals(produto.getValor(), produtoBD.getValor());

        produtoBD.setCodigo(20);
        produtoBD.setNome("Leite Zero");
        produtoBD.setValor(6.00);
        Integer countUpdate = produtoDAO.atualizar(produtoBD);
        Assert.assertTrue(countUpdate == 1);

        Produto produtoBD1 = produtoDAO.buscar(10);
        Assert.assertNull(produtoBD1);

        Produto produtoBD2 = produtoDAO.buscar(20);
        Assert.assertNotNull(produtoBD2);
        Assert.assertEquals(produtoBD.getCodigo(), produtoBD2.getCodigo());
        Assert.assertEquals(produtoBD.getNome(), produtoBD2.getNome());
        Assert.assertEquals(produtoBD.getValor(), produtoBD2.getValor());

        List<Produto> list = produtoDAO.buscarTodos();
        for (Produto pro : list) {
            produtoDAO.excluir(pro);
        }
    }
}
