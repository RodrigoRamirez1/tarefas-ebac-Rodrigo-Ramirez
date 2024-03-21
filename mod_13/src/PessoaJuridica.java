import java.time.LocalDate;

public class PessoaJuridica extends Pessoa{
    private long cnpj;
    private LocalDate dataAbertura;



    public PessoaJuridica(String nome, long cnpj, LocalDate dataAbertura, String endereco, int telefone){
        this.nome = nome;
        this.cnpj = cnpj;
        this.dataAbertura = dataAbertura;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\n Pessoa Jurídica {\n" +
                " Razão Social: '" + nome + '\'' +
                " \n CNPJ: " + cnpj +
                " \n Data de Abertura: " + dataAbertura +
                " \n Endereço: '" + endereco + '\'' +
                " \n Telefone: " + telefone +
                " \n Data do Registro: " + dataRegistro +
                '}';
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
