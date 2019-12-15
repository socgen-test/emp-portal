package com.socgen.kata.employeeapis.vo;

import java.util.concurrent.atomic.AtomicLong;

public class DepartmentVO {
    private String name;
    private int id;

    public DepartmentVO(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
