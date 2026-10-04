package com.junia.class2.lab3;

public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(
            String brand,
            String model,
            int numberOfDoors
    ) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println(
                "Car " + brand + " " + model
                        + " engine starts."
        );
    }

    @Override
    public void accelerate() {
        speed += 20;

        System.out.println(
                "Car accelerates to "
                        + speed + " km/h."
        );
    }

    public void openTrunk() {
        System.out.println(
                "The trunk of the car is opened."
        );
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}







