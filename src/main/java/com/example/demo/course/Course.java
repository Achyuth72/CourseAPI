package com.example.demo.course;

import javax.persistence.*;

import com.example.demo.topic.Topic;

@Entity
public class Course {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private String description;
	@ManyToOne
	private Topic topic;
	public Course(Long id, String name, String description, Long topicId) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
		this.topic=new Topic(topicId," "," ");
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}
