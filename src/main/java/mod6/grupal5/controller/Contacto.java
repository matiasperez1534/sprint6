package mod6.grupal5.controller;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class Contacto {
    Log logger = LogFactory.getLog(Contacto.class);
    @GetMapping("/contacto")
    public String mostrarContacto(){
        return "contacto";
    }
    @PostMapping("/contacto")
    public String mostrarContacto(@RequestParam("nombre") String nombre,
    @RequestParam("correo") String correo,@RequestParam("mensaje") String mensaje) {
        System.out.println("nombre "+ nombre);
        System.out.println("correo "+ correo);
        System.out.println("mensaje "+ mensaje);
        logger.info("nombre "+ nombre);
        logger.info("correo "+ correo);
        logger.info("mensaje "+ mensaje);
        return "Contacto";
    }
}
