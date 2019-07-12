package com.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;
	
	/*- private List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic(1, "Spring", "Spring Description"), new Topic(2, "Java", "Java Description"), new Topic(3, "Maven", "Maven Description")));*/

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(i -> topics.add(i));
		return topics;
	}

	public Topic getTopic(int id) {
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(int id, Topic topic) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(int id) {
		topicRepository.delete(id);
	}
}
