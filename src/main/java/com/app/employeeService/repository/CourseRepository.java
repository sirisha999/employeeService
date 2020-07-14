package com.app.employeeservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.employeeservice.model.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>{
public Course findByCourseName(String courseName);
}
