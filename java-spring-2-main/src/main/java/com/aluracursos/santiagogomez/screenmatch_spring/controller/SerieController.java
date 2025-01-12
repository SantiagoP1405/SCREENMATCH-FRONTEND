package com.aluracursos.santiagogomez.screenmatch_spring.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aluracursos.santiagogomez.screenmatch_spring.dto.SerieDTO;
import com.aluracursos.santiagogomez.screenmatch_spring.respository.SerieRepository;
import com.aluracursos.santiagogomez.screenmatch_spring.service.SerieService;

@RestController //Este controlador manejará solicitudes HTTP y devolverá respuestas en formato JSON
public class SerieController {
    @Autowired
    private SerieService service;
    @GetMapping("/series")//para mapear solicitudes HTTP GET a un método específico en un controlador
    public List<SerieDTO> obtenerSeries(){
        return service.obtenerSeries();
    }
}
