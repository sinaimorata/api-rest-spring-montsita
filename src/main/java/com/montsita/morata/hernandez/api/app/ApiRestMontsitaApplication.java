package com.montsita.morata.hernandez.api.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ApiRestMontsitaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestMontsitaApplication.class, args);
	}
	//Este bean sirve pr tener permisos pr compartir recursos diferentes con origenes 
	//cruzados. Este metodo lo reconoce y lo aplica. Da acceso a cualquier url y q
	//metodos vamos a poder ejecutar.Q mi API se pueda consumir desde cualquier sitio
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST","PUT", "DELETE");
            }
        };
    }

}
