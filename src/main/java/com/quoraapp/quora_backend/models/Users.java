package com.quoraapp.quora_backend.models;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;

    @Column(name = "username",nullable = false,unique = true)
    String username;

    @Column(nullable = false,unique = true)
    String email;

    @Column(nullable = true)
    String bio;
}
