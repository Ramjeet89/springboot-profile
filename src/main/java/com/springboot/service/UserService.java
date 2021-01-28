package com.springboot.service;

import com.springboot.model.User;
import com.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Profile(value = {"local", "dev", "prod"})
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> getUsers() {
        return repository.findAll();
    }
}