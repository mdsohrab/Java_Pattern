package org.example.solid.ocp.after;

public class SmsSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("[after] SMS: " + message);
    }
}
