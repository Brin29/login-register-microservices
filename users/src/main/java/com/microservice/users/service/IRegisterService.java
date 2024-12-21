package com.microservice.users.service;

import com.microservice.users.entities.AuthResponse;
import com.microservice.users.entities.User;

public interface IRegisterService {

    AuthResponse register(User registerUser);
}
