package com.hardik.springbootjpa.service.impl;

import com.hardik.springbootjpa.database.UserRepository;
import com.hardik.springbootjpa.database.entity.User;
import com.hardik.springbootjpa.model.UserStatus;
import com.hardik.springbootjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public User addUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> getActiveUser() {
        return repository.findUserByStatus(UserStatus.ACTIVE);
    }

    @Override
    public List<User> getTerminatedUser() {
        return repository.findUserByStatus(UserStatus.TERMINATED);
    }

}

