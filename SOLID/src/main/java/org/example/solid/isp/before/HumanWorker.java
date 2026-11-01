package org.example.solid.isp.before;

public class HumanWorker implements Worker {

    @Override
    public void work() {
        System.out.println("[before] Human is working");
    }

    @Override
    public void eat() {
        System.out.println("[before] Human is eating");
    }

    @Override
    public void sleep() {
        System.out.println("[before] Human is sleeping");
    }
}
