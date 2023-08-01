package mod6.grupal5.dao;

import mod6.grupal5.modelo.dto.Administrativo;

import java.util.List;

public interface AdministrativoDAO {

    public Administrativo findById(int id);
    public List<Administrativo> findAll();
    public boolean create( Administrativo a);
    public boolean update( Administrativo a);
    public boolean delete(int id);
}
