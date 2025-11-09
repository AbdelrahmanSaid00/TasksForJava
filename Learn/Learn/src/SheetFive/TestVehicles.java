package SheetFive;

public class TestVehicles {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Car("Toyota", "Red", 300000, 4, 5);
        vehicles[1] = new Car("BMW", "Black", 500000, 6, 4);
        vehicles[2] = new Truck("Volvo", "White", 800000, 6, 2000);
        vehicles[3] = new Truck("Mercedes", "Blue", 1200000, 8, 5000);
        vehicles[4] = new Car("Kia", "Gray", 250000, 4, 5);

        double totalCarPrice = 0, totalTruckPrice = 0;
        int carCount = 0, truckCount = 0;

        for (Vehicle v : vehicles) {
            System.out.println(v.display());
            if (v instanceof Car) {
                totalCarPrice += v.getPriceWithTax();
                carCount++;
            } else if (v instanceof Truck) {
                totalTruckPrice += v.getPriceWithTax();
                truckCount++;
            }
        }

        System.out.println("\nAverage Car Price: " + (totalCarPrice / carCount));
        System.out.println("Average Truck Price: " + (totalTruckPrice / truckCount));
        System.out.println("Total Vehicles: " + Vehicle.getNumberOfVehicles());
        System.out.println("Total Cars: " + Car.getNumberOfVehicles());
        System.out.println("Total Trucks: " + Truck.getNumberOfVehicles());
    }
}
