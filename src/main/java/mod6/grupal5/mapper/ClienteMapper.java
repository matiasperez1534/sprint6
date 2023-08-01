package mod6.grupal5.mapper;

import mod6.grupal5.modelo.dto.Cliente;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteMapper implements RowMapper<Cliente> {
    @Override
    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Cliente(rs.getInt("id"), rs.getString("rut"),
                rs.getString("nombre"), rs.getString("apellido"),
                rs.getString("correo"), rs.getString("telefono"),
                rs.getString("afp"), rs.getString("sistema_salud"),
                rs.getString("direccion"), rs.getString("comuna"),
                rs.getInt("edad"));
    }
}
