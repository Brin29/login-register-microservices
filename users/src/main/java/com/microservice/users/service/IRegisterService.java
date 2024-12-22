package com.microservice.users.service;

import com.microservice.users.entities.AuthResponse;
import com.microservice.users.entities.RegisterRequest;

public interface IRegisterService {

    AuthResponse register(RegisterRequest request);
}
