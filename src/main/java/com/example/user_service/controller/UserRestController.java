package com.example.user_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @Value("${common.message}")
    private String commonMessage;

    @Value("${user.message}")
    private String userMessage;

    @GetMapping("/user/info")
    public String getUserInfo() {
        return "Common: " + commonMessage + " | User: " + userMessage;
    }
}
