package com.junia.class2.lab2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Notification> notifications = List.of(
                new EmailNotification("alice@example.com"),
                new SMSNotification("+33 6 12 34 56 78"),
                new PushNotification("user-123")
        );

        for (Notification notification : notifications) {
            notification.send("A new product is now available !");
        }

        //improved version
        NotificationService.sendNotifications(
                notifications,
                "A brand new product is now available !"
        );
    }
}
