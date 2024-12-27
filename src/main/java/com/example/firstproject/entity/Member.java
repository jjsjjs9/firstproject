package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Member {

    @GeneratedValue
    @Id
    private Long id;

    @Column
    private String email;

    @Column
    private String password;
}
