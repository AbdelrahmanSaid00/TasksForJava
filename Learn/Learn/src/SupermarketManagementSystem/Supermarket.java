package SupermarketManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Supermarket {
    public static void main(String[] args) {
        ESProduct [] products = {
                new ESProduct(1, "Milk", 25.0, 2, "2025-11-12"),
                new ESProduct(2, "Bread", 10.0, 3, "2025-11-15"),
                new ESProduct(3, "Apple", 5.0, 10, "2025-11-11"),
                new ESProduct(4, "Yogurt", 12.0, 4, "2025-11-13"),
                new ESProduct(5, "Cheese", 40.0, 1, "2025-11-25")
        };
        for(ESProduct p : products) {
            p.checkExpirationDate("2025-11-30");
        }
        System.out.println("----------------------");

        Customer customer1 = new Customer("Alice", "alice@gmail.com");
        customer1.AddToCart(products[0]);
        customer1.AddToCart(products[2]);
        customer1.AddToCart(products[4]);
        Customer customer2 = new Customer("John", "john@gmail.com");
        customer2.AddToCart(products[1]);
        customer2.AddToCart(products[3]);
        System.out.println("Customer1 Cart:");
        customer1.ViewCart();
        System.out.println("\nCustomer2 Cart:");
        customer2.ViewCart();
        Cashier cashier1 = new Cashier(customer1.getProducts(), "Bob", "bob@gmail.com");
        System.out.println("\nPrinting Receipt:");
        cashier1.PrintReceipt();
        Cashier cashier2 = new Cashier(customer2.getProducts(), "Eve", "eve@e.com");
        System.out.println("\nPrinting Receipt:");
        cashier2.PrintReceipt();


        System.out.println("----------------------");
        System.out.println("Products with the Discount Applied:");
        List<ESProduct> productList = new ArrayList<>();
        for (ESProduct p : products) {
            if (p.getDiscountrate() > 0) {
                p.DisplayDetails();
                productList.add(p);
            }
        }
        System.out.println("----------------------");
        System.out.println("Products Sorted by Expiry Date:");
        Collections.sort(productList);
        for (ESProduct p : productList) {
            p.DisplayDetails();
        }

        System.out.println("----------------------");
        System.out.println("Sort the products base on the price ");

        CustomSorting sorting = new CustomSorting();
        List<ESProduct> productList2 = new ArrayList<>();
        for (ESProduct p : products) {
            productList2.add(p);
        }
        Collections.sort(productList2 ,sorting);

        for (ESProduct p : productList2) {
            p.DisplayDetails();
        }


        System.out.println("----------------------");
        System.out.println("Total Sales from all Cashiers:");
        double totalSales = cashier1.CalculateTotalSales() + cashier2.CalculateTotalSales();
        System.out.println("Total Sales: $" + totalSales);
    }
}
