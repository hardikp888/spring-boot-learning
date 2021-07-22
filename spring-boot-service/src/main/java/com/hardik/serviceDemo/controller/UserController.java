package com.hardik.serviceDemo.controller;

import com.hardik.serviceDemo.model.User;
import com.hardik.serviceDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/allUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }
}
