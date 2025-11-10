package SupermarketManagementSystem;

import java.util.Date;

public class ESProduct implements  Product , Comparable<ESProduct> {


    private int ProductID;
    private String name;
    private double price;
    private int itemSold;
    private double Discountrate = 0;
    private String expiryDate;
    private int days;

    public ESProduct(int productID, String name, double price, int itemSold, String expiryDate) {
        ProductID = productID;
        this.name = name;
        this.price = price;
        this.itemSold = itemSold;
        this.expiryDate = expiryDate;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int isItemSold() {
        return itemSold;
    }

    public void setItemSold(int itemSold) {
        this.itemSold = itemSold;
    }

    public double getDiscountrate() {
        return Discountrate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void checkExpirationDate (String currentDate) {
        String [] datePartsForExpiry = expiryDate.split("-");
        String [] datePartsForCurrent = currentDate.split("-");
        int expiryYear = Integer.parseInt(datePartsForExpiry[0]);
        int expiryMonth = Integer.parseInt(datePartsForExpiry[1]);
        int expiryDay = Integer.parseInt(datePartsForExpiry[2]);
        int currentYear = Integer.parseInt(datePartsForCurrent[0]);
        int currentMonth = Integer.parseInt(datePartsForCurrent[1]);
        int currentDay = Integer.parseInt(datePartsForCurrent[2]);
        int diff = (currentYear - expiryYear ) * 365 + (  currentMonth- expiryMonth ) * 30 + ( currentDay - expiryDay );
        this.days = (diff);
        if (diff <= 5 && diff >= 0) {
            this.Discountrate = 20.0;
        }
    }

    @Override
    public double calculatePrice() {
        return price * itemSold * (1 - Discountrate / 100);
    }

    @Override
    public void DisplayDetails() {
        System.out.println("Product ID: " + ProductID);
        System.out.println("ProductName: " + name);
        System.out.println("Price: " + price);
        System.out.println("Items Sold: " + itemSold);
        System.out.println("Discount Rate: " + Discountrate + "%");
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Days until Expiry: " + days);
        System.out.println("Total Price after Discount: " + calculatePrice());
    }

    @Override
    public int compareTo(ESProduct o) {
        return this.expiryDate.compareTo(o.expiryDate);
    }
}
