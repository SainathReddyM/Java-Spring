package com.msr.notifications;

public class EmailAndSmsNotifier extends BaseNotification{
    private EmailNotifier emailNotifier = new EmailNotifier();
    private SMSNotifier smsNotifier = new SMSNotifier();

    @Override
    public void sendNotification(String message) {
        emailNotifier.sendNotification(message);
        smsNotifier.sendNotification(message);
    }
}
