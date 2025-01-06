package com.microservicio.auth_service.controller;

import com.microservicio.auth_service.entities.AuthResponse;
import com.microservicio.auth_service.entities.LoginRequest;
import com.microservicio.auth_service.entities.RegisterRequest;
import com.microservicio.auth_service.service.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private AuthServiceImpl serviceImpl;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(serviceImpl.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(serviceImpl.login(request));
    }

    @GetMapping("/prueba")
    public ResponseEntity<String> prueba(){
        return ResponseEntity.ok("Hola Mundo");
    }
}
