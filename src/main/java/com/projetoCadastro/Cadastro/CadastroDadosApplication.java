package com.projetoCadastro.Cadastro;

import com.projetoCadastro.Cadastro.model.Course;
import com.projetoCadastro.Cadastro.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = CourseRepository.class)
@EnableJpaRepositories(excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = CourseRepository.class))

@SpringBootApplication
public class CadastroDadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroDadosApplication.class, args);
	}
}

