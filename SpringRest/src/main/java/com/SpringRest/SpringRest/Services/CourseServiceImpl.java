package com.SpringRest.SpringRest.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRest.SpringRest.Dao.CourseDao;
import com.SpringRest.SpringRest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

//	List<Course> list;
	@Autowired
	private CourseDao courseDao;
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145, "Java Core Course", "this course contains basic of java"));
//		list.add(new Course(4343,"spring boot course", "creating rest api using spring boot"));
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		
		
//		return list;
		return courseDao.findAll();
	}
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c = null;
//		for(Course course : list) {
//			if(course.getId() == courseId) {
//				c =  course;
//				break;
//			}
//		} 
//		return c;
		return courseDao.getOne(courseId);
	
	}
	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//			
//		});
		
//		return course;
		return courseDao.save(course);  // save will update the course if present, else will add the course
	}
	@Override
	public void deleteCourseById(long courseId) {
//		list = this.list.stream().filter(e -> e.getId() != courseId).collect(Collectors.toList());
		Course entity = courseDao.getOne(courseId);  // first we need to load the entity
				courseDao.delete(entity);
		
	}
	
	
	
	

}
