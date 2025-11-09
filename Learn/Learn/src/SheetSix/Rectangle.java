package SheetSix;

public class Rectangle extends GeometricObject{
    private float length;
    private float width;
    public Rectangle(float length , float width ,String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return  (length + width) * 2;
    }
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width +
                ", area=" + getArea() + ", perimeter=" + getPerimeter() +
                ", " + super.toString() + "]";
    }
}
