package com.SpringRest.SpringRest.Services;
import java.util.*;

import com.SpringRest.SpringRest.entities.Course;
public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourseById(long courseId);
}
