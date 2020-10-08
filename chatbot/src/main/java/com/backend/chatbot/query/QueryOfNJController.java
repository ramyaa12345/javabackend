package com.backend.chatbot.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QueryOfNJController {
    @Autowired
    QueryOfNjRepository queryOfNjRepository;
    @PostMapping(value = "/add-query")
    public QueryOfNJ addQuery(@RequestBody QueryOfNJ queryOfNJ){
        queryOfNJ = queryOfNjRepository.addQuery(queryOfNJ.getQuestion(), queryOfNJ.getEmail());
        return  queryOfNJ;
    }
    @GetMapping(value = "/unanswered-queries")
    public List<QueryOfNJ> getAllUnansweredQueries(){
        return queryOfNjRepository.findAllUnAnsweredQueries();
    }
}
