package com.socgen.kata.employeeapis.service;

import com.socgen.kata.employeeapis.controller.FrontController;
import com.socgen.kata.employeeapis.vo.DepartmentVO;
import com.socgen.kata.employeeapis.vo.EmployeeVO;
import com.socgen.kata.employeeapis.vo.Gender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class EmployeeRepositoryService implements EmployeeRepository {

    Logger logger = LoggerFactory.getLogger(FrontController.class);
    private static Map<Integer, EmployeeVO> employeeStore = new LinkedHashMap<>();
    private final AtomicInteger counter = new AtomicInteger();

    @Override
    public List<EmployeeVO> listEmployees() {
        List<EmployeeVO> employees = new ArrayList<>();
        employeeStore.forEach((k, v) -> employees.add(v));
        return employees;
    }

    @Override
    public void createEmployee(EmployeeVO employeeVO) {
        employeeStore.put(counter.incrementAndGet(), employeeVO);
    }
}
