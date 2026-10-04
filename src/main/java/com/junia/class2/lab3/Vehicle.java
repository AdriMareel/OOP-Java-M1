package com.junia.class2.lab3;

public class Vehicle {

    protected String brand;
    protected String model;
    protected int speed;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void start() {
        System.out.println(
                brand + " " + model + " starts."
        );
    }

    public void accelerate() {
        speed += 10;

        System.out.println(
                brand + " " + model
                        + " accelerates to " + speed + " km/h."
        );
    }

    public void stop() {
        speed = 0;

        System.out.println(
                brand + " " + model + " stops."
        );
    }

    public void displayInfo() {
        System.out.println(
                brand + " " + model
                        + " - " + speed + " km/h"
        );
    }
}




