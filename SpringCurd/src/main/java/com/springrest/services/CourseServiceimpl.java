package com.springrest.services;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceimpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"java Core Course","this is a course of java"));
		list.add(new Course(146,"Spring Course","create project with spring"));
	}

	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
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

}
