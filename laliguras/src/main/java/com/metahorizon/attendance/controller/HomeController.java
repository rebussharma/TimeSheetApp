package com.metahorizon.attendance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

/**
 * Created by Asus on 5/19/2018.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    String index(Principal principal) {
        return principal != null ? "attendance" : "attendance";
    }
}
