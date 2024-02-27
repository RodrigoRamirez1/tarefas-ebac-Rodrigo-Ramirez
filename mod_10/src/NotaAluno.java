import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Valor Nota1:");
        float nota1 = n.nextFloat();

        System.out.println("Valor Nota2:");
        float nota2 = n.nextFloat();

        System.out.println("Valor Nota3:");
        float nota3 = n.nextFloat();

        System.out.println("Valor Nota4:");
        float nota4 = n.nextFloat();

        float media = somarNotas(nota1,nota2,nota3,nota4);
        situacaoAluno(media);


    }

    public static float somarNotas(float n1, float n2, float n3, float n4){
        return (n1+n2+n3+n4)/4;
    }

    public static void situacaoAluno(float media){
        if(media >= 7){
            System.out.println("Média do aluno = " + media + " Siuação: Aprovado!");
        } else if (media >= 5) {
            System.out.println("Média do aluno = " + media + " Situação: Recuperação");
        } else {
            System.out.println("Média do aluno = " + media + " Siuação: Reprovado");
        }
    }
}
