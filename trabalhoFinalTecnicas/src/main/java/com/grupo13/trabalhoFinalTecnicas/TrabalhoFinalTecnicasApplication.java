package com.grupo13.trabalhoFinalTecnicas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.grupo13"})
public class TrabalhoFinalTecnicasApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoFinalTecnicasApplication.class, args);
	}

}
