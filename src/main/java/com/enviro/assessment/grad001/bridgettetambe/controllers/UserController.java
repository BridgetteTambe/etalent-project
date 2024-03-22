package com.enviro.assessment.grad001.bridgettetambe.controllers;

import com.enviro.assessment.grad001.bridgettetambe.models.User;
import com.enviro.assessment.grad001.bridgettetambe.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
  UserService userService;

    @PostMapping("/user")
    public User saveUserData(@RequestBody User user) throws Exception {
        LOGGER.info("Rest request to save user details : {}", user);
        if (user.getUserId() != null) {
            throw new Exception("Cant save user data with this id:{}");
        }
        return userService.uploadData(user);
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) throws Exception {
        LOGGER.info("Rest request to get user data by id:{}", id);
        return userService.findById(id);
    }

    @GetMapping("/customer")
    List<User> findAll() throws Exception {
        LOGGER.info("Rest request to get all data:");
        return userService.findAll();
    }

}
