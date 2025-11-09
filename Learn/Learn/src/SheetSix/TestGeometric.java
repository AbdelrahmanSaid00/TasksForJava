package SheetSix;

import static SheetSix.ComparableSorting.sortComparable;

public class TestGeometric {
    public static void main(String[] args) {
        GeometricObject [] geometricObjects = new GeometricObject[3];
        geometricObjects[0] = new Circle(5.0f, "Red", true);
        geometricObjects[1] = new Rectangle(4.0f, 6.0f, "Blue", false);
        geometricObjects[2] = new Square(3.0f, "Green", true);
        for (GeometricObject obj : geometricObjects) {
            System.out.println(obj.toString());
        }
        for(GeometricObject obj : geometricObjects) {
            if (obj.getArea() < 20) {
                System.out.println("Area less than 20: " + obj.toString());
            }
        }
        System.out.println("Sorting geometric objects by area...\n");
        sortComparable(geometricObjects);
        System.out.println("After sorting by area:");
        for (GeometricObject obj : geometricObjects) {
            System.out.println(obj.toString());
            }
    }
}
