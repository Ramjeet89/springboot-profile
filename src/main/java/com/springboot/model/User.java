package com.springboot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "USERS")
public class User {

    @Id
    private int id;
    private String name;


}
