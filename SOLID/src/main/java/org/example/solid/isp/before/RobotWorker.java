package org.example.solid.isp.before;

/**
 * ❌ Violates ISP.
 *
 * A robot is forced to implement eat() and sleep() which it never uses.
 */
public class RobotWorker implements Worker {

    @Override
    public void work() {
        System.out.println("[before] Robot is working");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat!");
    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException("Robots don't sleep!");
    }
}
