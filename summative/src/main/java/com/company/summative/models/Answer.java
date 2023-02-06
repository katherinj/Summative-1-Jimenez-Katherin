package com.company.summative.models;

import java.util.List;

public class Answer {
    private String[] potentialAnswers = {
            "Signs point to yes",
            "My reply is no.",
            "Concentrate and ask again",
            "It is certain",
            "Outlook not so good",
            "My sources say no"
    };
    private int id;
    private String question;
    private String answer;
    private List<String> answers;

    public Answer(String q, int id){
        this.question = q;
        this.id = id;
        answer = potentialAnswers[(int)(Math.random() * ((potentialAnswers.length-1) + 1))];
    }

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
    public void setAnswer(){
        answer = potentialAnswers[(int)(Math.random() * ((potentialAnswers.length-1) + 1))];
    }
}
