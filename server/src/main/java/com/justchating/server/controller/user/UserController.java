package com.justchating.server.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping(value = "/user")
    public String User() {
        return "user";
    }
}