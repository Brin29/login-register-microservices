package com.microservice.users.controller;

import com.microservice.users.entities.User;
import com.microservice.users.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user){
        return ResponseEntity.ok(iUserService.save(user));
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
