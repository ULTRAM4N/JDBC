package com.SpringRest.SpringRest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringRest.SpringRest.entities.Course;

public interface CourseDao extends JpaRepository<Course , Long>{
	
}
