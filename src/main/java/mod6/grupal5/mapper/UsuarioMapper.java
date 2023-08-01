package mod6.grupal5.mapper;

import mod6.grupal5.modelo.dto.Usuario;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioMapper implements RowMapper<Usuario> {
    @Override
    public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Usuario(rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("username")
                , rs.getString("password"));
    }
}
