package org.example.solid.dip.after;

/**
 * ✅ Abstraction that BOTH high-level and low-level modules depend on.
 */
public interface Database {
    void connect();

    void saveUser(String user);
}
