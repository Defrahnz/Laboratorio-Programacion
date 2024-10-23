package com.laboratorio.laboratorio_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Configuracion implements WebMvcConfigurer{

    public void addCorsMappings(CorsRegistry registro){
        registro.addMapping("/api/electronicos")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET");
    }

}
