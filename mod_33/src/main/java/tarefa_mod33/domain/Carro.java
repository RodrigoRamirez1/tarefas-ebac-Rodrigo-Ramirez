package tarefa_mod33.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_CARRO")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private Long codigo;
    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;
    @Column(name = "COR", length = 20, nullable = false)
    private String cor;
    @Column(name = "ANO", length = 4, nullable = false)
    private Integer ano;

    @ManyToOne
    @JoinColumn(name = "id_marca_fk",
            foreignKey = @ForeignKey(name = "fk_marca_carro"),
            referencedColumnName = "id", nullable = false)
    private Marca marca;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "TB_CARRO_ACESSORIO",
        joinColumns = {@JoinColumn(name = "id_carro_fk")},
        inverseJoinColumns = {@JoinColumn(name = "id_acessorio_fk")})
    private List<Acessorio> acessorios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }
    public void add(Acessorio acess) {
        if(this.acessorios == null){
            this.acessorios = new ArrayList<>();
        }
        this.acessorios.add(acess);
    }
}
