package mod6.grupal5.service;

import mod6.grupal5.dao.AdministrativoDAO;
import mod6.grupal5.modelo.dto.Administrativo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrativoService {
    AdministrativoDAO administrativoDAO;

    public AdministrativoService(AdministrativoDAO administrativoDAO) {
        this.administrativoDAO = administrativoDAO;
    }

    public List<Administrativo> findAll() {
        List<Administrativo> administrativoDTOList = administrativoDAO.findAll();
        return administrativoDTOList;
    }

    public Administrativo findOne(int id) {
        return administrativoDAO.findById(id);
    }

    public boolean create(Administrativo a) {
        return administrativoDAO.create(a);
    }

    public boolean update(Administrativo a) {
        return administrativoDAO.update(a);
    }

    public boolean delete(int id) {
        return administrativoDAO.delete(id);
    }
}
