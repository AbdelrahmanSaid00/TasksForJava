import SheetFive.*;
import SheetFour.Date;
import SheetFour.Student;
import SheetFour.StudentTest;
import SheetThree.Container;
import SheetThree.Department;
import SheetThree.Employee;
import SheetThree.Rectangle;
import SheetTwo.Author;
import SheetTwo.Complex;
import SheetTwo.Invoice;

import java.util.Scanner;

import static SheetThree.methods.getFactors;

public class Main {
    public static void main(String[] args) {
//        Complex c1 = new Complex(3, 4);
//        Complex c2 = new Complex(1, -2);
//        System.out.println("c1 = " + c1);
//        System.out.println("c2 = " + c2);
//        System.out.println("Add: " + c1.addTo(c2));
//        System.out.println("Multiply: " + c1.multiplyTo(c2));
//        System.out.println("Conjugate c1: " + c1.conjugate());
//        System.out.println("Magnitude c1: " + c1.magnitude());
//        System.out.println();
//
//        Invoice inv1 = new Invoice(1, "Laptop", 2, 15000);
//        inv1.display();
//        Invoice.Cashier cashier = new Invoice.Cashier("Ahmed");
//        System.out.println("Cashier " + cashier.getName() + " issued " + cashier.getInvoices() + " invoices.");
//        System.out.println();
//
//        Author a1 = new Author("George Orwell", "george@bookmail.com");
//        Author a2 = new Author("Aldous Huxley", "aldous@bookmail.com");
//        Author [] authors = {a1,a2};
//
//        Author.Book book1 = new Author.Book("12345", "1984", authors, "Secker & Warburg", 250);
//        System.out.println(book1);
//
//
//        System.out.println("Hello World!");
//
//
//        int[] arr = {6, 3};
//
//        int[][][] result = getFactors(arr);
//
//        for (int i = 0; i < result.length; i++) {
//            System.out.println("Factors of " + arr[i] + ":");
//            for (int[] factor : result[i]) {
//                System.out.println("{" + factor[0] + "," + factor[1] + "}");
//            }
//            System.out.println();
//        }
//
//        Rectangle []rectangles = new  Rectangle[4];
//        rectangles[0] = new Rectangle(5, 5);
//        int r = 140 , l = 150;
//        for (int i = 1; i < rectangles.length; i++) {
//            rectangles[i] = new Rectangle(r, l);
//            r+=120;
//            l+=120;
//        }
//
//        for (int i = 0; i < rectangles.length; i++) {
//            System.out.println("Rectangle " + i + ":" + rectangles[i].toString());
//        }
//
//        Rectangle a = new Rectangle(5, 10);
//        Rectangle b = new Rectangle(5, 15);
//
//        System.out.println("Rectangle " + "a" + " and " + "b"+ ":");
//        System.out.println();
//
//        System.out.println(a.toString());
//        System.out.println(b.toString());
//
//        a = Rectangle.Swap(b , b=a);
//
//        System.out.println("Rectangle " + "a" + " and " + "b" + ":");
//        System.out.println();
//        System.out.println(a.toString());
//        System.out.println(b.toString());
//        Employee[] employees = new Employee[10];
//        employees[0] = new Employee("Ali", Department.IT, 8, 400);
//        employees[1] = new Employee("Sara", Department.HR, 7, 1200);
//        employees[2] = new Employee("Omar", Department.FINANCE, 9, 800);
//        employees[3] = new Employee("Lina", Department.IT, 6, 300);
//        employees[4] = new Employee("Hassan", Department.SALES, 10, 1500);
//        employees[5] = new Employee("Nora", Department.HR, 9, 450);
//        employees[6] = new Employee("Mona", Department.FINANCE, 7, 2000);
//        employees[7] = new Employee("Khaled", Department.SALES, 8, 480);
//        employees[8] = new Employee("Tamer", Department.IT, 10, 100);
//        employees[9] = new Employee("Aya", Department.FINANCE, 6, 0);
//
//        System.out.println("Employees with salary less than 500:\n");
//        for (Employee emp : employees) {
//            if (emp.getSalary() < 1000) {
//                System.out.println(emp);
//            }
//        }
//
//        System.out.println("\nEmployees working more than 8 hours per day:\n");
//        for (Employee emp : employees) {
//            if (emp.getHoursPerDay() < 8) {
//                System.out.println(emp);
//            }
//        }
//
//        Employee[][] Emp = new Employee[4][3];
//
//        Emp[0][0] = new Employee("Sara", Department.HR, 7, 1200);
//        Emp[0][1] = new Employee("Nora", Department.HR, 9, 850);
//        Emp[0][2] = new Employee("Ahmed", Department.HR, 8, 950);
//
//        Emp[1][0] = new Employee("Ali", Department.IT, 8, 400);
//        Emp[1][1] = new Employee("Tamer", Department.IT, 10, 900);
//        Emp[1][2] = new Employee("Lina", Department.IT, 6, 1300);
//
//        Emp[2][0] = new Employee("Omar", Department.FINANCE, 9, 800);
//        Emp[2][1] = new Employee("Mona", Department.FINANCE, 7, 2000);
//        Emp[2][2] = new Employee("Aya", Department.FINANCE, 6, 350);
//
//        Emp[3][0] = new Employee("Hassan", Department.SALES, 10, 1500);
//        Emp[3][1] = new Employee("Khaled", Department.SALES, 8, 480);
//        Emp[3][2] = new Employee("Yara", Department.SALES, 9, 1000);
//
//        Department[] dept = Department.values();
//
//        for(int i=0 ; i < 4 ;i++) {
//            System.out.println( "The Employee of the Department " + dept[i]);
//            Employee Highemp = Emp[i][0];
//            for(int j=0 ; j < 3; j++) {
//                System.out.println( Emp[i][j]);
//                if (Emp[i][j].getSalary() > Highemp.getSalary()) {
//                    Highemp = Emp[i][j];
//                }
//            }
//            System.out.println("The Highest Employee is  for the Department " + dept[i] + " is "  + Highemp.toString());
//        }

//
//        Container<Integer> intContainer = new Container<>(10);
//        Container<String> stringContainer = new Container<>("Sales");
//        Container<Employee> empContainer = new Container<>(employees[0]);
//
//        System.out.println("Initial containers:");
//        System.out.println(intContainer);
//        System.out.println(stringContainer);
//        System.out.println(empContainer);
//
//        intContainer.setData(25);
//        stringContainer.setData("IT Department");
//        empContainer.setData(employees[1]);
//
//        System.out.println("\nAfter updating container data:");
//        System.out.println(intContainer);
//        System.out.println(stringContainer);
//        System.out.println(empContainer);
//
//        System.out.println("\nDirect access to container data:");
//        System.out.println("Integer container holds: " + intContainer.getData());
//        System.out.println("String container holds: " + stringContainer.getData());
//        System.out.println("Employee container holds: " + empContainer.getData());

//        double[] deg1 = {90, 85, 95};
//        double[] cgpa1 = {3.5, 3.4, 3.6, 3.7, 3.8};
//
//        double[] deg2 = {70, 60, 80};
//        double[] cgpa2 = {2.5, 1.8, 1.7, 3.0, 3.2};
//
//        double[] deg3 = {88, 90, 92};
//        double[] cgpa3 = {3.0, 3.2, 3.5, 3.4, 3.6};
//
//        Student s1 = new Student("Ali Ahmed", new Date("6" , "10" , "2006"), deg1, cgpa1);
//        Student s2 = new Student("Sara Omar", new Date("5" , "6" , "2005"), deg2, cgpa2);
//        Student s3 = new Student("Mohamed Adel", new Date("21" , "7" , "2003"), deg3, cgpa3);
//
//        Student[] group = {s1, s2, s3};
//
//        StudentTest test = new StudentTest(group);
//        test.findHighDegreeOfTheStudent();
//        test.findProbationStudents();

//        Point2D [] pointts = new Point2D[5];
//        pointts[0] = new Point2D(3,4);
//        pointts[1] = new Point2D(6,8);
//        pointts[2] = new Point3D(2,1 , 2);
//        pointts[3] = new Point3D(7,9 , 11);
//        pointts[4] = new Point3D(0,5 , 9);
//
//        for (Point2D p : pointts) {
//            System.out.println(p.toString());
//        }
//        for(Point2D p : pointts) {
//            System.out.println("\nDistance from " + p.toString() + " to origin: " + p.distance(0,0));
//        }
//        System.out.println("Distance be" +
//                "tween points:" + pointts[0].toString() + " and " + pointts[1].toString() + " is " + pointts[0].distance(pointts[1]));
//        System.out.println("p0 equals p1? " + pointts[0].equals(pointts[1]));
//        System.out.println("p0 equals p4? " + pointts[0].equals(pointts[4]));

        Point2D p1 = new Point2D(1, 2);
        Point2D p2 = new Point2D(5, 6);

        Figure f1 = new Figure(p1, "black");
        Figure f2 = new ClosedFigure(new Point2D(2, 3), "red", 4, 5, true);
        Figure f3 = new Rectangle4(p1, "blue",5 , 4  , false);

        System.out.println(f1.display());
        System.out.println(f2.display());
        System.out.println(f3.display());

        ClosedFigure c1 = new ClosedFigure(p2, "green", 3, 4, true);
        System.out.println("Area of c1: " + c1.Area());

        Rectangle4 r1 = new Rectangle4(new Point2D(0, 0), new Point2D(3, 4), "yellow", true);
        System.out.println("Area of r1: " + r1.Area());
        System.out.println(r1.display());

    }
}
