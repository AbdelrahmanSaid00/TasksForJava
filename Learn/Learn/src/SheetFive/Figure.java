package SheetFive;

public class Figure {
    private Point2D point;
    private String color;

    public Figure() {
        this.point = new Point2D(0.0, 0.0);
        this.color = "black";
    }

    public Figure(Point2D point, String color) {
        this.point = point;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }
    public String display () {
        return ("Figure at " + point.toString() + " with color " + color);
    }

}
