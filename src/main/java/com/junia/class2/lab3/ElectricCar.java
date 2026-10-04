package com.junia.class2.lab3;

public class ElectricCar extends Car {

    private int batteryLevel;

    public ElectricCar(
            String brand,
            String model,
            int numberOfDoors,
            int batteryLevel
    ) {
        super(brand, model, numberOfDoors);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void start() {
        System.out.println(
                "Electric car " + brand + " "
                        + model + " starts silently."
        );
    }

    @Override
    public void accelerate() {
        if (batteryLevel <= 0) {
            System.out.println(
                    "Battery is empty. Cannot accelerate."
            );
            return;
        }

        speed += 25;
        batteryLevel -= 25;

        System.out.println(
                "Electric car accelerates to "
                        + speed + " km/h."
        );

        System.out.println(
                "Battery level: "
                        + batteryLevel + "%"
        );
    }

    public void charge() {
        batteryLevel = 100;

        System.out.println(
                "Electric car is fully charged."
        );
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
