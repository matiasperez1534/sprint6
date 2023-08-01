package mod6.grupal5.service;

import mod6.grupal5.dao.UsuarioDAO;
import mod6.grupal5.modelo.dto.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService {
    UsuarioDAO usuarioDAO;

    public UsuarioService(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public List<Usuario> findAll(){
        List<Usuario> usuarioDTOList = usuarioDAO.findAll();
        return usuarioDTOList;
    }

    public Usuario findOne(int id){
        return usuarioDAO.findById(id);
    }

    public boolean create(Usuario u){
        return usuarioDAO.create(u);
    }

    public boolean update(Usuario u){
        return usuarioDAO.update(u);
    }
    public boolean delete(int id){
        return usuarioDAO.delete(id);
    }
}
