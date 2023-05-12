package com.prep.prep.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prep.prep.entity.Course;

@Service				
public class ServiceImpl implements CourseService {

	List<Course> list;
	
	public ServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(1,"Core java", "this is a core java course"));
		list.add(new Course(2,"python", "this is a python course"));

	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		
		for(Course course : list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		list.forEach(e -> {
			if(e.getId() == course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}
	
		

}
