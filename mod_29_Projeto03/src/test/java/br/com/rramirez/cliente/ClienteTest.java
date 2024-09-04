package br.com.rramirez.cliente;

import br.com.rramirez.dao.generic.jdbc.dao.cliente.ClienteDAO;
import br.com.rramirez.dao.generic.jdbc.dao.cliente.IClienteDAO;
import br.com.rramirez.domain.Cliente;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ClienteTest {


    private IClienteDAO clienteDAO;


    @Test
    public void cadastrarTest() throws Exception {
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("789");
        cliente.setNome("Rodrigo Ramirez");
        Integer countCad = clienteDAO.cadastrar(cliente);
        Assert.assertTrue(countCad == 1);

        Cliente clienteBD = clienteDAO.buscar("789");
        Assert.assertNotNull(clienteBD);
        Assert.assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        Assert.assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer countDel = clienteDAO.excluir(clienteBD);
        Assert.assertTrue(countDel == 1);
    }

    @Test
    public void buscarTest() throws Exception {
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("741");
        cliente.setNome("Rodrigo");
        Integer countCad = clienteDAO.cadastrar(cliente);
        Assert.assertTrue(countCad == 1);

        Cliente clienteBD = clienteDAO.buscar("741");
        Assert.assertNotNull(clienteBD);
        Assert.assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        Assert.assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer countDel = clienteDAO.excluir(clienteBD);
        Assert.assertTrue(countDel == 1);
    }

    @Test
    public void excluirTest() throws Exception {
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("78");
        cliente.setNome("Rodrigo Ramirez");
        Integer countCad = clienteDAO.cadastrar(cliente);
        Assert.assertTrue(countCad == 1);

        Cliente clienteBD = clienteDAO.buscar("78");
        Assert.assertNotNull(clienteBD);
        Assert.assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        Assert.assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer countDel = clienteDAO.excluir(clienteBD);
        Assert.assertTrue(countDel == 1);
    }

    @Test
    public void buscarTodosTest() throws Exception {
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("753");
        cliente.setNome("Rodrigo P");
        Integer countCad = clienteDAO.cadastrar(cliente);
        Assert.assertTrue(countCad == 1);

        Cliente clientes = new Cliente();
        clientes.setCodigo("852");
        clientes.setNome("Ramon");
        Integer countCad2 = clienteDAO.cadastrar(clientes);
        Assert.assertTrue(countCad2 == 1);

        List<Cliente> list = clienteDAO.buscarTodos();
        Assert.assertNotNull(list);
        Assert.assertEquals(2, list.size());

        int countDel = 0;
        for (Cliente cli : list) {
            clienteDAO.excluir(cli);
            countDel++;
        }
        Assert.assertEquals(list.size(), countDel);

        list = clienteDAO.buscarTodos();
        Assert.assertEquals(list.size(), 0);

    }

    @Test
    public void atualizarTest() throws Exception {
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("10");
        cliente.setNome("Rodrigo Pires");
        Integer countCad = clienteDAO.cadastrar(cliente);
        Assert.assertTrue(countCad == 1);

        Cliente clienteBD = clienteDAO.buscar("10");
        Assert.assertNotNull(clienteBD);
        Assert.assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        Assert.assertEquals(cliente.getNome(), clienteBD.getNome());

        clienteBD.setCodigo("20");
        clienteBD.setNome("Outro nome");
        Integer countUpdate = clienteDAO.atualizar(clienteBD);
        Assert.assertTrue(countUpdate == 1);

        Cliente clienteBD1 = clienteDAO.buscar("10");
        Assert.assertNull(clienteBD1);

        Cliente clienteBD2 = clienteDAO.buscar("20");
        Assert.assertNotNull(clienteBD2);
        Assert.assertEquals(clienteBD.getCodigo(), clienteBD2.getCodigo());
        Assert.assertEquals(clienteBD.getNome(), clienteBD2.getNome());

        List<Cliente> list = clienteDAO.buscarTodos();
        for (Cliente cli : list) {
            clienteDAO.excluir(cli);
        }
    }
}
