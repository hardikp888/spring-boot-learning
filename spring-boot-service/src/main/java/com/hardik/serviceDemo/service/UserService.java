package com.hardik.serviceDemo.service;

import com.hardik.serviceDemo.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUser();

    public User getUserById(int userId);
}
