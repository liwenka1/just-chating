package com.justchating.server.controller.user;

import com.justchating.server.entity.User;
import com.justchating.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired // 使用构造器注入 UserService
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping(value = "/user")
    public User User() {
        return userService.findUserById("1");
    }
}
