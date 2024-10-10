package com.example.testjpa.controller;

import com.example.testjpa.dto.request.userCreationRequest;
import com.example.testjpa.entity.user;
import com.example.testjpa.service.userService;
import jakarta.ws.rs.POST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class userController {
    @Autowired
    private userService service;
    @PostMapping("/users")
    user CreateUser(@RequestBody userCreationRequest request) {
        return service.createUser(request);
    }
}
