package dao;

public class ContratoDao implements IContratoDao{
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Não consegue buscar sem config Bando de Dados");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não consegue excluir sem config de banco de dados");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não atualiza sem config de banco de dados");
    }
}
