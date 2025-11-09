package SheetSix;

public class Circle extends GeometricObject{
    private float  readies;
    public Circle(float readies , String color, boolean filled) {
        super(color, filled);
        this.readies = readies;
    }

    public float getReadies() {
        return readies;
    }

    public void setReadies(float readies) {
        this.readies = readies;
    }

    @Override
    public double getArea() {
        double area = readies * readies * Math.PI;
        return area;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * readies;
    }
    @Override
    public String toString() {
        return "Circle [radius=" + readies + ", area=" + getArea() +
                ", perimeter=" + getPerimeter() + ", " + super.toString() + "]";
    }
}
