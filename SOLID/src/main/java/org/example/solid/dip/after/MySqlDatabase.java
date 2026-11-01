package org.example.solid.dip.after;

public class MySqlDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("[after] Connecting to MySQL...");
    }

    @Override
    public void saveUser(String user) {
        System.out.println("[after] Saving user to MySQL: " + user);
    }
}
