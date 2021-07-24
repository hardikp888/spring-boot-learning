package com.hardik.springbootjpa.service;

import com.hardik.springbootjpa.database.entity.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    List<User> getActiveUser();
    List<User> getTerminatedUser();
}
