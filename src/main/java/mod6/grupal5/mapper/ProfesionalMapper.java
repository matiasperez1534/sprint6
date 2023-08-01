package mod6.grupal5.mapper;

import mod6.grupal5.modelo.dto.Profesional;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfesionalMapper implements RowMapper<Profesional> {

    @Override
    public Profesional mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Profesional(rs.getInt("id"),rs.getString("run"),
                rs.getString("nombre"),rs.getString("apellido"),
                rs.getString("correo"),rs.getString("telefono"),
                rs.getString("cargo"));
    }
}
