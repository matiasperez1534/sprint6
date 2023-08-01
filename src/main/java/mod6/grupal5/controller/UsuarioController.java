package mod6.grupal5.controller;

import mod6.grupal5.modelo.dto.Administrativo;
import mod6.grupal5.modelo.dto.Cliente;
import mod6.grupal5.modelo.dto.Profesional;
import mod6.grupal5.service.AdministrativoService;
import mod6.grupal5.service.ClienteService;
import mod6.grupal5.service.ProfesionalService;
import mod6.grupal5.service.UsuarioService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UsuarioController {

    Log logger = LogFactory.getLog(UsuarioController.class);
    private final UsuarioService service;
    private final AdministrativoService servicea;
    private final ProfesionalService servicep;
    private final ClienteService servicec;

    public UsuarioController(UsuarioService service, AdministrativoService servicea,
                             ProfesionalService servicep, ClienteService servicec) {
        this.service = service;
        this.servicea = servicea;
        this.servicep = servicep;
        this.servicec = servicec;
    }


    /*@GetMapping("/listarusuario")
    public String Listarusuario(Model model) {
        model.addAttribute("listasu", service.findAll());
        return "listarusuario";
    }*/

    @GetMapping("/crearusuario")
    public String crearusuario() {
        return "crearusuario";
    }

    @GetMapping("/crearadministrativo")
    public String crearadministrativo() {
        return "crearadministrativo";
    }

    @PostMapping("/crearadministrativo")
    public String crearAdministrativo(@ModelAttribute Administrativo administrativo) {
        logger.info(administrativo.toString());
        boolean ok = servicea.create(administrativo);
        if (ok) {
            return "redirect:/listarusuario";
        } else {
            return "error";
        }
    }

    @GetMapping("/crearprofesional")
    public String crearprofesional() {
        return "crearprofesional";
    }

    @PostMapping("/crearprofesional")
    public String crearProfesional(@ModelAttribute Profesional profesional) {
        logger.info(profesional.toString());
        boolean ok = servicep.create(profesional);
        if (ok) {
            return "redirect:/listarusuario";
        } else {
            return "error";
        }
    }


    @GetMapping("/crearcliente")
    public String crearcliente() {
        return "crearcliente";
    }

    @PostMapping("/crearcliente")
    public String crearCliente(@ModelAttribute Cliente cliente) {
        logger.info(cliente.toString());
        boolean ok = servicec.create(cliente);
        if (ok) {
            return "redirect:/listarusuario";
        } else {
            return "error";
        }
    }

    @GetMapping("/{adminId}")
    public String getAdmin(
            @PathVariable int adminId,
            Model model){

        logger.info("el admin id es = " + adminId);

        Administrativo administrativo = servicea.findOne(adminId);

        model.addAttribute("admin", administrativo);
        return "editaradministrativo";
    }

    @GetMapping("/listarusuarios")
    public String Listarusuarios() {
        return "listarusuarios";
    }

    @GetMapping("/listaradministrativo")
    public String listaAdministrativo(Model model) {
        model.addAttribute("listaadmin", servicea.findAll());
        return "listaradministrativo";
    }

    @GetMapping("/listarprofesional")
    public String listaProfesional(Model model) {
        model.addAttribute("listapro", servicep.findAll());
        return "listarprofesional";
    }

    @GetMapping("/listarcliente")
    public String listaCliente(Model model) {
        model.addAttribute("listacli", servicec.findAll());
        return "listarcliente";
    }

    @GetMapping("/{adminId}/editaradministrativo")
    public String editarAdmin(@PathVariable int adminId,Model model) {
        model.addAttribute("admin",servicea.findOne(adminId));
        return "editaradministrativo";
    }

    @PostMapping("/editaradministrativo")
    public String actualizarAdm(@ModelAttribute Administrativo administrativo,Model model){
        boolean ok = servicea.update(administrativo);
        if(ok){
            return "redirect:/listaradministrativo";
        }else{
            return "error";
        }
    }

    @GetMapping("/editarprofesional")
    public String editarProf() {
        return "editarprofesional";
    }
    @GetMapping("/editarcliente")
    public String editarCli() {
        return "editarcliente";
    }


}
