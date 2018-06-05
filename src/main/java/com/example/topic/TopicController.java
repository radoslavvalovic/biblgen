package com.example.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController
{
    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return Arrays.asList(
                new Topic("spring", "Spring FW", "Spring FW descr"),
                new Topic("java", "Core Java", "Core Java desc"),
                new Topic("javascript", "JavaScript", "JS desc")
        );
    }
}
