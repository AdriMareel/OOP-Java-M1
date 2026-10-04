package com.junia.class2.lab3;

import java.util.List;

public class VehicleService {

    public static void startFleet(
            List<Vehicle> fleet
    ) {
        for (Vehicle vehicle : fleet) {
            vehicle.start();
        }
    }



    public static void accelerateFleet(
            List<Vehicle> fleet
    ) {
        for (Vehicle vehicle : fleet) {
            vehicle.accelerate();
        }
    }

    public static void stopFleet(
            List<Vehicle> fleet
    ) {
        for (Vehicle vehicle : fleet) {
            vehicle.stop();
        }
    }
}
