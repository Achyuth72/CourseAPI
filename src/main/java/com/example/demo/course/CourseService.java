package com.example.demo.course;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepo;
////	
	public List<Course> getAllCourses(Long topicId)
	{
		List<Course> courses=new ArrayList<>();
		 courseRepo. findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	public Optional<Course> getCourses(Long id)
	{
		return courseRepo.findById(id);
	}
	public void addCourses(Course course)
	{
		courseRepo.save(course);
	}
	public void updateCourses( Course course) {
		// TODO Auto-generated method stub
		courseRepo.save(course);
	}
	public void deleteCourses(Long id) {
		// TODO Auto-generated method stub
		courseRepo.deleteById(id);
	}


}
