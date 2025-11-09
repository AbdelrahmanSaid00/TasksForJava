package SheetSix;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);

        System.out.println("Initial position: " + m1);

        m1.moveRight(2.0f);
        System.out.println("After moving right: " + m1);

        m1.moveDown(3.0f);
        System.out.println("After moving down: " + m1);

        m1.moveLeft(1.0f);
        System.out.println("After moving left: " + m1);

        m1.moveUp(2.0f);
        System.out.println("After moving up: " + m1);
    }
}
