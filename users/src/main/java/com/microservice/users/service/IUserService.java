package com.microservice.users.service;

import com.microservice.users.entities.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    User findById(long id);

    User save(User user);

    User update(User user, long id);

    void delete(long id);

}
