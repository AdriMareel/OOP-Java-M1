package com.junia.class2.lab2;

public class Notification {

    protected String recipient;

    public Notification(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    public void send(String message) {
        System.out.println("Sending notification to " + recipient + ": " + message);
    }
}
