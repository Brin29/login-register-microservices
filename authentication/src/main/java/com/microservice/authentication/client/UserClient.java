package com.microservice.authentication.client;

import com.microservice.authentication.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "msvc-user", url = "localhost:8080/api/user")
public interface UserClient {

    @GetMapping("/users")
    List<UserDTO> findUsers();
}
