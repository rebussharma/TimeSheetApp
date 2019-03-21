package com.metahorizon.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Asus on 6/7/2018.
 */
@Controller
public class ReportController {

    @GetMapping("/report")
    public String getReportView(){
        return "report";
    }
}
