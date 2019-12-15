package com.socgen.kata.employeeapis.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.socgen.kata.employeeapis.service.EmployeeRepository;
import com.socgen.kata.employeeapis.vo.EmployeeVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FrontController {
    private final EmployeeRepository employeeRepository;
    Logger logger = LoggerFactory.getLogger(FrontController.class);

    public FrontController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @RequestMapping("/employee")
    public List<EmployeeVO> listEmployees() {
        return employeeRepository.listEmployees();
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeVO employee) {
        employeeRepository.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
