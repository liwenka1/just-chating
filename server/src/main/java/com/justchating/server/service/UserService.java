package com.justchating.server.service;

import com.justchating.server.entity.User;
import com.justchating.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 创建用户
    public void saveUser(User user) {
        userRepository.save(user);
    }

    // 根据用户ID查找用户
    public User findUserById(String userId) {
        return userRepository.findById(userId).orElse(null);
    }

    // 获取所有用户
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // 更新用户信息
    public void updateUser(User user) {
        userRepository.save(user);
    }

    // 删除用户
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }

}
