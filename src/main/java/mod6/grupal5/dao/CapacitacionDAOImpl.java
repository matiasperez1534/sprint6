package mod6.grupal5.dao;

import mod6.grupal5.mapper.CapacitacionMapper;
import mod6.grupal5.modelo.dto.Capacitacion;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component

public class CapacitacionDAOImpl implements CapacitacionDAO {
    JdbcTemplate jdbcTemplate;

    public CapacitacionDAOImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /*@Override
    public Capacitacion findById(int id) {
        return jdbcTemplate.queryForObject("select Capacitacion_id, first_name, last_name from Capacitacion where Capacitacion_id = ?",
                new Object[] { id }, new CapacitacionMapper());
    }*/

    @Override
    public Capacitacion findById(int id) {
        return null;
    }

    @Override
    public List<Capacitacion> findAll() {
        return jdbcTemplate.query("select id,nombre, detalle,fecha,hora,lugar,duracion,cantidad from Capacitacion", new CapacitacionMapper());
    }

    @Override
    public boolean create(Capacitacion c) {

        return jdbcTemplate.update("insert into capacitacion (nombre,detalle,fecha,hora,lugar,duracion,cantidad) values (?,?,?,?,?,?,?)",
                c.getNombre(), c.getDetalle(), c.getFecha(), c.getHora(),
                c.getLugar(), c.getDuracion(), c.getCantidad()) > 0;
    }

    @Override
    public boolean update(Capacitacion c) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }


   /* @Override
    public boolean update(Capacitacion a) {
        return jdbcTemplate.update("update Capacitacion set first_name = ?, last_name = ? where Capacitacion_id = ?", a.getFirstName(),
                a.getLastName(), a.getId()) > 0;
    }*/

    /*@Override
    public boolean delete(int id) {
        return jdbcTemplate.update("delete from Capacitacion where Capacitacion_id = ?", id) > 0;
    }*/
}


