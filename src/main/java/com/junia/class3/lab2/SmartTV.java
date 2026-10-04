package com.junia.class3.lab2;

public class SmartTV
        implements Switchable, Connectable {

    @Override
    public void turnOn() {
        System.out.println("Smart TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV is OFF");
    }

    @Override
    public void connect() {
        System.out.println("Smart TV connected");
    }
}