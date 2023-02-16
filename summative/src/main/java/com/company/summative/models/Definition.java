package com.company.summative.models;


public class Definition {
    private int id;
    private String word;
    private String definition;

    public Definition(int id){
        this.setID(id);
    }

    public void setID(int id) {
        this.id = id;
    }
    public int getID() {
        return this.id;
    }

    public void setWord(String word) {
        this.word = word;
    }
    public String getWord(){
        return this.word;
    }
    
    public void setDefinition(String definition){
        this.definition = definition;
    }
    public String getDefinition(){
        return this.definition;
    }
}
