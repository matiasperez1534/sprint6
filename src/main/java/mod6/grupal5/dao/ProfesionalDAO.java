package mod6.grupal5.dao;

import mod6.grupal5.modelo.dto.Profesional;

import java.util.List;

public interface ProfesionalDAO {

    public Profesional findById(int id);

    public List<Profesional> findAll();

    public boolean create(Profesional p);

    public boolean update(Profesional p);

    public boolean delete(int id);

}
