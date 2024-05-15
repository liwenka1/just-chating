package com.justchating.server.service;

import com.justchating.server.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User findUserById(String userId);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(String userId);
}

