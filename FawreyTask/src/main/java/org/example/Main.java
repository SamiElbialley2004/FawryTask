package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Sample products
        Product cheese = new ShippableExpirableProduct("Cheddar Cheese", 5.0, 10,10 ,LocalDate.now().plusDays(3));
        Product tv = new ShippableProduct("Smart TV", 300.0, 5, 10);
        Product biscuit = new ExpirableProduct("Oreo Biscuits", 2.5, 20, LocalDate.now().plusDays(5));
        Product scratchCard = new Product("Recharge Card", 1.0, 50) {
        };

        // Create customer
        Customer customer = new Customer("John Doe", 110000.0);

        // Add items to cart
        customer.getCart().addItem(cheese, 2);
        customer.getCart().addItem(tv, 1);
        customer.getCart().addItem(biscuit, 3);
        customer.getCart().addItem(scratchCard, 5);

        // Perform checkout
        try {
            CheckOutService.checkout(customer);
        } catch (Exception e) {
            System.out.println("Checkout failed: " + e.getMessage());
        }
    }
}