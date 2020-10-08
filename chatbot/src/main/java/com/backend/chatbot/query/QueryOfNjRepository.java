package com.backend.chatbot.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class QueryOfNjRepository {
    @PersistenceContext
    EntityManager em;
    @Autowired
    QueryOfNJService queryOfNJService;

    public List<QueryOfNJ> findAllUnAnsweredQueries(){
        List<Object[]> objectsList = em.createNativeQuery("Select * from query_ofnj where query_ofnj.is_answered = FALSE").getResultList();
        return queryOfNJService.makeQueryOfNJobjects(objectsList);
    }
    public QueryOfNJ addQuery(String query, String mailId){
        QueryOfNJ queryOfNJ = new QueryOfNJ();
        queryOfNJ.setQuestion(query);
        queryOfNJ.setEmail(mailId);
        queryOfNJ.setIsAnswerd(false);
        em.persist(queryOfNJ);
        return queryOfNJ;
    }
}
