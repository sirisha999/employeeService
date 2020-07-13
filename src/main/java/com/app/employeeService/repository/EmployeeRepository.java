package com.app.employeeService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.employeeService.model.Employee;

public interface  EmployeeRepository extends JpaRepository<Employee,Integer>{
public Employee findByEmployeeId(Integer id);
}
