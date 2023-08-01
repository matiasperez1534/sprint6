package mod6.grupal5.service;

import mod6.grupal5.dao.ProfesionalDAO;
import mod6.grupal5.modelo.dto.Profesional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfesionalService {

    ProfesionalDAO profesionalDAO;

    public ProfesionalService(ProfesionalDAO profesionalDAO) {
        this.profesionalDAO = profesionalDAO;
    }

    public List<Profesional> findAll() {
        List<Profesional> profesionalDTOList = profesionalDAO.findAll();
        return profesionalDTOList;
    }

    public Profesional findOne(int id) {
        return profesionalDAO.findById(id);
    }

    public boolean create(Profesional p) {
        return profesionalDAO.create(p);
    }

    public boolean update(Profesional p) {
        return profesionalDAO.update(p);
    }

    public boolean delete(int id) {
        return profesionalDAO.delete(id);
    }

}
