import SheetThree.Rectangle;
import SheetTwo.Author;
import SheetTwo.Complex;
import SheetTwo.Invoice;

import java.util.Scanner;

import static SheetThree.methods.getFactors;

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, -2);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("Add: " + c1.addTo(c2));
        System.out.println("Multiply: " + c1.multiplyTo(c2));
        System.out.println("Conjugate c1: " + c1.conjugate());
        System.out.println("Magnitude c1: " + c1.magnitude());
        System.out.println();

        Invoice inv1 = new Invoice(1, "Laptop", 2, 15000);
        inv1.display();
        Invoice.Cashier cashier = new Invoice.Cashier("Ahmed");
        System.out.println("Cashier " + cashier.getName() + " issued " + cashier.getInvoices() + " invoices.");
        System.out.println();

        Author a1 = new Author("George Orwell", "george@bookmail.com");
        Author a2 = new Author("Aldous Huxley", "aldous@bookmail.com");
        Author [] authors = {a1,a2};

        Author.Book book1 = new Author.Book("12345", "1984", authors, "Secker & Warburg", 250);
        System.out.println(book1);


        System.out.println("Hello World!");


        int[] arr = {6, 3};

        int[][][] result = getFactors(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println("Factors of " + arr[i] + ":");
            for (int[] factor : result[i]) {
                System.out.println("{" + factor[0] + "," + factor[1] + "}");
            }
            System.out.println();
        }

        Rectangle []rectangles = new  Rectangle[4];
        rectangles[0] = new Rectangle(5, 5);
        int r = 140 , l = 150;
        for (int i = 1; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle(r, l);
            r+=120;
            l+=120;
        }

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle " + i + ":" + rectangles[i].toString());
        }

        Rectangle a = new Rectangle(5, 10);
        Rectangle b = new Rectangle(5, 15);

        System.out.println("Rectangle " + "a" + " and " + "b"+ ":");
        System.out.println();

        System.out.println(a.toString());
        System.out.println(b.toString());

        a = Rectangle.Swap(b , b=a);

        System.out.println("Rectangle " + "a" + " and " + "b" + ":");
        System.out.println();
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
