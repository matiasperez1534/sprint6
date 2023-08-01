package mod6.grupal5.dao;

import mod6.grupal5.modelo.dto.Usuario;

import java.util.List;

public interface UsuarioDAO {

    public Usuario findById(int id);
    public List<Usuario> findAll();
    public boolean create( Usuario u);
    public boolean update(Usuario u);
    public boolean delete(int id);

}
