package org.example.solid.isp.after;

/**
 * ✅ Robot implements ONLY the interface it actually needs.
 */
public class RobotWorker implements Workable {

    @Override
    public void work() {
        System.out.println("[after] Robot is working");
    }
}
