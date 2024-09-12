package tarefa_mod33;

import org.junit.Assert;
import org.junit.Test;
import tarefa_mod33.dao.*;
import tarefa_mod33.domain.Acessorio;
import tarefa_mod33.domain.Carro;
import tarefa_mod33.domain.Marca;

import java.util.ArrayList;
import java.util.List;

public class CarroTest {

    private ICarroDAO carroDAO;
    private IMarcaDAO marcaDAO;
    private IAcessorioDAO acessorioDAO;

    public CarroTest(){
        carroDAO = new CarroDAO();
        marcaDAO = new MarcaDAO();
        acessorioDAO = new AcessorioDAO();
    }

    @Test
    public void cadastrar(){
        Marca marca = criarMarca(1001L);
        Acessorio acess1 = criarAcessorio(9001L, "Banco");
        Acessorio acess2 = criarAcessorio(9002L, "Airbag");
        Acessorio acess3 = criarAcessorio(9003L, "GPS");

        Carro carro1 = new Carro();
        carro1.setCodigo(54L);
        carro1.setNome("Gol");
        carro1.setAno(2012);
        carro1.setCor("Preto");
        carro1.setMarca(marca);

        carro1.add(acess1);
        carro1.add(acess2);
        carro1.add(acess3);

        carroDAO.cadastrar(carro1);
        Assert.assertNotNull(carro1);
        Assert.assertNotNull(carro1.getId());

    }

    private Acessorio criarAcessorio(Long  codigo, String nome) {
        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo(codigo);
        acessorio.setNome(nome);
        return acessorio;
    }

    private Marca criarMarca(Long codigo) {
        Marca marca = new Marca();
        marca.setCodigo(codigo);
        marca.setNome("Volkswagen");
        return marcaDAO.cadastrar(marca);
    }


}
