package com.projetoCadastro.Cadastro;

import com.projetoCadastro.Cadastro.model.Course;
import com.projetoCadastro.Cadastro.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CadastroDadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroDadosApplication.class, args);
	}
}

