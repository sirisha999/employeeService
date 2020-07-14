package com.app.employeeservice.service.impl;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.employeeservice.dto.CourseDto;
import com.app.employeeservice.dto.EmployeeDto;
import com.app.employeeservice.model.Course;
import com.app.employeeservice.model.Employee;
import com.app.employeeservice.repository.CourseRepository;
import com.app.employeeservice.repository.EmployeeRepository;

import com.app.employeeservice.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
EmployeeRepository employeeRespository; 
@Autowired
CourseRepository courseRepository;

Logger logger=LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
public EmployeeDto getEmployee(Integer id) {
		EmployeeDto employeeDto=new EmployeeDto();
		Employee employee= employeeRespository.findByEmployeeId(id);
		try {
			BeanUtils.copyProperties(employeeDto, employee);
		} catch (IllegalAccessException|InvocationTargetException e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		logger.info("found employee "+employee.getEmployeeName());
		}
	return employeeDto;
}
	
public CourseDto getCourseByName(String courseName) {
	CourseDto courseDto=new CourseDto();
	Course course=courseRepository.findByCourseName(courseName);
try {
	BeanUtils.copyProperties(courseDto, course);
} catch (IllegalAccessException | InvocationTargetException e) {
	logger.info(e.getMessage());
	e.printStackTrace();
}
	return courseDto;
}
}
