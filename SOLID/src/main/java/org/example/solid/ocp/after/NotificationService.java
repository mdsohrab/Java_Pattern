package org.example.solid.ocp.after;

/**
 * ✅ CLOSED for modification: works with any NotificationSender,
 * so it never changes when new senders are added.
 */
public class NotificationService {

    public void notify(NotificationSender sender, String message) {
        sender.send(message);
    }
}
