package com.mns.cda.suivimns.dao;

import com.mns.cda.suivimns.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}
