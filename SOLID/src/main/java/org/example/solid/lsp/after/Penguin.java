package org.example.solid.lsp.after;

/**
 * ✅ Penguin only promises what it can actually do: swim.
 */
public class Penguin extends Bird implements Swimmable {

    public Penguin() {
        super("Penguin");
    }

    @Override
    public void swim() {
        System.out.println("[after] Penguin is swimming");
    }
}
