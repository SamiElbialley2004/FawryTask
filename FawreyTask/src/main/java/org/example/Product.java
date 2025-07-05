package org.example;

public abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public boolean isAvailable(int requestedQty) {
        return quantity >= requestedQty;
    }

    public void reduceStock(int qty) {
        if (isAvailable(qty)) quantity -= qty;
    }
}
