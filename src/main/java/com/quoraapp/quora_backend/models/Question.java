package com.quoraapp.quora_backend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Entity
@Table(name = "questions")
@Getter
@Setter
@NoArgsConstructor
public class Question extends Base {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String body;


    // In Question.java
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference("user-questions")
    private User user;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("question-answers")
    private List<Answer> answers = new ArrayList<>();

}
