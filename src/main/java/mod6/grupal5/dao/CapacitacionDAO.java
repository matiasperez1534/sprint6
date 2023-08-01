package mod6.grupal5.dao;

import mod6.grupal5.modelo.dto.Capacitacion;

import java.util.List;

public interface CapacitacionDAO {

    public Capacitacion findById(int id);
    public List<Capacitacion> findAll();
    public boolean create( Capacitacion c);
    public boolean update(Capacitacion c);
    public boolean delete(int id);

}
