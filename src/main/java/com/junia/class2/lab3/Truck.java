package com.junia.class2.lab3;

public class Truck extends Vehicle {

    private double cargoCapacity;

    public Truck(
            String brand,
            String model,
            double cargoCapacity
    ) {
        super(brand, model);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start() {
        System.out.println(
                "Truck " + brand + " " + model
                        + " engine starts."
        );
    }

    @Override
    public void accelerate() {
        speed += 10;

        System.out.println(
                "Truck accelerates to "
                        + speed + " km/h."
        );
    }

    public void loadCargo() {
        System.out.println(
                "Cargo loaded. Capacity: "
                        + cargoCapacity + " tons."
        );
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }
}
