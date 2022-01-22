package com.projetoCadastro.Cadastro;

import com.projetoCadastro.Cadastro.repository.CandidateRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = CandidateRepository.class)
@EnableJpaRepositories(excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = CandidateRepository.class))

@SpringBootApplication
public class CadastroDadosApplication {

    public static void main(String[] args) {
        SpringApplication.run(CadastroDadosApplication.class, args);
    }
}

