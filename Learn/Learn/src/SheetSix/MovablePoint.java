package SheetSix;

public class MovablePoint implements Movable {
    private float x, y;
    private float xAmount, yAmount;

    public MovablePoint() {
        this.x = 0;
        this.y = 0;
        this.xAmount = 1;
        this.yAmount = 1;
    }

    public MovablePoint(float x, float y, float xAmount, float yAmount) {
        this.x = x;
        this.y = y;
        this.xAmount = xAmount;
        this.yAmount = yAmount;
    }

    @Override
    public void moveRight(float xAmount) {
        x += xAmount;
    }

    @Override
    public void moveLeft(float xAmount) {
        x -= xAmount;
    }

    @Override
    public void moveUp(float yAmount) {
        y -= yAmount;
    }

    @Override
    public void moveDown(float yAmount) {
        y += yAmount;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") Amount=(" + xAmount + ", " + yAmount + ")";
    }
}
