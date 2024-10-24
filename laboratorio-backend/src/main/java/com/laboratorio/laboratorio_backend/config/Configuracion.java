package com.laboratorio.laboratorio_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Configuracion implements WebMvcConfigurer{
//Este es un archivo de configuración que implementa WebMvcConfigurer para poder arreglar el problema de CORS
    public void addCorsMappings(CorsRegistry registro){
        registro.addMapping("/api/electronicos")//Agregamos la ruta
                .allowedOrigins("http://localhost:4200")//Agregamos el string de la url que va a aceptar
                .allowedMethods("GET");//Agregamos el método
    }

}
