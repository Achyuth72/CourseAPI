package com.example.demo.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.topic.Topic;

@Controller
@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable Long id)
	{
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/topics/{id}/courses/{courseId}")
	public Optional<Course> getCourse(@PathVariable Long id)
	{
		return courseService.getCourses(id);
	}
	@PostMapping(value="/topics/{topicId}/courses/")
	public void addCourse(@RequestBody Course course, @PathVariable Long topicId)
	{
		course.setTopic(new Topic(topicId," "," "));
		courseService.addCourses(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable Long topicId)
	{
		course.setTopic(new Topic(topicId," "," "));
		courseService.updateCourses(course);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable Long id)
{
	courseService.deleteCourses(id);
}

}