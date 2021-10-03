package com.tutorial.hateoas.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table
@Getter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
