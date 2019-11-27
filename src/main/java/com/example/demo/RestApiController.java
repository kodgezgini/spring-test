package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController
 */

@RestController
public class RestApiController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/json")
    public Iterable<User> getMethodName() {

        User u = new User();

        u.setName("spring icerden kayit etti");

        userRepository.save(u);

        return userRepository.findAll();
    }

}