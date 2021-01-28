package com.springboot.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter

@Table(name = "users")
public class User {

    @Id
    private int id;
    private String name;


}
