package com.aluracursos.santiagogomez.screenmatch_spring.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aluracursos.santiagogomez.screenmatch_spring.dto.SerieDTO;
import com.aluracursos.santiagogomez.screenmatch_spring.respository.SerieRepository;

@RestController //Este controlador manejará solicitudes HTTP y devolverá respuestas en formato JSON
public class SerieController {
    @Autowired
    private SerieRepository repository;

    @GetMapping("/series")//para mapear solicitudes HTTP GET a un método específico en un controlador
    public List<SerieDTO> obtenerSeries(){
        return repository.findAll().stream()
            .map(s -> new SerieDTO(s.getTitulo(), s.getTotalTemporadas(),  s.getEvaluacion(), s.getGenero(), s.getSinopsis(), s.getPoster(), s.getCasting())).collect(Collectors.toList());
    } 

}
