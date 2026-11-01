package org.example.solid.srp.after;

/**
 * ✅ Single responsibility: persist products.
 */
public class ProductRepository {

    public void save(Product product) {
        System.out.println("[after] Saving " + product.getName() + " to database");
    }
}
