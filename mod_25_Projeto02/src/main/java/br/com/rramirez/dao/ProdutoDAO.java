package br.com.rramirez.dao;
import br.com.rramirez.dao.generic.GenericDAO;
import br.com.rramirez.domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO, Persistente {

    public ProdutoDAO() {
        super();
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualiarDados(Produto entity, Produto entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setDescricao(entity.getDescricao());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setValor(entity.getValor());
    }

}
