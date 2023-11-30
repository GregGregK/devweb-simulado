package com.example.task_manager.controller;

import com.example.task_manager.entities.User;
import com.example.task_manager.servico.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

}
