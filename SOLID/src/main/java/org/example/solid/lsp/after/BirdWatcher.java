package org.example.solid.lsp.after;

/**
 * Client code depends on capabilities, so any Flyable / Swimmable
 * can be substituted safely - no surprises at runtime.
 */
public class BirdWatcher {

    public void watchFly(Flyable bird) {
        bird.fly();
    }

    public void watchSwim(Swimmable bird) {
        bird.swim();
    }
}
