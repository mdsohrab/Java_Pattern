package org.example.solid.dip.after;

public class PostgresDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("[after] Connecting to PostgreSQL...");
    }

    @Override
    public void saveUser(String user) {
        System.out.println("[after] Saving user to PostgreSQL: " + user);
    }
}
