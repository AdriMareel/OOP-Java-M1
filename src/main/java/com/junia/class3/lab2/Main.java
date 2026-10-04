package com.junia.class3.lab2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        SmartLight light = new SmartLight();
        SmartTV tv = new SmartTV();
        SmartSpeaker speaker = new SmartSpeaker();

        List<Connectable> devices =
                List.of(light, tv, speaker);

        for (Connectable device : devices) {
            device.connect();
        }

        //same objects can be seen through different interfaces
        List<Switchable> switchableDevices =
                List.of(light, tv);

        for (Switchable device : switchableDevices) {
            device.turnOn();
        }
    }
}
