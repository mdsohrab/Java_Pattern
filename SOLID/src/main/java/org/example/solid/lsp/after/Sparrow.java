package org.example.solid.lsp.after;

public class Sparrow extends Bird implements Flyable {

    public Sparrow() {
        super("Sparrow");
    }

    @Override
    public void fly() {
        System.out.println("[after] Sparrow is flying");
    }
}
