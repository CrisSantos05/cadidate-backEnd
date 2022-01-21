package com.projetoCadastro.Cadastro.repository;

import com.projetoCadastro.Cadastro.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends MongoRepository<Course, String> {
}
