package org.example.solid.dip.before;

/**
 * ❌ Violates DIP.
 *
 * High-level module creates and depends directly on a concrete
 * low-level class. Switching to Postgres means editing this class.
 */
public class UserService {

    private final MySqlDatabase database;

    public UserService() {
        this.database = new MySqlDatabase(); // tight coupling
    }

    public void addUser(String user) {
        database.connect();
        database.saveUser(user);
    }
}
