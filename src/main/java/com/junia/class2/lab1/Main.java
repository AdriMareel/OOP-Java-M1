package com.junia.class2.lab1;

public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer(
                "Alice",
                45000,
                "Java"
        );

        Manager manager = new Manager(
                "Bob",
                60000,
                8
        );

        engineer.displayInfo();
        engineer.work();
        engineer.writeCode();

        System.out.println("-----------");

        manager.displayInfo();
        manager.work();
        manager.organizeMeeting();
    }
}
