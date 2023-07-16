package com.sample.api.controllers;

import com.sample.api.pojo.User;
import com.sample.api.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    // Can be replaced with @GetMapping("/users")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public HashSet<User> getAllUsers() {
        return userServiceImpl.findAllUsers();
    }

    // Find user by id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable int id) {
        return userServiceImpl.findUserById(id);
    }

    // Add user
    @RequestMapping(value = "", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        userServiceImpl.addUser(user);
    }

    // Delete user
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id) {
        userServiceImpl.deleteUser(id);
    }
}
