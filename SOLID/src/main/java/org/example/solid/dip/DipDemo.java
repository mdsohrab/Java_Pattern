package org.example.solid.dip;

import org.example.solid.dip.after.MySqlDatabase;
import org.example.solid.dip.after.PostgresDatabase;
import org.example.solid.dip.after.UserService;

/**
 * D - Dependency Inversion Principle
 * "High-level modules should not depend on low-level modules.
 *  Both should depend on abstractions."
 */
public class DipDemo {

    public static void main(String[] args) {
        System.out.println("=== DIP: Before ===");
        new org.example.solid.dip.before.UserService().addUser("Sohrab");

        System.out.println("=== DIP: After ===");
        new UserService(new MySqlDatabase()).addUser("Sohrab");
        new UserService(new PostgresDatabase()).addUser("Sohrab"); // swapped without touching UserService
    }
}
