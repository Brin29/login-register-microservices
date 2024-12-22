package com.microservice.users.service;

import com.microservice.users.entities.User;
import com.microservice.users.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll(){
        return (List<User>) repository.findAll();
    }

    @Override
    public User findById(long id){
        return repository.findById(id).orElseThrow();
    }

    @Override
    public User update(User newUser, long id){
        return repository.findById(id)
                .map(user -> {
                    user.setFirstName(newUser.getFirstName());
                    user.setLastName(newUser.getLastName());
                    user.setPassword(newUser.getPassword());
                    user.setUsername(newUser.getUsername());
                    return repository.save(newUser);
                })
                .orElseGet(() -> {
                    return repository.save(newUser);
                });
    }

    @Override
    public void delete(long id){
        repository.deleteById(id);
    }

}
