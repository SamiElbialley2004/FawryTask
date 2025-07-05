package org.example;

import java.util.List;

public class ShippingService {
    public static double SHIPPING_RATE_PER_KG = 10.0;

    public static double calculateShipping(List<Shippable> items) {
        double totalWeight =0;
        for (Shippable item : items) {
            totalWeight += item.getWeight();
        }  return totalWeight * SHIPPING_RATE_PER_KG;
    }

    public static void shipItems(List<Shippable> items) {
        System.out.println("Shipping items:");
        for (Shippable item : items) {
            System.out.println("- " + item.getName() + ", Weight: " + item.getWeight());
        }
    }
}
