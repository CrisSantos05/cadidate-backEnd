package com.projetoCadastro.Cadastro.repository;

import com.projetoCadastro.Cadastro.model.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends MongoRepository<Candidate, String> {
}
