package com.tsiupryk.courses.controller;

import com.tsiupryk.courses.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/all")
    public List<Object> findAll() {
        return StreamSupport.stream(userRepo.findAll().spliterator(), false)
                            .collect(Collectors.toList());
    }
}
