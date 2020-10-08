package com.backend.chatbot.query;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class QueryOfNJ {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "query")
    private String question;

    @Column(name = "emailId")
    private String email;

    @Column(name = "isAnswered")
    private Boolean isAnswerd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsAnswerd() {
        return isAnswerd;
    }

    public void setIsAnswerd(Boolean answerd) {
        isAnswerd = answerd;
    }
}
