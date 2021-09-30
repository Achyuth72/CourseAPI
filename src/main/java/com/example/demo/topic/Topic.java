package com.example.demo.topic;

import javax.persistence.*;

@Entity
public class Topic {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	public Topic(Long id, String name, String description) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
	}
	private String name;
	private String description;
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
}
