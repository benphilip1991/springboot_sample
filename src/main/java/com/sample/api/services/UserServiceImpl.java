package com.sample.api.services;

import com.sample.api.pojo.User;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {

    HashSet<User> users = new HashSet<>();

    @Override
    public HashSet<User> findAllUsers() {

        if (users.isEmpty()) {
            return null;
        }
        return users;
    }

    @Override
    public User findUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void deleteUser(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}
