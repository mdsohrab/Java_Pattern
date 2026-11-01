package org.example.solid.ocp;

import java.util.List;

import org.example.solid.ocp.after.EmailSender;
import org.example.solid.ocp.after.NotificationSender;
import org.example.solid.ocp.after.NotificationService;
import org.example.solid.ocp.after.OtpSender;
import org.example.solid.ocp.after.SmsSender;
import org.example.solid.ocp.after.WhatsAppSender;

/**
 * O - Open/Closed Principle
 * "Software entities should be open for extension, but closed for modification."
 */
public class OcpDemo {

    public static void main(String[] args) {
        System.out.println("=== OCP: Before ===");
        org.example.solid.ocp.before.NotificationService oldService =
                new org.example.solid.ocp.before.NotificationService();
        oldService.sendNotification("EMAIL");
        oldService.sendNotification("SMS");

        System.out.println("=== OCP: After ===");
        NotificationService service = new NotificationService();
        List<NotificationSender> senders = List.of(
                new EmailSender(), new SmsSender(), new OtpSender(), new WhatsAppSender());
        for (NotificationSender sender : senders) {
            service.notify(sender, "Your order is confirmed");
        }
    }
}
