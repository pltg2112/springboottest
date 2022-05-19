package com.pltg.springboottest.controller;

import com.pltg.springboottest.entity.User;
import com.pltg.springboottest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getAll")
    public List<User> getUser(){
        List<User> list = userRepository.findAll();
        return list;
    }
}
