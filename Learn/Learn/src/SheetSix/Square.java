package SheetSix;

public class Square extends Rectangle{
    public Square(float length,String color, boolean filled) {
        super(length, length, color, filled);
    }
    public float getSide() {
        return getLength();
    }
    public void setSide(float side) {
        setLength(side);
        setWidth(side);
    }
    @Override
    public String toString() {
        return "Square [side=" + getSide() +
                ", area=" + getArea() + ", perimeter=" + getPerimeter() +
                ", " + super.toString() + "]";
    }
}
