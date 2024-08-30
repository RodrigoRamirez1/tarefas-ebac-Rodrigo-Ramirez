package br.com.rramirez.dao;
import br.com.rramirez.dao.generic.GenericDAO;
import br.com.rramirez.domain.Venda;
import br.com.rramirez.domain.Venda.Status;
import br.com.rramirez.exceptions.TipoChaveNaoEncontradaException;
public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

    @Override
    public Class<Venda> getTipoClasse() {
        return Venda.class;
    }

    @Override
    public void atualiarDados(Venda entity, Venda entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setStatus(entity.getStatus());
    }

    @Override
    public void excluir(String valor) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
        venda.setStatus(Status.CONCLUIDA);
        super.alterar(venda);
    }



}
