package com.microservice.authentication.controller;


import com.microservice.authentication.dto.UserDTO;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    @GetMapping("users")
    public List<UserDTO> getAll(){
        return
    }
}
