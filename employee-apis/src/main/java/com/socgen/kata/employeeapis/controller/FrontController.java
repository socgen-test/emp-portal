package com.socgen.kata.employeeapis.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    @RequestMapping("/employee")
    public String testGetEmployee(@RequestParam(value="name") String name) {
        return "Employee Name: "+ name;
    }
}
