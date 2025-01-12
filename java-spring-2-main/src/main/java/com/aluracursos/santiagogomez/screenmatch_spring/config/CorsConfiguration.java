package com.aluracursos.santiagogomez.screenmatch_spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config   .annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer{
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Permite todas las rutas
                .allowedOrigins("http://127.0.0.1:5500") // Permite el origen de tu front-end
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
                .allowCredentials(true); // Permite credenciales si es necesario
    }

}
