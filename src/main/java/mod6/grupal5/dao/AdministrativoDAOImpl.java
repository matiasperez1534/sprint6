package mod6.grupal5.dao;

import mod6.grupal5.mapper.AdministrativoMapper;
import mod6.grupal5.modelo.dto.Administrativo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class AdministrativoDAOImpl implements AdministrativoDAO {

    JdbcTemplate jdbcTemplate;

    public AdministrativoDAOImpl(DataSource dataSource) {

        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public Administrativo findById(int id) {
        return null;
    }

    @Override
    public List<Administrativo> findAll() {
        return jdbcTemplate.query("select id,run,nombre,apellido,correo,area from administrativo", new AdministrativoMapper());
    }

    @Override
    public boolean create(Administrativo a) {
        return jdbcTemplate.update("insert into administrativo (run,nombre,apellido,correo,area) values (?,?,?,?,?)",
                a.getRun(),a.getNombre(), a.getApellido(), a.getCorreo(), a.getArea()) > 0;
    }

    @Override
    public boolean update(Administrativo a) {
        return jdbcTemplate.update("update administrativo set run = ?,nombre = ?, apellido = ?,correo = ?, area = ? where id = ?",
                a.getRun(),a.getNombre(),a.getApellido(),a.getCorreo(),a.getArea(),a.getId()) > 0;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
