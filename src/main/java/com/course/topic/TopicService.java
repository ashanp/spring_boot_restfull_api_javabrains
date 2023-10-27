package com.course.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "spring framework", "this is a spring cource description"),
			new Topic("java", "java framework", "this is a java cource description"),
			new Topic("c++", "c++ framework", "this is a c++ cource description")));

	public List<Topic> getAlltopics() {
		return topics;
	}
	
	public Topic getToipic(String id) {
		return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}

	public void addTopic(Topic t1){
		topics.add(t1);
	}

	public void updateTopic(String t1, Topic t2){
		for (int i=0; i<topics.size(); i++ ){
			Topic top1 = topics.get(i);
			if (top1.getId().equalsIgnoreCase(t1)){
				topics.set(i, t2);
				return;
			}
		}
	}

	public void deleteTopic(String t1){
		// for (int i=0; i<topics.size(); i++ ){
		// 	Topic top1 = topics.get(i);
		// 	if (top1.getId().equalsIgnoreCase(t1)){
		// 		topics.remove(i);
		// 		return;
		// 	}
		// }
		topics.removeIf(t -> t.getId().equals(t1));
		return;

	}

	

}
