package br.com.seteideias.projetospringdevdojo2.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.seteideias.projetospringdevdojo2") // pra verificar dentro das pastas
public class Projetospringdevdojo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Projetospringdevdojo2Application.class, args);
	}


}
