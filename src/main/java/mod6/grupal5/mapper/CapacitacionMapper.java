package mod6.grupal5.mapper;

import mod6.grupal5.modelo.dto.Capacitacion;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CapacitacionMapper implements RowMapper<Capacitacion> {
@Override
public Capacitacion mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Capacitacion(rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("detalle")
                ,rs.getString("fecha"),
                rs.getString("hora"),
                rs.getString("lugar")
                ,rs.getString("duracion"),
                rs.getInt("cantidad"));
        }

}
