package exercicio.mod9;

public class Funcionario {
    int codigo;
    String nome;
    long cpf;
    int data;
    double salario;

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.salario = 4500.00;

        System.out.println("Tipo Primitivo " + funcionario1.salario);

        funcionario1.salario = new Double(5000.00);
        System.out.println("Wrapper "+ funcionario1.salario);

    }

}
