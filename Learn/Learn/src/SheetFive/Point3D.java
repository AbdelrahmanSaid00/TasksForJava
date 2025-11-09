package SheetFive;

public class Point3D extends Point2D{
    private double z;

    public Point3D() {
        this(0.0, 0.0, 0.0);
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(double x, double y, double z) {
        setXY(x, y);
        this.z = z;
    }

    public double[] getXYZ() {
        return new double[] { getX(), getY(), this.z };
    }

    public double distance(Point3D p) {
        if (p == null) {
            throw new IllegalArgumentException("Point3D argument cannot be null");
        }
        return distance(p.getX(), p.getY(), p.z);
    }

    public double distance(double x, double y, double z) {
        double dx = getX() - x;
        double dy = getY() - y;
        double dz = this.z - z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point3D)) return false;
        Point3D other = (Point3D) obj;
        return getX() == other.getX() && getY() == other.getY() && getZ() == other.getZ();
    }
}
