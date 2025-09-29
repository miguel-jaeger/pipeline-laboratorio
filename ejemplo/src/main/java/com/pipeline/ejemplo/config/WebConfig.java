package com.pipeline.ejemplo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
 @SuppressWarnings("null")
@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Aplica esta regla a todos los endpoints que inician con /api/
                .allowedOrigins("*")    // Permite cualquier origen (dominio/puerto)
                .allowedMethods("GET")  // Solo necesitamos el método GET
                .allowedHeaders("*");   // Permite cualquier encabezado
    }
}
