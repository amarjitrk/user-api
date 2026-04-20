package com.example.service;

import jakarta.inject.Singleton;
import com.example.model.User;

import java.util.*;

@Singleton
public class UserService {

    private Map<Long, User> users = new HashMap<>();
    private Long idCounter = 1L;

    public User createUser(User user){
        user.setId(idCounter++);
        users.put(user.getId(), user);
        return user;
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public User getUser(Long id) {
        return users.get(id);
    }

    public void deleteUser(Long id) {
        users.remove(id);
    }

}
