package com.socgen.kata.employeeapis.vo;


import java.io.Serializable;
import java.util.Date;

public class EmployeeVO implements Serializable {

    private String firstName;
    private String lastName;
    private Gender gender;
    private Date dateOfBirth;
    private DepartmentVO department;

    public EmployeeVO(String firstName, String lastName, Gender gender, Date dateOfBirth, DepartmentVO department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public DepartmentVO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentVO department) {
        this.department = department;
    }
}
