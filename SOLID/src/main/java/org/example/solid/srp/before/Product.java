package org.example.solid.srp.before;

/**
 * ❌ Violates SRP.
 *
 * This class has THREE reasons to change:
 *  1. Product data changes (new fields)
 *  2. Database / persistence logic changes
 *  3. Invoice format changes
 */
public class Product {

    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void saveToDatabase() {
        System.out.println("[before] Saving " + name + " to database");
    }

    public void generateInvoice() {
        System.out.println("[before] Invoice -> " + name + " : Rs " + price);
    }
}
