package SheetFive;

public class ClosedFigure extends  Figure {
    private double width;
    private double height;
    private boolean colored;
    public ClosedFigure() {
        super();
        this.width = 1.0;
        this.height = 1.0;
        this.colored = false;
    }
    public ClosedFigure(Point2D point, String color, double width, double height, boolean colored) {
        super(point, color);
        this.width = width;
        this.height = height;
        this.colored = colored;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public boolean isColored() {
        return colored;
    }
    public void setColored(boolean colored) {
        this.colored = colored;
    }
    public double Area() {
        return width * height;
    }
    @Override
    public String display() {
        return ("ClosedFigure at " + getPoint().toString() + " with color " + getColor() +
                ", width " + width + ", height " + height + ", colored: " + colored +
                ", area: " + Area());
    }

}
