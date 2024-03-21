import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;

public class Cadastro {
    public static void main(String[] args) {
      PessoaFisica cliente1 = cadastroPessoaFisica(
              "David Fla",
              LocalDate.parse("1990-10-10"),
              "masculino",
              8888,
              "São José-SC",
              489_887_855);

      PessoaJuridica empresa1 = criarPessoaJuridica(
              "Rami Shop",
              899000147l,
              LocalDate.parse("2022-02-02"),
              "Florianópolis-SC",
              489774584);


        System.out.println(cliente1);
        System.out.println(empresa1);

    }

    private static PessoaJuridica criarPessoaJuridica(
            String nome,
            long cnpj,
            LocalDate dataAbertura,
            String endereco,
            int telefone) {
            return new PessoaJuridica(nome, cnpj, dataAbertura, endereco, telefone);

    };

    private static PessoaFisica cadastroPessoaFisica(
            String nome,
            LocalDate dataNascimento,
            String genero,
            long cpf,
            String endereco,
            int telefone) {
            return new PessoaFisica(nome, dataNascimento, genero, cpf, endereco, telefone);

    };
}
