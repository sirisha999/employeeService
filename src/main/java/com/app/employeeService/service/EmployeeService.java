package com.app.employeeService.service;

import com.app.employeeService.dto.CourseDto;
import com.app.employeeService.dto.EmployeeDto;

public interface EmployeeService {

	public EmployeeDto getEmployee(Integer id);
	
	public CourseDto getCourse(Integer id);
	
	public CourseDto getCourseByName(String courseName);
	
}
