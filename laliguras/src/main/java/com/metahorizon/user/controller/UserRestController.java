package com.metahorizon.user.controller;

import com.metahorizon.user.entity.User;
import com.metahorizon.user.service.UserService;
import common.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Asus on 6/14/2018.
 */
@RestController
public class UserRestController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userService.getUser();
    }

    @PostMapping(value = "/user")
    public void addUser(@ModelAttribute User user) {
        System.out.println("i reach here");

    }

    @DeleteMapping(value = "/users/{id}")
    public void deleteUser(@PathVariable int id) {
       userService.deleteUser(id);
    }
}
