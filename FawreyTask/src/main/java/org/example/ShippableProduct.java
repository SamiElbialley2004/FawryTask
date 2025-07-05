package org.example;

public class ShippableProduct extends Product implements Shippable {
    private float weight;
    public ShippableProduct(String name, double price, int quantity,float weight) {
        super(name, price, quantity);
         this.weight=weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
