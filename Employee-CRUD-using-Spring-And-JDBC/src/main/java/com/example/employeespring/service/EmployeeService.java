package com.example.employeespring.service;

import com.example.employeespring.dao.EmployeeDAO;
import com.example.employeespring.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public int save(Employee employee) {
        return employeeDAO.save(employee);
    }

    public int update(Employee employee) {
        return employeeDAO.update(employee);
    }

    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    public int deleteById(int id) {
        return employeeDAO.deleteById(id);
    }

    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
