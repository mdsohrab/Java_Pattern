package org.example.solid.lsp;

import org.example.solid.lsp.after.BirdWatcher;
import org.example.solid.lsp.after.Duck;
import org.example.solid.lsp.after.Penguin;
import org.example.solid.lsp.after.Sparrow;

/**
 * L - Liskov Substitution Principle
 * "Objects of a subclass should be replaceable with objects of the
 *  superclass without breaking the program."
 */
public class LspDemo {

    public static void main(String[] args) {
        System.out.println("=== LSP: Before ===");
        org.example.solid.lsp.before.Bird bird = new org.example.solid.lsp.before.Penguin();
        try {
            bird.fly();
        } catch (UnsupportedOperationException e) {
            System.out.println("[before] Crash: " + e.getMessage());
        }

        System.out.println("=== LSP: After ===");
        BirdWatcher watcher = new BirdWatcher();
        Sparrow sparrow = new Sparrow();
        Duck duck = new Duck();
        Penguin penguin = new Penguin();

        watcher.watchFly(sparrow);
        watcher.watchFly(duck);
        watcher.watchSwim(duck);
        watcher.watchSwim(penguin);
        // watcher.watchFly(penguin);  // <- does not even compile. Safe by design!
        penguin.eat();
    }
}
