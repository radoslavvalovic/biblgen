package com.example.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService
{
    private List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring FW", "Spring FW descr"),
            new Topic("java", "Core Java", "Core Java desc"),
            new Topic("javascript", "JavaScript", "JS desc")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

}
