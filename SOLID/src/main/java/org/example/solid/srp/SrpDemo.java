package org.example.solid.srp;

import org.example.solid.srp.after.InvoiceGenerator;
import org.example.solid.srp.after.Product;
import org.example.solid.srp.after.ProductRepository;

/**
 * S - Single Responsibility Principle
 * "A class should have only one reason to change."
 */
public class SrpDemo {

    public static void main(String[] args) {
        System.out.println("=== SRP: Before ===");
        org.example.solid.srp.before.Product oldProduct =
                new org.example.solid.srp.before.Product("Laptop", 55000);
        oldProduct.saveToDatabase();
        oldProduct.generateInvoice();

        System.out.println("=== SRP: After ===");
        Product product = new Product("Laptop", 55000);
        new ProductRepository().save(product);
        new InvoiceGenerator().generate(product);
    }
}
