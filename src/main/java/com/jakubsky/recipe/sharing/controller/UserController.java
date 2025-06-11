package com.jakubsky.recipe.sharing.controller;

import com.jakubsky.recipe.sharing.model.User;
import com.jakubsky.recipe.sharing.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @GetMapping
    public List<User> getUsers(){
        List<User> users = userRepository.findAll();
        users.forEach(u -> System.out.println("User ID: " + u.getId() + ", username: " + u.getUsername()));
        return users;
    }
}
