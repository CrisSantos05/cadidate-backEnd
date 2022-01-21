package com.projetoCadastro.Cadastro.model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Data
@Document(collection = "candidates")
@Entity
public class Course {

    @Id
    private String id;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String email;

    @Column(length = 20, nullable = false)
    private String phone;

}
