package com.app.employeeservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.employeeservice.dto.CourseDto;
import com.app.employeeservice.dto.CourseResponseDto;
import com.app.employeeservice.dto.EmployeeDto;
import com.app.employeeservice.dto.EmployeeResponseDto;
import com.app.employeeservice.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired 
	EmployeeServiceImpl employeeService;
	
	Logger logger=LoggerFactory.getLogger(EmployeeController.class);

	@GetMapping("/getEmployee/{id}")
	public EmployeeResponseDto getEmployee(@PathVariable Integer id) {
		EmployeeDto employeeDto=employeeService.getEmployee(id);
		EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
		employeeResponseDto.setEmployeeDto(employeeDto);
		employeeResponseDto.setResponseMessage("sccessfully retrived employee details");
		employeeResponseDto.setResponseCode(200);
		return employeeResponseDto;
	}
	@GetMapping("/getCourseByName/{courseName}")
	public CourseResponseDto getCourseByName(@PathVariable String courseName) {
		logger.info("hello");
		CourseDto courseDto=employeeService.getCourseByName(courseName);
		CourseResponseDto courseResponseDto = new CourseResponseDto();
		courseResponseDto.setCourseDto(courseDto);
		courseResponseDto.setResponseMessage("successfully retrived course details");
		courseResponseDto.setResponseCode(200);
		return courseResponseDto;
	}
}
