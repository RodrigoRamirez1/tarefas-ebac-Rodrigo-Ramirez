package br.com.rramirez.services;

import br.com.rramirez.dao.IClienteDAO;
import br.com.rramirez.domain.Cliente;
import br.com.rramirez.exceptions.DAOException;
import br.com.rramirez.exceptions.MaisDeUmRegistroException;
import br.com.rramirez.exceptions.TableException;
import br.com.rramirez.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        //this.clienteDAO = clienteDAO;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
