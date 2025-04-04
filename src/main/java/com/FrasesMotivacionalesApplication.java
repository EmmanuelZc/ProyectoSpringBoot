package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.domain.entidades.Frases;

@SpringBootApplication
public class FrasesMotivacionalesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FrasesMotivacionalesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Frases frases = new Frases();
		frases.setIdFrase(null);
		frases.setTextoFrase("Yo sólo sé que no se java.");
		frases.setAutorFrase("yo");
		System.out.println(frases);

	}



}

