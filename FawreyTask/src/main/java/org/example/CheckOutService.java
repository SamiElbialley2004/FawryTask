package org.example;

import java.util.List;

public class CheckOutService {

     static void checkout(Customer customer) {
        Cart cart = customer.getCart();

        if (cart.isEmpty()) {
            throw new IllegalStateException("Cart is empty.");
        }

        for (CartItem item : cart.getItems()) {
            Product product = item.getProduct();
            int quantity = item.getQuantity();

            if (!product.isAvailable(quantity)) {
                throw new IllegalStateException(product.getName() + " does not have enough stock.");
            }

            if (product instanceof Expirable) {
                Expirable exp = (Expirable) product;
                if (exp.isExpired()) {
                    throw new IllegalStateException(product.getName() + " is expired.");
                }
            }
        }

        double subtotal = cart.calculateSubtotal();
        List<Shippable> shippableItems = cart.getShippableItems();
        double shipping = ShippingService.calculateShipping(shippableItems);
        double total = subtotal + shipping;

        if (!customer.canAfford(total)) {
            throw new IllegalStateException("Insufficient balance. Total: $" + total + ", Balance: $" + customer.getBalance());
        }

        // Deduct and update
        customer.cutFromBalance(total);
        for (CartItem item : cart.getItems()) {
            item.getProduct().reduceStock(item.getQuantity());
        }

        // Print summary
        System.out.println("Checkout Summary for " + customer.getName());
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Shipping: $" + shipping);
        System.out.println("Total Paid: $" + total);
        System.out.println("Remaining Balance: $" + customer.getBalance());

        // Ship
        if (!shippableItems.isEmpty()) {
            ShippingService.shipItems(shippableItems);
        }
    }
}
