package rramirez;

import br.com.rramirez.dao.IProdutoDAO;
import br.com.rramirez.dao.ProdutoDAO;
import br.com.rramirez.domain.Produto;
import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {
    private IProdutoDAO produtoDAO;

    public ProdutoTest(){
        produtoDAO = new ProdutoDAO();
    }

    @Test
    public void cadastrar(){
        Produto produto = new Produto();
        produto.setNome("Morango");
        produto.setCodigo("25");
        produto.setValor(8.00);
        produtoDAO.cadastrar(produto);

        Assert.assertNotNull(produto);
        Assert.assertNotNull(produto.getId());
    }
}
