package org.example.solid.ocp.after;

/**
 * ✅ NEW feature added by creating a NEW class.
 * No existing class was modified.
 */
public class WhatsAppSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("[after] WhatsApp: " + message);
    }
}
