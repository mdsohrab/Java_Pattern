package org.example.solid.isp.after;

public class HumanWorker implements Workable, Eatable, Sleepable {

    @Override
    public void work() {
        System.out.println("[after] Human is working");
    }

    @Override
    public void eat() {
        System.out.println("[after] Human is eating");
    }

    @Override
    public void sleep() {
        System.out.println("[after] Human is sleeping");
    }
}
