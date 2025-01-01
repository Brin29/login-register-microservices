package com.microservicio.auth_service.service;

import com.microservicio.auth_service.entities.AuthResponse;
import com.microservicio.auth_service.entities.RegisterRequest;
import com.microservicio.auth_service.entities.User;
import com.microservicio.auth_service.jwt.JwtService;
import com.microservicio.auth_service.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements IAuthService{

    @Autowired
    private final UserRepository repository;

    @Autowired
    private final JwtService jwtService;

    @Autowired
    private final PasswordEncoder passwordEncoder;

    public AuthResponse register(RegisterRequest request){
        User user = User
                .builder()
                .username(request.getUsername())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .password(passwordEncoder.encode(request.getPassword()))
                .build();

        repository.save(user);

        return AuthResponse
                .builder()
                .token(jwtService.getToken(user))
                .build();
    }
}
