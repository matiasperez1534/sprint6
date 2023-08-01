package mod6.grupal5.service;

import mod6.grupal5.dao.CapacitacionDAO;
import mod6.grupal5.modelo.dto.Capacitacion;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class CapacitacionService {
    CapacitacionDAO capacitacionDAO;

    public CapacitacionService(CapacitacionDAO capacitacionDAO) {
        this.capacitacionDAO = capacitacionDAO;
    }

    public List<Capacitacion> findAll(){
        List<Capacitacion> capacitacionDTOList = capacitacionDAO.findAll();
        return capacitacionDTOList;
    }

    public Capacitacion findOne(int id){
        return capacitacionDAO.findById(id);
    }

    public boolean create(Capacitacion c){
        return capacitacionDAO.create(c);
    }

    public boolean update(Capacitacion c){
        return capacitacionDAO.update(c);
    }
    public boolean delete(int id){
        return capacitacionDAO.delete(id);
    }
}
