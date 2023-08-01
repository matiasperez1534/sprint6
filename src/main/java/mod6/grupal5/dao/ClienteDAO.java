package mod6.grupal5.dao;

import mod6.grupal5.modelo.dto.Cliente;

import java.util.List;

public interface ClienteDAO {
    public Cliente findById(int id);

    public List<Cliente> findAll();

    public boolean create(Cliente c);

    public boolean update(Cliente c);

    public boolean delete(int id);
}
