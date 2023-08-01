package mod6.grupal5.dao;

import mod6.grupal5.mapper.ProfesionalMapper;
import mod6.grupal5.modelo.dto.Profesional;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class ProfesionalDAOImpl implements ProfesionalDAO {
    JdbcTemplate jdbcTemplate;

    public ProfesionalDAOImpl(DataSource dataSource) {
        this.jdbcTemplate =
                new JdbcTemplate(dataSource);
    }

    @Override
    public Profesional findById(int id) {
        return null;
    }

    @Override
    public List<Profesional> findAll() {

        return jdbcTemplate.query("select id,run,nombre,apellido,correo,telefono, cargo from profesional", new ProfesionalMapper());
    }

    @Override
    public boolean create(Profesional p) {
        return jdbcTemplate.update("insert into profesional (run,nombre,apellido,correo,telefono,cargo) values (?,?,?,?,?,?)"
                ,p.getRun(),p.getNombre(),p.getApellido(),p.getCorreo(), p.getTelefono()
                ,p.getCargo())>0;
    }

    @Override
    public boolean update(Profesional p) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
