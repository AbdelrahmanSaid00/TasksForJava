package SheetSix;

public class MovablePoint implements Movable {
    private float x;
    private float y;
    private float xAmount;
    private float yAmount;

    public MovablePoint(float x, float y, float xAmount, float yAmount) {
        this.x = x;
        this.y = y;
        this.xAmount = xAmount;
        this.yAmount = yAmount;
    }

    public float getX() { return x; }
    public float getY() { return y; }
    public float getxAmount() { return xAmount; }
    public float getyAmount() { return yAmount; }

    public void setX(float x) { this.x = x; }
    public void setY(float y) { this.y = y; }
    public void setxAmount(float xAmount) { this.xAmount = xAmount; }
    public void setyAmount(float yAmount) { this.yAmount = yAmount; }

    @Override
    public void moveRight(float amount) {
        x += amount;
    }

    @Override
    public void moveLeft(float amount) {
        x -= amount;
    }

    @Override
    public void moveUp(float amount) {
        y -= amount;
    }

    @Override
    public void moveDown(float amount) {
        y += amount;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") Amount=(" + xAmount + ", " + yAmount + ")";
    }
}
