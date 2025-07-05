package org.example;

public class Customer {
    private String name;
    private double balance;
    private Cart cart;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.cart = new Cart();
    }
    public boolean canAfford(double amount) { return balance >= amount; }
    public void cutFromBalance(double amount) { if (canAfford(amount)) balance -= amount; }
    public Cart getCart() { return cart; }
    public double getBalance() { return balance; }
    public String getName() { return name; }


}
