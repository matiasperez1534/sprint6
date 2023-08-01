package mod6.grupal5.dao;

import mod6.grupal5.mapper.ClienteMapper;
import mod6.grupal5.modelo.dto.Cliente;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class ClienteDAOImpl implements ClienteDAO {
    JdbcTemplate jdbcTemplate;

    public ClienteDAOImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Cliente findById(int id) {
        return null;
    }

    @Override
    public List<Cliente> findAll() {
        return jdbcTemplate.query("select id, rut, nombre, apellido, correo, telefono, afp, sistema_salud, direccion, comuna, edad from cliente", new ClienteMapper());
    }

    @Override
    public boolean create(Cliente c) {
        return jdbcTemplate.update("insert into cliente (rut, nombre, apellido, correo, telefono, afp, sistema_salud, direccion, comuna, edad)" +
                        " values (?,?,?,?,?,?,?,?,?,?)"
                , c.getRut(), c.getNombre(), c.getApellido(), c.getCorreo(), c.getTelefono()
                , c.getAfp(), c.getSistema_salud(), c.getDireccion(),
                c.getComuna(), c.getEdad()) > 0;
    }

    @Override
    public boolean update(Cliente c) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
