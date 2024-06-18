package com.example.springsecuritybasic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;
    private String pwd;
    private String role;
}
