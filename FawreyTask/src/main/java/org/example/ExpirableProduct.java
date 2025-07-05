package org.example;

import java.time.LocalDate;

public class ExpirableProduct extends Product implements Expirable {

    private LocalDate expirationDate;
    public ExpirableProduct(String name, double price, int quantity, LocalDate expirationDate) {
        super(name, price, quantity);
       this.expirationDate = expirationDate;
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
}
