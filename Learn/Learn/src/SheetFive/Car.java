package SheetFive;

public class Car extends Vehicle{
    private int numberOfPassengers;
    private static int numberOfVehicles = 0;

    public Car(String name, String color, double price, int numberOfCylinders, int numberOfPassengers) {
        super(name, color, price, numberOfCylinders);
        this.numberOfPassengers = numberOfPassengers;
        numberOfVehicles++;
    }

    public int getNumberOfPassengers() { return numberOfPassengers; }
    public void setNumberOfPassengers(int numberOfPassengers) { this.numberOfPassengers = numberOfPassengers; }

    public static int getNumberOfVehicles() { return numberOfVehicles; }

    @Override
    public double getPriceWithTax() {
        double taxRate = (getNumberOfCylinders() <= 4) ? 0.15 : 0.30;
        return getPrice() + getPrice() * taxRate;
    }

    @Override
    public String display() {
        return "Car: " + getName() + ", Color: " + getColor() + ", Cylinders: " + getNumberOfCylinders() +
                ", Passengers: " + numberOfPassengers + ", Price with Tax: " + getPriceWithTax();
    }
}
