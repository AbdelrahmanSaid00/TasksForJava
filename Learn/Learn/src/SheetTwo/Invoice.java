package SheetTwo;

public class Invoice {
    private int ID;
    private String description;
    private int quantity;
    private double pricePerItem;
    private static int invoices_count = 0;

    public Invoice(int ID, String description, int quantity, double pricePerItem) {
        this.ID = ID;
        this.description = description;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
        invoices_count++;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0;
    }

    public int getID() { return ID; }
    public String getDescription() { return description; }
    public int getQuantity() { return quantity; }
    public double getPricePerItem() { return pricePerItem; }

    public double subtotal() {
        return quantity * pricePerItem;
    }

    public double total() {
        return subtotal() * 1.05;
    }

    public void display() {
        System.out.println("Invoice ID: " + ID);
        System.out.println("Description: " + description);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + pricePerItem);
        System.out.println("Subtotal: " + subtotal());
        System.out.println("Total (with tax): " + total());
        System.out.println("----------------------------------");
    }

    public static class Cashier {
        private String name;

        public Cashier(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getInvoices() {
            return invoices_count;
        }
    }
}
