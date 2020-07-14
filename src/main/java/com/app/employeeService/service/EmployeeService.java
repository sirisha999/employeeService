package com.app.employeeservice.service;

import com.app.employeeservice.dto.CourseDto;
import com.app.employeeservice.dto.EmployeeDto;

public interface EmployeeService {

	public EmployeeDto getEmployee(Integer id);
	
	public CourseDto getCourseByName(String courseName);
	
}
