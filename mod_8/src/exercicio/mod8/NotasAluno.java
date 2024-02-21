package exercicio.mod8;

public class NotasAluno {

    public static int calcularMedia(int a, int b, int c, int d){
        int media = (a + b + c + d)/4;
        return  media;

    }

    public static void main(String[] args) {
        int mediaAluno = calcularMedia(7,9, 6, 10);

        System.out.println("A média do aluno é : " + mediaAluno);
    }
}
