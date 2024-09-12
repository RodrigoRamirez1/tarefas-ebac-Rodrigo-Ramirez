package rramirez;

import br.com.rramirez.dao.CursoDAO;
import br.com.rramirez.dao.ICursoDAO;
import br.com.rramirez.domain.Curso;
import org.junit.Assert;
import org.junit.Test;

public class CursoTest {
    private ICursoDAO cursoDAO;
    public CursoTest(){
        cursoDAO = new CursoDAO();
    }

    @Test
    public void cadastrar(){
        Curso curso = new Curso();
        curso.setCodigo("100");
        curso.setNome("Python");
        curso.setDescricao("Avançado");
        cursoDAO.cadastrar(curso);

        Assert.assertNotNull(curso);
        Assert.assertNotNull(curso.getId());
    }
}
