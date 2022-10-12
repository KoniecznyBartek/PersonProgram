package org.training.service;

import org.training.model.Person;
import org.training.util.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.training.util.Utils.*;


public class PersonService {

    static HashMap<Integer, Person> people = new HashMap<>();
    static int i =1;

    public static void init() {

        Person Bartek = new Person("Bartek", 25, "Twojstary@gmail",List.of(1));
        Person Zosia = new Person("Zosia", 22, "Twojastar@gmail.com",List.of(2));
        Person Maciek = new Person("Maciek", 24, "rura@yahoo.pl",List.of(3));

        people.put(i++, Bartek);
        people.put(i++, Zosia);
        people.put(i++, Maciek);
        people.forEach((key, value) -> System.out.println(key + ":" + value.toString()));
        System.out.println("========");

    }


    public static Person getPerson(int choice) {

        try {
            return people.get(choice);
        } catch (Exception e) {
//            todo: use throw
            return null;
        }
    }


    public static void editAge() {
        int choice = Utils.readInt(getPersonIdMessage());
        Person p = getPerson(choice);
        p.setAge(Utils.readInt(getPersonAgeMessage()));
        people.put(choice, p);

        System.out.println(p.toString());

    }
    public static void editMail() {
        int choice = Utils.readInt(getPersonIdMessage());
        Person p = getPerson(choice);
        p.setMail(Utils.readString(getPersonMailMessage()));
        people.put(choice, p);

        System.out.println(p.toString());
    }
//    public static void addPerson(){
//
//
//        String name = new String();
//        int age = 0;
//        String mail = new String();
//        Person newPerson = new Person(name,age,mail,);
//        newPerson.setName(readString(getPersonNameMessage()));
//        newPerson.setAge(readInt(getPersonAgeMessage()));
//        newPerson.setMail(readString(getPersonMailMessage()));
//
//        people.put(i++,newPerson);
//        System.out.println(newPerson.toString());
//    }
    public static void removePerson(){
        int choice = Utils.readInt(removingNameMessage());
        Person p = getPerson(choice);
        people.remove(choice, p);
        System.out.println(p.toString());
    }

    public static void printBase() {
        people.forEach((k,v) -> System.out.println(k.toString() + ": " + v.toString()));
    }






}
