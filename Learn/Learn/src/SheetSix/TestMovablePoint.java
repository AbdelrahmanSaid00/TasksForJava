package SheetSix;

public class TestMovablePoint {
    public static void main(String[] args) {
        Movable p = new MovablePoint(10, 20, 5, 5);

        System.out.println("Initial Position: " + p);

        p.moveRight(5);
        p.moveDown(5);
        System.out.println("After moving right and down: " + p);

        p.moveLeft(10);
        p.moveUp(10);
        System.out.println("After moving left and up: " + p);
    }
}
