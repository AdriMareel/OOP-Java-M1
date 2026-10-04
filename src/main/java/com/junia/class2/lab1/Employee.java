package com.junia.class2.lab1;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public void displayInfo() {
        System.out.println(
                "Name: " + name + ", Salary: " + salary
        );
    }
}
