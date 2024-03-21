import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
    private long cpf;
    private LocalDate dataNascimento;
    private String genero;

    public PessoaFisica(String nome, LocalDate dataNascimento, String genero, long cpf, String endereco, int telefone) {
        this.setNome(nome);
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.cpf = cpf;
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }

    @Override
    public String toString() {
        return "\n Pessoa Física {\n" +
                " Nome: '" + nome + '\'' +
                " \n Data de Nascimento: " + dataNascimento +
                " \n CPF: " + cpf +
                " \n Genero: '" + genero + '\'' +
                " \n Telefone: " + telefone +
                " \n Endereço: '" + endereco + '\'' +
                " \n Data do Registro: " + dataRegistro +
                '}';
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
