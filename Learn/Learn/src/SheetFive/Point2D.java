package SheetFive;

public class Point2D {
    private double x;
    private double y;

    public Point2D() {
        this(0.0, 0.0);
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getXY() {
        return new double[] { this.x, this.y };
    }

    public double distance(Point2D p) {
        if (p == null) {
            throw new IllegalArgumentException("Point2D argument cannot be null");
        }
        return distance(p.x, p.y);
    }

    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point2D)) return false;
        Point2D p = (Point2D) o;
        return this.x == p.x && this.y == p.y;
    }
}
