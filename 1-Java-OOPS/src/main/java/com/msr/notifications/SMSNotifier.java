package com.msr.notifications;

public class SMSNotifier extends BaseNotification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS Notification: " + message);
    }
}
