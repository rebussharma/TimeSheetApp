package com.metahorizon.user.controller;

import com.metahorizon.user.entity.User;
import com.metahorizon.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Asus on 5/20/2018.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/user")
    public String getUser() {
        return "user";
    }

}
