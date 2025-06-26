package com.quoraapp.quora_backend.service;

import com.quoraapp.quora_backend.models.User;

import java.util.Optional;
import java.util.List;

public interface UserService {
    User createUser(User user);
    Optional<User> getUserById(Long id);
    Optional<User> getUserByUsername(String username);
    List<User> getAllUsers();
    void deleteUser(Long id);
}
