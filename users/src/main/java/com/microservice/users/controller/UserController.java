package com.microservice.users.controller;

import com.microservice.users.entities.AuthResponse;
import com.microservice.users.entities.RegisterRequest;
import com.microservice.users.entities.User;
import com.microservice.users.service.IUserService;
import com.microservice.users.service.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @Autowired
    private RegisterServiceImpl registerService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(registerService.register(request));
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok(iUserService.findAll());
    }


    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable long id){
        return ResponseEntity.ok(iUserService.findById(id));
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User newUser, @PathVariable long id){
        return ResponseEntity.ok(iUserService.update(newUser, id));
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable long id){
        iUserService.delete(id);
    }
}
