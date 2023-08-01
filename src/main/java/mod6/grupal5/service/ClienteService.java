package mod6.grupal5.service;

import mod6.grupal5.dao.ClienteDAO;
import mod6.grupal5.modelo.dto.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    ClienteDAO clienteDAO;

    public ClienteService(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public List<Cliente> findAll() {
        List<Cliente> clienteDTOList = clienteDAO.findAll();
        return clienteDTOList;
    }

    public Cliente findOne(int id) {
        return clienteDAO.findById(id);
    }

    public boolean create(Cliente c) {
        return clienteDAO.create(c);
    }

    public boolean update(Cliente c) {
        return clienteDAO.update(c);
    }

    public boolean delete(int id) {
        return clienteDAO.delete(id);
    }
}
