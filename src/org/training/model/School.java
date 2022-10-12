package org.training.model;


import java.util.List;

public class School {
    private int id;
    private String name;

    public School(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }
}



