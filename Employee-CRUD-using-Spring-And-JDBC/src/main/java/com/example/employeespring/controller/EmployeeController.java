package com.example.employeespring.controller;

import com.example.employeespring.model.Employee;
import com.example.employeespring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public int createEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @PutMapping("/{id}")
    public int updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        employee.setId(id);
        return employeeService.update(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.findById(id);
    }

    @DeleteMapping("/{id}")
    public int deleteEmployee(@PathVariable int id) {
        return employeeService.deleteById(id);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }
}
