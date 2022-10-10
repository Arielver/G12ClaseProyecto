package usa.mintic.g12proyectoreto3.controller;

import org.springframework.web.bind.annotation.*;
import usa.mintic.g12proyectoreto3.entities.Persona;

@RestController
@RequestMapping("/api/G12")
public class myController {

    @GetMapping("/hola")
    public String saludo (){
        return "<h1>Hola mundo!</h1>";
    }

    @PostMapping("/persona")
    public String recibirData (@RequestBody Persona p){
        System.out.println(p.getName());
        return p.getName();
    }
}
