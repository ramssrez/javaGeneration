package com.generation.SpringSecurityJWT.controller;

import com.generation.SpringSecurityJWT.model.User;
import com.generation.SpringSecurityJWT.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;
    //Variable para encriptar la contraseña
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserController(UserService userService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userService = userService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        //Encriptación de la contraseña
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }


}
