package com.backend.chatbot.hr;

class ResponseToQuery{
    String question;
    String answer;
    String email;
    int qid;

    public ResponseToQuery(String question, String answer, String email, int qid) {
        this.question = question;
        this.answer = answer;

        this.qid = qid;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }
}