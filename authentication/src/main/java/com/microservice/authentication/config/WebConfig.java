package com.microservice.authentication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    // Configuracion del corsOrigin
    @Bean
    public WebMvcConfigurer corsConfig(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry){
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:8080"
                                ,"http://localhost:8888"
                                ,"http://localhost:8761"
                                ,"http://localhost:8090"
                                ,"http://localhost:9090")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
                        .allowedHeaders("*") // Permitir todos los encabezados
                        .allowCredentials(true) // Permitir el uso de cookies o credenciales
                        .maxAge(3600); // Duración máxima de la configuración en caché (en segundos)
            }
        };
    }
}
