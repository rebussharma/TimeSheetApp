package com.metahorizon.attendance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Asus on 5/19/2018.
 */
@Controller
public class AttendanceController {

    @GetMapping("/punchin")
    public String getPunchInView() {
        return  "";
    }

}
