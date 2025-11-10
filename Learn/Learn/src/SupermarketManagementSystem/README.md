# Supermarket Management System

A Java-based console application for managing supermarket operations including product inventory, customer shopping carts, and cashier checkout processes.

## Overview

This system simulates a supermarket environment where customers can add products to their cart, cashiers can process transactions, and the system automatically handles product expiration dates with automatic discount application.

## Features

- **Product Management**: Track products with IDs, names, prices, and expiry dates
- **Customer Shopping Cart**: Customers can add and remove products from their cart
- **Automatic Discount System**: Products nearing expiration (within 5 days) receive automatic 20% discount
- **Cashier Checkout**: Process customer purchases and generate receipts
- **Product Sorting**: Sort products by expiry date or price
- **Sales Tracking**: Calculate total sales across all transactions

## Project Structure

```
SupermarketManagementSystem/
├── Person.java              # Base class for Customer and Cashier
├── Customer.java            # Customer class with shopping cart functionality
├── Cashier.java             # Cashier class for processing transactions
├── Product.java             # Interface for product operations
├── ESProduct.java           # Expirable/Saleable Product implementation
├── CustomSorting.java       # Custom comparator for sorting products by price
├── Supermarket.java         # Main application with demo scenarios
└── README.md                # This documentation file
```

## Class Descriptions

### Person (Base Class)
- Base class for Customer and Cashier
- Properties: ID, name, email
- Auto-increments ID for each person created

### Customer (extends Person)
- Manages a shopping cart (list of products)
- Methods:
  - `AddToCart(Product p)`: Add product to cart
  - `DeleteProduct(Product p)`: Remove product from cart
  - `ViewCart()`: Display all products in cart

### Cashier (extends Person)
- Processes customer transactions
- Tracks receipts issued
- Methods:
  - `CalculateTotalSales()`: Calculate total price of all products
  - `PrintReceipt()`: Generate and print detailed receipt

### Product (Interface)
- `calculatePrice()`: Calculate final price (with discounts)
- `DisplayDetails()`: Show product information

### ESProduct (Expirable/Saleable Product)
- Implements `Product` interface and `Comparable<ESProduct>`
- Properties: ProductID, name, price, itemSold, discountRate, expiryDate
- Methods:
  - `checkExpirationDate(String currentDate)`: Apply discount if expiring soon
  - `compareTo(ESProduct o)`: Compare products by expiry date

### CustomSorting
- Implements `Comparator<ESProduct>`
- Enables sorting products by price (ascending order)

## How to Run

1. **Compile the project**:
   ```bash
   javac SupermarketManagementSystem/*.java
   ```

2. **Run the main application**:
   ```bash
   java SupermarketManagementSystem.Supermarket
   ```

## Usage Example

The `Supermarket.java` file contains a complete demonstration:

```java
// Create products with expiry dates
ESProduct milk = new ESProduct(1, "Milk", 25.0, 2, "2025-11-12");

// Create customers
Customer customer1 = new Customer("Alice", "alice@gmail.com");
customer1.AddToCart(milk);

// Process checkout with cashier
Cashier cashier1 = new Cashier(customer1.getProducts(), "Bob", "bob@gmail.com");
cashier1.PrintReceipt();
```

## Key Functionalities Demonstrated

1. **Expiry Date Management**: Products within 5 days of expiration automatically receive 20% discount
2. **Shopping Cart Operations**: Add/remove products and view cart contents
3. **Receipt Generation**: Detailed receipts with item counts and total sales
4. **Product Sorting**: 
   - By expiry date (using Comparable interface)
   - By price (using custom Comparator)
5. **Sales Analytics**: Track total sales across all cashier transactions

## Sample Output

```
Receipt #1
Product ID: 1
ProductName: Milk
Price: 25.0
Items Sold: 2
Discount Rate: 20.0%
Total Price after Discount: 40.0
---------------------------
Total Sales: $40.0 for 3 items.
The Id of the Casher: 2
The name of the Casher: Bob
---------------------------
Thank you for shopping with us!
---------------------------
```

## Design Patterns Used

- **Inheritance**: Person → Customer, Cashier
- **Interface Implementation**: Product interface implemented by ESProduct
- **Comparable/Comparator**: For flexible product sorting
- **Encapsulation**: Private fields with public getters/setters

## Author

Learning project demonstrating OOP concepts in Java including inheritance, interfaces, polymorphism, and collections.


