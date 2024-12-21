package com.microservice.users.service;

import com.microservice.users.entities.AuthResponse;
import com.microservice.users.entities.User;
import com.microservice.users.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterServiceImpl {

    private final UserRepository userRepository;

    public AuthResponse register(User registerUser){
        User user = User.builder()
                .username(registerUser.getUsername())
                .firstName(registerUser.getFirstName())
                .lastName(registerUser.getLastName())
                .password(registerUser.getPassword())
                .build();

        userRepository.save(user);

        return AuthResponse.builder()
                .token()
                .build();

    }
}
