package org.example.solid.isp;

import java.util.List;

import org.example.solid.isp.after.HumanWorker;
import org.example.solid.isp.after.RobotWorker;
import org.example.solid.isp.after.Workable;

/**
 * I - Interface Segregation Principle
 * "Clients should not be forced to depend on methods they do not use."
 */
public class IspDemo {

    public static void main(String[] args) {
        System.out.println("=== ISP: Before ===");
        org.example.solid.isp.before.Worker robot = new org.example.solid.isp.before.RobotWorker();
        robot.work();
        try {
            robot.eat();
        } catch (UnsupportedOperationException e) {
            System.out.println("[before] Crash: " + e.getMessage());
        }

        System.out.println("=== ISP: After ===");
        List<Workable> workers = List.of(new HumanWorker(), new RobotWorker());
        for (Workable worker : workers) {
            worker.work();
        }
        new HumanWorker().eat();
    }
}
