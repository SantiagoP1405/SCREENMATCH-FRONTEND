package com.aluracursos.santiagogomez.screenmatch_spring.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aluracursos.santiagogomez.screenmatch_spring.dto.SerieDTO;
import com.aluracursos.santiagogomez.screenmatch_spring.respository.SerieRepository;

@Service
public class SerieService {
    @Autowired
    private SerieRepository repository;
    public List<SerieDTO> obtenerSeries(){
        return repository.findAll().stream()
            .map(s -> new SerieDTO(s.getTitulo(), s.getTotalTemporadas(),  s.getEvaluacion(), s.getGenero(), s.getSinopsis(), s.getPoster(), s.getCasting())).collect(Collectors.toList());
    }
}
