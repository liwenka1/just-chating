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
    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // 获取单个用户
    @PostMapping("/getById")
    public User getUserById(@RequestBody User user) {
        String id = user.getId();
        return userService.findUserById(id);
    }
    @PostMapping("/getByName")
    public User getUserByName(@RequestBody User user) {
        String name = user.getName();
        return userService.findUserByName(name);
    }

    // 创建用户
    @PostMapping("/create")
    public boolean createUser(@RequestBody User user) {
        userService.saveUser(user);
        return true;
    }

    // 更新用户
    @PostMapping("/update")
    public boolean updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return true;
    }

    // 删除用户
    @PostMapping("/deleteById")
    public boolean deleteUserById(@RequestBody User user) {
        String id = user.getId();
        userService.deleteUser(id);
        return true;
    }
}
