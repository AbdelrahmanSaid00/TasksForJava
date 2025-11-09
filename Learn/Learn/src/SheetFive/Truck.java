package SheetFive;

public class Truck extends Vehicle{
    private int capacity;
    private static int numberOfVehicles = 0;

    public Truck(String name, String color, double price, int numberOfCylinders, int capacity) {
        super(name, color, price, numberOfCylinders);
        this.capacity = capacity;
        numberOfVehicles++;
    }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public static int getNumberOfVehicles() { return numberOfVehicles; }

    @Override
    public double getPriceWithTax() {
        double taxRate;
        if (getNumberOfCylinders() <= 6 && capacity < 3500)
            taxRate = 0.10;
        else
            taxRate = 0.20;
        return getPrice() + getPrice() * taxRate;
    }

    @Override
    public String display() {
        return "Truck: " + getName() + ", Color: " + getColor() + ", Cylinders: " + getNumberOfCylinders() +
                ", Capacity: " + capacity + "kg, Price with Tax: " + getPriceWithTax();
    }
}
