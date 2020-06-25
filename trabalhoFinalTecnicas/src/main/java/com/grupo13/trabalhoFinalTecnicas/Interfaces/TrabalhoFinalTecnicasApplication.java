package com.grupo13.trabalhoFinalTecnicas.Interfaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.grupo13"})
@EnableJpaRepositories(basePackages = {"com.grupo13"})
@EntityScan(basePackages = {"com.grupo13"})
public class TrabalhoFinalTecnicasApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoFinalTecnicasApplication.class, args);
	}

}
