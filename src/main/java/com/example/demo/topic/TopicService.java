package com.example.demo.topic;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TopicService {
	
	@Autowired
	private TopicRepository repo;
////	
	public List<Topic> getAllTopics()
	{
		List<Topic> topics=new ArrayList<>();
		repo.findAll().forEach(topics::add);
		return topics;
	}
	public Optional<Topic> getTopic(Long id)
	{
		return repo.findById(id);
	}
	public void addTopics(Topic topic)
	{
		repo.save(topic);
	}
	public void updateTopics(Long id, Topic topic) {
		// TODO Auto-generated method stub
		repo.save(topic);
	}
	public void deleteTopics(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
