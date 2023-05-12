package com.prep.prep.service;

import java.util.List;

import com.prep.prep.entity.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
}
