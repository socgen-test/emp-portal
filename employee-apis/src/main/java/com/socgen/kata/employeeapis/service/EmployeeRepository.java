package com.socgen.kata.employeeapis.service;

import com.socgen.kata.employeeapis.vo.EmployeeVO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeRepository {
    public List<EmployeeVO> listEmployees();
    public void createEmployee(EmployeeVO employeeVO);
}
