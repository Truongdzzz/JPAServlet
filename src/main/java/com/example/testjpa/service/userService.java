package com.example.testjpa.service;

import com.example.testjpa.dto.request.userCreationRequest;
import com.example.testjpa.entity.user;
import com.example.testjpa.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;

@Service
public class userService {
    @Autowired
    private userRepository userRepo;
    public user createUser(userCreationRequest request) {
        user user = new user();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        user.setFullName(request.getFullName());
        return userRepo.save(user);
    }
}
