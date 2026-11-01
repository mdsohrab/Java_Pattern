package org.example.solid.ocp.after;

public class OtpSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("[after] OTP: " + message);
    }
}
