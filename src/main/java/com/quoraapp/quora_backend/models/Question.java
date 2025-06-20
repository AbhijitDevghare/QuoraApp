package com.quoraapp.quora_backend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private User user;
}
