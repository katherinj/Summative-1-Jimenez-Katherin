package com.company.summative.models;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class Answer {
    private int id;
    private String question;
    private String answer;
    private List<String> answers;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getQuestion(){
        return question;
    }
    public void setQuestion(String q){
        this.question = q;
    }

    public String getAnswer(){
        return answer;
    }
    public void setAnswer(String answer){
        this.answer = answer;
    }
}
