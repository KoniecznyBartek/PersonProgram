package org.training.model;

import java.util.List;

public class Person {

    private String name;
    private int age;
    private String mail;
    private List<Integer> classes;


    public Person(String n, int a, String m,  List<Integer> classes) {
        this.name = n;
        this.age = a;
        this.mail = m;

        this.classes = classes;
    }


    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String m) {
        this.mail = m;
    }

    public String toString() {
        return this.name + " " + this.age +" "+ this.mail;
    }

    public List<Integer> getClasses() {
        return classes;
    }

    public void setClasses(List<Integer> classes) {
        this.classes = classes;
    }


}
