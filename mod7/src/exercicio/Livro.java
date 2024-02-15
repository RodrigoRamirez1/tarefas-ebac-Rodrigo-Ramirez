package exercicio;

public class Livro {
    public String nome;
    private String autor;
    public int ano;
    public int numeroPagina;

    private int paginaAtual = 1;


    //método que altera página atual
    public void proximaPagina(){
        if (paginaAtual < numeroPagina){
            paginaAtual++;
        }
    }
    //método que mostra página atual
    public int getPaginaAtual(){
        return paginaAtual;
    }

    //método de cadastro do autor do livro
    public void cadastrarAutor(String autor){
        this.autor = autor;
    }
}
