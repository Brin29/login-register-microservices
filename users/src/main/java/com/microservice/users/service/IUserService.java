package com.microservice.users.service;

import com.microservice.users.entities.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    User findById(long id);

    User update(User newUser, long id);

    void delete(long id);

}
