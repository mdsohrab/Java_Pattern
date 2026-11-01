package org.example.solid.ocp.before;

/**
 * ❌ Violates OCP.
 *
 * Every new notification type (WhatsApp, Push, ...) forces us to
 * MODIFY this class and add another else-if branch.
 */
public class NotificationService {

    public void sendNotification(String type) {
        if (type.equals("EMAIL")) {
            System.out.println("[before] Sending Email");
        } else if (type.equals("SMS")) {
            System.out.println("[before] Sending SMS");
        } else if (type.equals("OTP")) {
            System.out.println("[before] Sending OTP");
        } else {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
