package SheetFour;

public class Car {
    private String carModel ;
    private String Carname;
    private double carPrice;
    private int yearOfProduction;

    public Car(String carModel, String carname, double carPrice, int yearOfProduction) {
        this.carModel = carModel;
        Carname = carname;
        this.carPrice = carPrice;
        this.yearOfProduction = yearOfProduction;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarname() {
        return Carname;
    }

    public void setCarname(String carname) {
        Carname = carname;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", Carname='" + Carname + '\'' +
                ", carPrice=" + carPrice +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Car) {
            Car car = (Car) obj;
            return this.carModel.equalsIgnoreCase(car.carModel)
                    && this.Carname.equalsIgnoreCase(car.Carname);
        }
        return false;
    }
}
