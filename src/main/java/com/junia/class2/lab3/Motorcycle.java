package com.junia.class2.lab3;

public class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle(
            String brand,
            String model,
            boolean hasSidecar
    ) {
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void start() {
        System.out.println(
                "Motorcycle " + brand + " " + model
                        + " engine starts."
        );
    }

    @Override
    public void accelerate() {
        speed += 30;

        System.out.println(
                "Motorcycle accelerates to "
                        + speed + " km/h."
        );
    }

    public void performWheelie() {
        System.out.println(
                "The motorcycle performs a wheelie!"
        );
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
}

