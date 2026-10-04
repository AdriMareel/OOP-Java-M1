package com.junia.class2.lab2;

import java.util.List;

public class NotificationService {

    public static void sendNotifications(
            List<Notification> notifications,
            String message
    ) {
        for (Notification notification : notifications) {
            notification.send(message);
        }
    }
}
