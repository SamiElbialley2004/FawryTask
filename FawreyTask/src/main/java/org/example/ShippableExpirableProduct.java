package org.example;

import java.io.Serializable;
import java.time.LocalDate;

public class ShippableExpirableProduct extends Product implements Shippable, Expirable{
    private float weight;
    private LocalDate expirationDate;
    public ShippableExpirableProduct(String name, double price, int quantity, float weight, LocalDate expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
        this.weight=weight;

    }




    @Override
    public String getExpirationDate() {
        return expirationDate.toString();
    }

    @Override
    public boolean isExpired() {
        LocalDate now = LocalDate.now();
        return expirationDate.isBefore(now);
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
