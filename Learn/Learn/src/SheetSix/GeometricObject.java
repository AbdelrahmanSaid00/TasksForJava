package SheetSix;

public abstract class GeometricObject implements Comparable<GeometricObject>{
    private String color;
    private boolean filled;

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "GeometricObject [color=" + color + ", filled=" + filled + "]";
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public int compareTo(GeometricObject other) {
        if (this.getArea() > other.getArea())
            return 1;
        else if (this.getArea() < other.getArea())
            return -1;
        else
            return 0;
    }
}

