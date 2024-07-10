package com.example.SpringBoot_JPA.repository;

import com.example.SpringBoot_JPA.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
