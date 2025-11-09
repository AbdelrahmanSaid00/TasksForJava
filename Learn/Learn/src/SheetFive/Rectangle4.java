package SheetFive;

public class Rectangle4 extends ClosedFigure{
    public Rectangle4() {
        super();
    }

    public Rectangle4(Point2D startpoint, String color, double width, double height, boolean colored) {
        super(startpoint, color, width, height, colored);
    }
    public Rectangle4 (Point2D startpoint, Point2D endPoint , String color , boolean colored) {
        super(startpoint, color,
                endPoint.getX() - startpoint.getX(),
                endPoint.getY() - startpoint.getY(), colored);
    }
    @Override
    public  double Area() {
        return getWidth() * getHeight();
    }
    @Override
    public String display() {
        return ("Rectangle at " + getPoint().toString() + " with color " + getColor() +
                ", width " + getWidth() + ", height " + getHeight() + ", colored: " + isColored() +
                ", area: " + Area());
    }
}
