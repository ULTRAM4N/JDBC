package com.SpringRest.SpringRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.SpringRest.Services.CourseService;
import com.SpringRest.SpringRest.entities.Course;

// Rest -> Representational state transfer in which we send the data in Json / Xml format
@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to course application";
	}
	
	// Get the courses
	@GetMapping("/courses")
	public List<Course> getCOurses(){
		
		return this.courseService.getCourses();
		
	}
	
	// get the course by course id
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	// to add a new Course
	@PostMapping(path = "/courses", consumes = "application/json" )
	public Course addCourse(@RequestBody Course course) {
		
		return this.courseService.addCourse(course);
	}
	
	
	// to update
	@PutMapping(path = "/courses", consumes = "application/json")
	public Course updatecourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	
	
	// to Delete
	@DeleteMapping(path = "/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		try {
		 this.courseService.deleteCourseById(Long.parseLong(courseId));
		 return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
