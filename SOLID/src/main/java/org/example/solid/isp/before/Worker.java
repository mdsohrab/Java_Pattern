package org.example.solid.isp.before;

/**
 * ❌ "Fat" interface - forces every implementer to support everything.
 */
public interface Worker {
    void work();

    void eat();

    void sleep();
}
