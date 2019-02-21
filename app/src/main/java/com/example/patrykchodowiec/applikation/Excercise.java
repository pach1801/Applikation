package com.example.patrykchodowiec.applikation;

public class Excercise {
    private String name;
    private String set;
    private String rep;


    public Excercise(String name, String set, String rep) {
        this.name = name;
        this.set = set;
        this.rep = rep;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }


    public String getRep() {
        return rep;
    }

    public void setRep(String rep) {
        this.rep = rep;
    }
}
