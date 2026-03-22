package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {

    protected EmployeeDao employeeDao;

    @Autowired
    public Employee(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
