package com.generation.ProyectoSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Configuración interna en Spring
public class HelloController {

    //Por el método get se va a responder esto
    @GetMapping("/")
    public String index() {
        return "Esto es desde SpringBoot, yo soy Raúl!";
    }
}
