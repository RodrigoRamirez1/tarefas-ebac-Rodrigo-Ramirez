package br.com.rramirez.services;

import br.com.rramirez.domain.Cliente;
import br.com.rramirez.exceptions.DAOException;
import br.com.rramirez.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {
    Cliente buscarPorCPF(Long cpf) throws DAOException;
}
