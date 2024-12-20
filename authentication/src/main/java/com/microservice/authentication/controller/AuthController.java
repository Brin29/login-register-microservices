package com.microservice.authentication.controller;


import com.microservice.authentication.client.UserClient;
import com.microservice.authentication.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/users")
    public List<UserDTO> getUsers(){
        List<UserDTO> user = userClient.findUsers();
        return user;
    }
}
