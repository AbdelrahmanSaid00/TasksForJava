package SupermarketManagementSystem;

import java.util.List;

public class Cashier extends Person{
    private static int receiptsIssued =0;
    private List<Product> products;
    public Cashier(List<Product> products , String name, String email) {
        super(name, email);
        this.products =(products);
    }
    public double CalculateTotalSales() {
        if (products.isEmpty()) {
            System.out.println("No products sold.");
            return 0;
        }
        double totalSales = 0;
        for (Product p : products) {
            totalSales += p.calculatePrice();
        }
        return totalSales;
    }
    public void PrintReceipt() {
        if (products.isEmpty()) {
            System.out.println("No products sold. Cannot print receipt.");
            return;
        }
        receiptsIssued++;
        int counter =0;
        System.out.println("Receipt #" + receiptsIssued);
        for (Product p : products) {
            p.DisplayDetails();
            counter++;
        }
        System.out.println("---------------------------");
        System.out.println("Total Sales: $" + CalculateTotalSales() + " for " + counter + " items.");
        System.out.println("The Id of the Casher" + getId());
        System.out.println("The name of the Casher" + getName());
        System.out.println("---------------------------");
        System.out.println("Thank you for shopping with us!");
        System.out.println("---------------------------");

    }

}
