package org.example.solid.lsp.after;

public class Duck extends Bird implements Flyable, Swimmable {

    public Duck() {
        super("Duck");
    }

    @Override
    public void fly() {
        System.out.println("[after] Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("[after] Duck is swimming");
    }
}
