package rramirez;

import br.com.rramirez.dao.*;
import br.com.rramirez.domain.Aluno;
import br.com.rramirez.domain.Curso;
import br.com.rramirez.domain.Matricula;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;

public class MatriculaTest {
    private IMatriculaDAO matriculaDAO;
    private ICursoDAO cursoDAO;

    private IAlunoDAO alunoDAO;
    public MatriculaTest(){
        matriculaDAO = new MatriculaDAO();
        cursoDAO = new CursoDAO();
        alunoDAO = new AlunoDAO();
    }

    @Test
    public void cadastrar(){
        Curso curso = criarCurso("789");
        Aluno aluno = criarAluno("1010");

        Matricula matricula = new Matricula();
        matricula.setCodigo("888");
        matricula.setDataMatricula(Instant.now());
        matricula.setStatus("ATIVA");
        matricula.setValor(3500D);
        matricula.setCurso(curso);
        matricula.setAluno(aluno);
        aluno.setMatricula(matricula);
        matriculaDAO.cadastrar(matricula);

        Assert.assertNotNull(matricula);
        Assert.assertNotNull(matricula.getId());

    }

    private Aluno criarAluno(String codigo) {
        Aluno aluno = new Aluno();
        aluno.setCodigo(codigo);
        aluno.setNome("Rodrigo Ramirez");
        return alunoDAO.cadastrar(aluno);
    }

    public Curso criarCurso(String codigo){
        Curso curso = new Curso();
        curso.setCodigo(codigo);
        curso.setNome("Java");
        curso.setDescricao("Iniciante");
        return cursoDAO.cadastrar(curso);
    }
}
