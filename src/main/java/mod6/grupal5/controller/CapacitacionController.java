package mod6.grupal5.controller;

import mod6.grupal5.modelo.dto.Capacitacion;
import mod6.grupal5.service.CapacitacionService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class CapacitacionController {
    Log logger = LogFactory.getLog(CapacitacionController.class);
    private final CapacitacionService service;

    public CapacitacionController(CapacitacionService service) {
        this.service = service;
    }

    @GetMapping("/listarcapacitacion")
    public String ListarCapacitacion(Model model) {
        model.addAttribute("listas", service.findAll());
        return "listarcapacitacion";
    }

    @GetMapping("/crearcapacitacion")
    public String nuevacapacitacion() {
        return "crearcapacitacion";
    }

    @PostMapping("/crearcapacitacion")
    public String crearCapacitacion(@ModelAttribute Capacitacion capacitacion) {
        logger.info(capacitacion.toString());
        boolean ok = service.create(capacitacion);
        if (ok) {
            return "redirect:/listarcapacitacion";
        } else {
            return "error";
        }
    }

}


