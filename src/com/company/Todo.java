package com.company;

public class Todo {

    private String descripion;
    private boolean done = false;
    private int id;

    void setDescripion(String descripion){
        this.descripion = descripion;
    }

    void setDone(boolean done){
        this.done = done;
    }

    void setId(int id){
        this.id = id;
    }

    String getDescripion(){
        return descripion;
    }

    int getId(){
        return id;
    }

    boolean getDone(){
        return done;
    }


}
