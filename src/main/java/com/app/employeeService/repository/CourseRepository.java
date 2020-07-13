package com.app.employeeService.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.employeeService.model.Course;
public interface CourseRepository extends JpaRepository<Course,Integer>{
	
public Course findByCourseId(Integer id);
}
