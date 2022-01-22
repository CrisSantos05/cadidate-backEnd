package com.projetoCadastro.Cadastro.Controller;

import com.projetoCadastro.Cadastro.model.Candidate;
import com.projetoCadastro.Cadastro.repository.CandidateRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableMongoRepositories
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CandidateController {

    @Autowired
    private final CandidateRepository candidateRepository;

    @PostMapping
    ResponseEntity save(@RequestBody Candidate candidate) {
        candidateRepository.save(candidate);
        return ResponseEntity.ok().build();
    }
}