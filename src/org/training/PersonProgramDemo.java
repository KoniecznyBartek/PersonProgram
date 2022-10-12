package org.training;


import org.training.model.Database;

import org.training.service.PersonService;
import org.training.util.Utils;

import static org.training.util.Utils.*;


public class PersonProgramDemo {


    public static void main(String[] args) {
        PersonService.init();
        Database.initDb();
        menu();

    }

    private static void menu() {
        Utils.printMenu();
        int option = Utils.readInt(getOptionMessage());

        if (option == 1) {
            PersonService.printBase();
        } else if (option == 2) {
            int data = Utils.readInt(getDataOptionMessage());
            if (data == 1) {
                PersonService.editAge();
            }
            if (data == 2) {
                PersonService.editMail();
            } else menu();
        } else if (option == 3) {
//            PersonService.addPerson();
            System.out.println("x");
        } else if (option == 4) {
            PersonService.removePerson();
        } else if (option == 5) {
            int choice = Utils.readInt(getPersonIdMessage());
            System.out.println(PersonService.getPerson(choice).toString());
        } else if (option == 0) {
            System.exit(420);
        } else {
            menu();
        }
        menu();
    }

}









