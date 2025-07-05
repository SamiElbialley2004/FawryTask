package org.example;
public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }


    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    public boolean isShippable() {
        return product instanceof Shippable ;

    }

    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }


}
