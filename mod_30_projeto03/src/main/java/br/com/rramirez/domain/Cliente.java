package br.com.rramirez.domain;

import anotacao.ColunaTabela;
import anotacao.Tabela;
import anotacao.TipoChave;
import br.com.rramirez.dao.Persistente;

@Tabela("TB_CLIENTE")
public class Cliente implements Persistente {
    @ColunaTabela(dbName = "id", setJavaName = "setId")
    private Long id;
    @ColunaTabela(dbName = "nome", setJavaName = "setNome")
    private String nome;
    @TipoChave("getCpf")
    @ColunaTabela(dbName = "cpf", setJavaName = "setCpf")
    private Long cpf;
    @ColunaTabela(dbName = "statusCivil", setJavaName = "setStatusCivil")
    private String statusCivil;
    @ColunaTabela(dbName = "tel", setJavaName = "setTel")
    private Long tel;
    @ColunaTabela(dbName = "end", setJavaName = "setEnd")
    private String end;
    @ColunaTabela(dbName = "numero", setJavaName = "setNumero")
    private Integer numero;
    @ColunaTabela(dbName = "cidade", setJavaName = "setCidade")
    private String cidade;
    @ColunaTabela(dbName = "estado", setJavaName = "setEstado")
    private String estado;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getStatusCivil() {
        return statusCivil;
    }

    public void setStatusCivil(String statusCivil) {
        this.statusCivil = statusCivil;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId(Long id) {

    }
}
