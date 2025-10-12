package SheetThree;

import java.util.concurrent.RecursiveAction;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPerimeter () {
        return 2 * (width + height);
    }
    public int getAre () {
        return width * height;
    }

    public static Rectangle Swap (Rectangle a , Rectangle b) {
        return a;
    }

    @Override
    public String toString() {
        if (getAre() >= 1500)
            return "Rectangle [Length=" + height + ", Width=" + width +
                    ", Area=" + getAre() + ", Perimeter=" + getPerimeter() + "]";
        else
            return "The Area of this Rectangle is less than 1500" +
                    " Rectangle [Length=" + height + ", Width=" + width +
                    ", Area=" + getAre() + ", Perimeter=" + getPerimeter() + "]" ;
    }
}
