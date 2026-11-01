package org.example.solid.dip.after;

/**
 * ✅ Follows DIP.
 *
 * Depends on the Database abstraction. The concrete database is
 * injected from outside (constructor injection).
 */
public class UserService {

    private final Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public void addUser(String user) {
        database.connect();
        database.saveUser(user);
    }
}
