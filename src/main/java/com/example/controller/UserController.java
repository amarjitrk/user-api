package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import io.micronaut.http.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@Controller("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Post("/")
    public User create(@Valid @Body User user){
        return userService.createUser(user);
    }

    @Get("/")
    public List<User> getAll() {
        return userService.getAllUsers();
    }

    @Get("/{id}")
    public User getById(Long id){
        return userService.getUser(id);
    }

    @Delete("/{id}")
    public void delete(Long id){
        userService.deleteUser(id);
    }
}
