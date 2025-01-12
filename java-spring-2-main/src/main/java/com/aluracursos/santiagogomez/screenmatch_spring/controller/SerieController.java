package com.aluracursos.santiagogomez.screenmatch_spring.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aluracursos.santiagogomez.screenmatch_spring.dto.SerieDTO;
import com.aluracursos.santiagogomez.screenmatch_spring.service.SerieService;

@RestController //Este controlador manejará solicitudes HTTP y devolverá respuestas en formato JSON
@RequestMapping("/series") //Esta va a ser la url base
public class SerieController {
    @Autowired
    private SerieService service;
    @GetMapping()//para mapear solicitudes HTTP GET a un método específico en un controlador
    public List<SerieDTO> obtenerSeries(){
        return service.obtenerSeries();
    }

    @GetMapping("/top5")
    public List<SerieDTO> obtenerTop5(){
        return service.obtenerTop5();
    }

    @GetMapping("/lanzamientos")
    public List<SerieDTO> obtenerLanzamientosMasRecientes(){
        return service.obtenerLanzamientosMasRecientes();
    }

    @GetMapping("/{id}")
    public SerieDTO obtenerPorId(@PathVariable Long id){
        return service.obtenerPorId(id);
    }
}
