package com.junia.class3.lab2;

public class SmartSpeaker
        implements Connectable {

    @Override
    public void connect() {
        System.out.println("Smart speaker connected");
    }
}
