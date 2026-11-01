package org.example.solid.srp.after;

/**
 * ✅ Single responsibility: create invoices.
 */
public class InvoiceGenerator {

    public void generate(Product product) {
        System.out.println("[after] Invoice -> " + product.getName() + " : Rs " + product.getPrice());
    }
}
