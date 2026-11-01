package org.example.solid.lsp.after;

/**
 * ✅ Base class contains ONLY behaviour that every bird truly shares.
 */
public abstract class Bird {

    private final String name;

    protected Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("[after] " + name + " is eating");
    }
}
