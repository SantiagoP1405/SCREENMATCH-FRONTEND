package com.aluracursos.santiagogomez.screenmatch_spring.service;

import java.util.List;
import java.util.Optional;
import java.util.Locale.Category;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aluracursos.santiagogomez.screenmatch_spring.dto.EpisodioDTO;
import com.aluracursos.santiagogomez.screenmatch_spring.dto.SerieDTO;
import com.aluracursos.santiagogomez.screenmatch_spring.model.Categoria;
import com.aluracursos.santiagogomez.screenmatch_spring.model.Serie;
import com.aluracursos.santiagogomez.screenmatch_spring.respository.SerieRepository;

@Service
public class SerieService {
    @Autowired
    private SerieRepository repository;
    public List<SerieDTO> obtenerSeries(){
        return convierDatos(repository.findAll());
    }

    public List<SerieDTO> obtenerTop5(){
        return convierDatos(repository.findTop5ByOrderByEvaluacionDesc());
    }

   public List<SerieDTO> obtenerLanzamientosMasRecientes(){
        return convierDatos(repository.lanzamientosMasRecientes());
    }

    public List<SerieDTO> convierDatos(List<Serie> serie){
        return serie.stream()
        .map(s -> new SerieDTO(s.getId(), s.getTitulo(), s.getTotalTemporadas(),  s.getEvaluacion(), s.getGenero(), s.getSinopsis(), s.getPoster(), s.getCasting()))
        .collect(Collectors.toList());
    }

    public SerieDTO obtenerPorId(Long id){
        Optional<Serie> serie = repository.findById(id);
        if (serie.isPresent()){
            Serie s = serie.get();
            return new SerieDTO(s.getId(), s.getTitulo(), s.getTotalTemporadas(),  s.getEvaluacion(), s.getGenero(), s.getSinopsis(), s.getPoster(), s.getCasting());
        }
        return null;
    }

    public List<EpisodioDTO> obtenerTodasLasTemporadas(Long id) {
        Optional<Serie> serie = repository.findById(id);
        if (serie.isPresent()) {
            Serie s = serie.get();
            return s.getEpisodios().stream()
                .map(e -> new EpisodioDTO(e.getTemporada(), e.getTitulo(), e.getNumeroEpisodio()))
                .collect(Collectors.toList());
        }
        return null;
    }

    public List<EpisodioDTO> obtenerTemporadasPorNumero(Long id, Long numeroTemporada){
       return repository.obtenerTemporadasPorNumero(id, numeroTemporada).stream()
            .map(e -> new EpisodioDTO(e.getTemporada(), e.getTitulo(), e.getNumeroEpisodio()))
            .collect(Collectors.toList());

    }

    public List<SerieDTO> obtenerSeriesPorCategoria(String nombreGenero){
        Categoria categoria = Categoria.fromEspanol(nombreGenero);
        return convierDatos(repository.findByGenero(categoria));
    }

}
