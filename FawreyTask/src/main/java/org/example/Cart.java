package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addItem(Product product, int quantity) {
        if (!product.isAvailable(quantity)) {
            throw new IllegalArgumentException(product.getName() + " is out of stock.");
        }
        items.add(new CartItem(product, quantity));
    }
    public boolean isEmpty() { return items.isEmpty(); }
    public double calculateSubtotal() {
        double subtotal = 0;
        for (CartItem item : items) {
            subtotal += item.getTotalPrice();
        }
        return subtotal;
    }
    public List<Shippable> getShippableItems() {

        List<Shippable> shippables = new ArrayList<>();
        for (CartItem item : items) {
            if (item.isShippable()) {
                shippables.add((Shippable) item.getProduct());
            }
        }
        return shippables;
    }
    public List<CartItem> getItems() { return items; }

}
