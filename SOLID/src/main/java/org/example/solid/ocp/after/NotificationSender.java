package org.example.solid.ocp.after;

/**
 * ✅ The abstraction that keeps the system OPEN for extension.
 */
public interface NotificationSender {
    void send(String message);
}
