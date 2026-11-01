package org.example.solid.lsp.before;

/**
 * ❌ Violates LSP.
 *
 * A Penguin IS-A Bird, but it cannot be substituted for a Bird:
 * any code calling bird.fly() will crash at runtime.
 */
public class Penguin extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly!");
    }
}
