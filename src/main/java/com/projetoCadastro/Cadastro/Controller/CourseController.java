package com.projetoCadastro.Cadastro.Controller;

import com.projetoCadastro.Cadastro.model.Course;
import com.projetoCadastro.Cadastro.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableMongoRepositories
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    @Autowired
    private final CourseRepository courseRepository;

    @PostMapping
    ResponseEntity save(@RequestBody Course course) {
        courseRepository.save(course);
        return ResponseEntity.ok().build();
    }
}