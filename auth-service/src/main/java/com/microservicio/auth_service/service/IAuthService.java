package com.microservicio.auth_service.service;

import com.microservicio.auth_service.entities.AuthResponse;
import com.microservicio.auth_service.entities.RegisterRequest;

public interface IAuthService {

    AuthResponse register(RegisterRequest request);
}
