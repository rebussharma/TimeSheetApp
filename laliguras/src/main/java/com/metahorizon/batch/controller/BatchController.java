package com.metahorizon.batch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Asus on 6/7/2018.
 */
@Controller
public class BatchController {

    @GetMapping("/batch")
    public String getBatch() {
        return "batch";

    }
}
