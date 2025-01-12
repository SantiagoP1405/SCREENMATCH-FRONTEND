package com.aluracursos.santiagogomez.screenmatch_spring.dto;

import com.aluracursos.santiagogomez.screenmatch_spring.model.Categoria;

import jakarta.persistence.Enumerated;

public record SerieDTO(
    Long id,
    String titulo, 
    Integer totalTemporadas,
    Double evaluacion,
    Categoria genero, 
    String sinopsis,
    String poster,
    String casting
){
    
}
