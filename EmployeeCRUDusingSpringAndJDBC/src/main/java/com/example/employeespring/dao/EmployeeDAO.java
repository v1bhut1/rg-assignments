package com.example.employeespring.dao;

import com.example.employeespring.model.Employee;
import java.util.List;

public interface EmployeeDAO {
    int save(Employee employee);
    int update(Employee employee);
    Employee findById(int id);
    int deleteById(int id);
    List<Employee> findAll();
}
