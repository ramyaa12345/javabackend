package com.backend.chatbot.query;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QueryOfNJService {
    public List<QueryOfNJ> makeQueryOfNJobjects(List<Object[]> allObjects){
        List<QueryOfNJ> li = new ArrayList<>();
        for(Object[] objects : allObjects){
            li.add(convertObjectIntoQueryOfNj(objects));
        }
        return li;
    }

    private QueryOfNJ convertObjectIntoQueryOfNj(Object[] objects) {
        QueryOfNJ queryOfNJ = new QueryOfNJ();
        queryOfNJ.setId((Integer)objects[0]);
        queryOfNJ.setEmail((String)objects[1]);
        queryOfNJ.setIsAnswerd((Boolean)objects[2]);
        queryOfNJ.setQuestion((String)objects[3]);
        return queryOfNJ;
    }
}
