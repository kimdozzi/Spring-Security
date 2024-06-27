package com.example.springsecuritybasic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    // @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String email;
    private String pwd;
    private String role;

    public void setPassword(String pwd) {
        this.pwd = pwd;
    }
}
