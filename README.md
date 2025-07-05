# FawryTask
# E-Commerce System in Java

A simple object-oriented e-commerce simulation written in Java. This project demonstrates key principles like abstraction, interfaces, polymorphism, and exception handling.

## Features

- Define products with name, price, and quantity
- Support for expirable and shippable items (e.g., Cheese, TV, Biscuits)
- Add products to a shopping cart with quantity checks
- Handle product expiration and out-of-stock errors
- Checkout process with:
  - Subtotal calculation
  - Shipping cost (per kg)
  - Payment with balance deduction
  - Summary and shipping output
- Use of interfaces (`Expirable`, `ShippableItem`) for flexible design

## Structure

- `Product` - Abstract base class for all products
- `Cheese`, `TV`, `Biscuit`, `MobileScratchCard` - Product types
- `Expirable`, `Shippable` - Behavior interfaces
- `Cart`, `CartItem`, `Customer` - Core shopping components
- `ShippingService`, `CheckoutService` - Business logic
- `Main` - Example usage of the system

## How to Run

1. Clone the repository
2. Compile the `.java` files
3. Run `Main.java` to simulate a full checkout scenario

## Example Output
Checkout Summary for John Doe
Subtotal: $322.5
Shipping: $200.0
Total Paid: $522.5
Remaining Balance: $109477.5
Shipping items:
- Cheddar Cheese, Weight: 10.0
- Smart TV, Weight: 10.0

