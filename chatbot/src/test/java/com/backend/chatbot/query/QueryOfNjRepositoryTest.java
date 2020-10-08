package com.backend.chatbot.query;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class QueryOfNjRepositoryTest {
    @Autowired
    QueryOfNjRepository queryOfNjRepository;
    @Test
    public void addTest(){
        String query = "What is Dependency Injection?";
        String email = "sainikhil027@gmail.com";
        QueryOfNJ queryOfNJ = queryOfNjRepository.addQuery(query, email);
        assertTrue(queryOfNJ.getEmail().equals(email));
    }
}
