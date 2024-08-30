package br.com.rramirez.services;

import br.com.rramirez.dao.IProdutoDAO;
import br.com.rramirez.domain.Produto;
import br.com.rramirez.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
