package com.hardik.serviceDemo.service.impl;

import com.hardik.serviceDemo.model.User;
import com.hardik.serviceDemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImplementation implements UserService {

    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(1, "Hardik"));
        userList.add(new User(2, "DroidBiz"));
    }

    @Override
    public List<User> getAllUser() {
        return userList;
    }

    @Override
    public User getUserById(int userId) {
        List<User> result = userList.stream().filter(user -> user.getId() == userId).collect(Collectors.toList());
        return result.get(0);
    }
}
