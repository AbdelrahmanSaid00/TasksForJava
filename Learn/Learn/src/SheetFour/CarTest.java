package SheetFour;

import java.util.ArrayList;

public class CarTest {
    static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "X5", 50000, 2015));
        cars.add(new Car("BMW", "X5", 52000, 2016));
        cars.add(new Car("BMW", "M3", 60000, 2020));
        cars.add(new Car("TOYOTA", "Corolla", 15000, 2011));
        cars.add(new Car("TOYOTA", "Camry", 20000, 2015));
        cars.add(new Car("TOYOTA", "Corolla", 15000, 2010));
        cars.add(new Car("TOYOTA", "Corolla", 15000, 2014));
        cars.add(new Car("HONDA", "Civic", 18000, 2018));

        Car car1 = new Car("BMW", "X5", 50000, 2015);
        Car car2 = new Car("BMW", "X5", 48000, 2018);
        Car car3 = new Car("TOYOTA", "Camry", 18000, 2015);


        System.out.println("If Car1 is equal to car2 " + car1.equals(car2));
        System.out.println("If Car1 is equal to car3 " + car1.equals(car3));

        for(Car car : cars) {
            if (car.getCarname().equalsIgnoreCase("BMW")  && car.getCarModel().equalsIgnoreCase("X5") ) {
                car.setCarModel("X6");
            }
        }
        cars.removeIf(c -> c.getCarModel().equalsIgnoreCase("TOYOTA")
                && c.getYearOfProduction() <= 2012);
        for (Car c : cars) System.out.println(c.toString());
    }
}
