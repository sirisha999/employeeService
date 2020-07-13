package com.app.employeeService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.employeeService.dto.CourseDto;
import com.app.employeeService.dto.CourseResponseDto;
import com.app.employeeService.dto.EmployeeDto;
import com.app.employeeService.dto.EmployeeResponseDto;
import com.app.employeeService.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired 
	EmployeeServiceImpl employeeService;

	@GetMapping("/getEmployee/{id}")
	public EmployeeResponseDto getEmployee(@PathVariable Integer id) {
		EmployeeDto employeeDto=employeeService.getEmployee(id);
		EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
		employeeResponseDto.setEmployeeDto(employeeDto);
		employeeResponseDto.setResponseMessage("sccessfully retrived employee details");
		employeeResponseDto.setResponseCode(200);
		return employeeResponseDto;
	}
	
	@GetMapping("/getCourse/{id}")
	public CourseResponseDto getCourse(@PathVariable Integer id) {
		CourseDto courseDto=employeeService.getCourse(id);
		CourseResponseDto courseResponseDto = new CourseResponseDto();
		courseResponseDto.setCourseDto(courseDto);
		courseResponseDto.setResponseMessage("successfully retrived course details");
		courseResponseDto.setResponseCode(200);
		return courseResponseDto;
	}
	
	@GetMapping("/getCourse/{courseName}")
	public CourseResponseDto getCourseByName(@PathVariable String courseName) {
		CourseDto courseDto=employeeService.getCourseByName(courseName);
		CourseResponseDto courseResponseDto = new CourseResponseDto();
		courseResponseDto.setCourseDto(courseDto);
		courseResponseDto.setResponseMessage("successfully retrived course details");
		courseResponseDto.setResponseCode(200);
		return courseResponseDto;
	}
}
