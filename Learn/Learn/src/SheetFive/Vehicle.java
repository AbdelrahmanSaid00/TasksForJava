package SheetFive;

public class Vehicle {

    private String name;
    private String color;
    private double price;
    private int numberOfCylinders;
    protected static int numberOfVehicles = 0;

    public Vehicle() {
        this("Unknown", "White", 0.0, 0);
    }

    public Vehicle(String name, String color, double price, int numberOfCylinders) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.numberOfCylinders = numberOfCylinders;
        numberOfVehicles++;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getNumberOfCylinders() { return numberOfCylinders; }
    public void setNumberOfCylinders(int numberOfCylinders) { this.numberOfCylinders = numberOfCylinders; }

    public static int getNumberOfVehicles() { return numberOfVehicles; }

    public double getPriceWithTax() {
        return price;
    }

    public String display() {
        return "Vehicle: " + name + ", Color: " + color + ", Cylinders: " + numberOfCylinders + ", Price: " + price;
    }
}
