package com.junia.class2.lab2;

public class SMSNotification extends Notification {

    public SMSNotification(String recipient) {
        super(recipient);
    }

    @Override
    public void send(String message) {
        System.out.println(
                "Sending SMS to " + recipient
                        + ": " + message
        );
    }
}
