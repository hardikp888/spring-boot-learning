package com.hardik.springbootjpa.controller;

import com.hardik.springbootjpa.database.entity.User;
import com.hardik.springbootjpa.model.UserStatus;
import com.hardik.springbootjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/hello")
    public String hello() {
        return "Hello user service";
    }

    @GetMapping("/add")
    public User addUser() {
        User user = new User();
        user.setEmail("abc@gmail.com");
        user.setCreateTime(System.currentTimeMillis());
        user.setPassword("abc#$");
        user.setPhone("1234567890");
        user.setName("Abc");
        user.setStatus(UserStatus.ACTIVE);

        return userService.addUser(user);
    }

    @GetMapping("/active")
    public List<User> getActiveUser() {
        return userService.getActiveUser();
    }

    @GetMapping("/terminated")
    public List<User> getTerminatedUser() {
        return userService.getTerminatedUser();
    }
}
