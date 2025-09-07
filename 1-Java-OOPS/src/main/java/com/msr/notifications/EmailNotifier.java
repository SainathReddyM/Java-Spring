package com.msr.notifications;

public class EmailNotifier extends BaseNotification{

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email Notification: " + message);
    }
}
