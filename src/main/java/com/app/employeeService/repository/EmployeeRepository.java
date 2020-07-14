package com.app.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.employeeservice.model.Employee;

public interface  EmployeeRepository extends JpaRepository<Employee,Integer>{
public Employee findByEmployeeId(Integer id);
}
