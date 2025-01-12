package com.aluracursos.santiagogomez.screenmatch_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Este controlador manejará solicitudes HTTP y devolverá respuestas en formato JSON
public class SerieController {

    @GetMapping("/series")
    public String mostrarMensaje(){
        return "primer mensaje ☺☻♥♦";
    } //para mapear solicitudes HTTP GET a un método específico en un controlador

}
