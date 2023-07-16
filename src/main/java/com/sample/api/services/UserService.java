package com.sample.api.services;

import com.sample.api.pojo.User;

import java.util.HashSet;

public interface UserService {

    HashSet<User> findAllUsers();
    User findUserById(int id);
    void addUser(User user);
    void deleteUser(int id);
}
