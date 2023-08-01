package mod6.grupal5.mapper;

import mod6.grupal5.modelo.dto.Administrativo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdministrativoMapper implements RowMapper<Administrativo> {

    @Override
    public Administrativo mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Administrativo(rs.getInt("id"), rs.getString("run"),
                rs.getString("nombre"), rs.getString("apellido"),
                rs.getString("correo"), rs.getString("area"));
    }
}
