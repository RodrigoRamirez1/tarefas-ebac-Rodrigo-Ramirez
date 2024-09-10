package br.com.rramirez;

import br.com.rramirez.dao.IMatriculaDAO;
import br.com.rramirez.dao.MatriculaDAO;
import br.com.rramirez.domain.Matricula;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;

public class MatriculaTest {
    private IMatriculaDAO matriculaDAO;
    public MatriculaTest(){
        matriculaDAO = new MatriculaDAO();
    }

    @Test
    public void cadastrar(){
        Matricula matricula = new Matricula();
        matricula.setCodigo("888");
        matricula.setDataMatricula(Instant.now());
        matricula.setStatus("ATIVA");
        matricula.setValor(3500D);
        matriculaDAO.cadastrar(matricula);

        Assert.assertNotNull(matricula);
        Assert.assertNotNull(matricula.getId());

    }
}
