package com.junia.class3.lab2;

public class SmartLight
        implements Switchable, Connectable {

    @Override
    public void turnOn() {
        System.out.println("Smart light is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart light is OFF");
    }

    @Override
    public void connect() {
        System.out.println("Smart light connected");
    }
}
