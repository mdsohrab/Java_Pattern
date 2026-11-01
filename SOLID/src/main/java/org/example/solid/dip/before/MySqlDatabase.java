package org.example.solid.dip.before;

/**
 * Low-level module (concrete detail).
 */
public class MySqlDatabase {

    public void connect() {
        System.out.println("[before] Connecting to MySQL...");
    }

    public void saveUser(String user) {
        System.out.println("[before] Saving user to MySQL: " + user);
    }
}
