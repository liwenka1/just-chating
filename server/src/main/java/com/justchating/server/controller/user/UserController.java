package com.justchating.server.controller.user;

import com.justchating.server.entity.User;
import com.justchating.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired // 使用构造器注入 UserService
    public UserController(UserService userService) {
        this.userService = userService;
    }
    // 获取所有用户
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // 获取单个用户
    @GetMapping("/{userId}")
    public User getUser(@PathVariable String userId) {
        return userService.findUserById(userId);
    }

    // 创建用户
    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    // 更新用户
    @PutMapping("/{userId}")
    public void updateUser(@PathVariable String userId, @RequestBody User user) {
        user.setId(userId); // 确保传入的用户对象具有正确的ID
        userService.updateUser(user);
    }

    // 删除用户
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
    }
}
