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

    }
}
