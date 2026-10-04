package com.junia.class2.lab3;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> fleet = List.of(
                new Car("Toyota", "Yaris", 5),
                new Car("Peugeot", "308", 5),

                new Motorcycle(
                        "Yamaha",
                        "MT-07",
                        false
                ),

                new Motorcycle(
                        "Harley-Davidson",
                        "Iron 883",
                        false
                ),

                new Truck(
                        "Volvo",
                        "FH",
                        25.0
                ),

                new Truck(
                        "Mercedes",
                        "Actros",
                        30.0
                ),

                new ElectricCar(
                        "Tesla",
                        "Model 3",
                        4,
                        80
                )
        );

        System.out.println("=== STARTING FLEET ===");

        VehicleService.startFleet(fleet);

        System.out.println();

        System.out.println("=== ACCELERATING FLEET ===");

        VehicleService.accelerateFleet(fleet);

        System.out.println();

        System.out.println("=== STOPPING FLEET ===");

        VehicleService.stopFleet(fleet);
    }
}
