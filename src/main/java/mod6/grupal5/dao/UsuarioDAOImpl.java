package mod6.grupal5.dao;

import mod6.grupal5.mapper.UsuarioMapper;
import mod6.grupal5.modelo.dto.Usuario;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class UsuarioDAOImpl implements UsuarioDAO{
    JdbcTemplate jdbcTemplate;

    public UsuarioDAOImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);}

    @Override
    public Usuario findById(int id) {
        return null;
    }

    @Override
    public List<Usuario> findAll() {
        return jdbcTemplate.query("select id,nombre,username,password from usuario", new UsuarioMapper());
    }

    @Override
    public boolean create(Usuario u) {
        return false;
    }

    @Override
    public boolean update(Usuario u) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
