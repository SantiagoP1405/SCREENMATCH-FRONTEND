package com.aluracursos.santiagogomez.screenmatch_spring;

import com.aluracursos.santiagogomez.screenmatch_spring.model.DatosEpisodio;
import com.aluracursos.santiagogomez.screenmatch_spring.model.DatosSerie;
import com.aluracursos.santiagogomez.screenmatch_spring.model.DatosTemporadas;
import com.aluracursos.santiagogomez.screenmatch_spring.principal.EjemploStreams;
import com.aluracursos.santiagogomez.screenmatch_spring.principal.Principal;
import com.aluracursos.santiagogomez.screenmatch_spring.respository.SerieRepository;
import com.aluracursos.santiagogomez.screenmatch_spring.service.ConsumoAPI;
import com.aluracursos.santiagogomez.screenmatch_spring.service.ConvierteDatos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchSpringApplication{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchSpringApplication.class, args);
	}
}

