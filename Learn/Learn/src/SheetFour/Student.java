package SheetFour;

import java.util.Arrays;

public class Student {
    private String rollNo;
    private String name;
    private Date dateOfBirth;
    private static final int  maxDegree = 100;
    private static int count =0;
    private double [] degress = new double[3];
    private double [] cgpa = new double[5];

    public Student( String name, Date dateOfBirth, double[] degress, double[] cgpa) {
        this.rollNo = "S" + (++count);
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        for(int i=0 ; i < degress.length ; i++){
            if (degress[i] < 0 || degress[i] > maxDegree) {
                System.out.println("Degress out of range");
                this.degress[i] = 0;
            }
            this.degress[i] = degress[i];
        }
        for(int i=0 ; i < cgpa.length ; i++){
            if (cgpa[i] < 0 || cgpa[i] > 4) {
                System.out.println("CGPA out of range");
                this.cgpa[i] = 0;
            }
            this.cgpa[i] = cgpa[i];
        }
    }
    // Function to calculate the Ave of the Degree
    private double calAveDegree () {
        double sum = 0;
        for(double d : degress) {
            sum += d;
        }
        return sum / degress.length;
    }
    public String calGrade () {
        double sum = calAveDegree();
        if (sum >= 90) {
            return "A";
        }else if (sum >= 80) {
            return "B";
        }else if (sum >= 70) {
            return "C";
        }else if (sum >= 60) {
            return "D";
        }else {
            return "F";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", degress=" + Arrays.toString(degress) +
                ", cgpa=" + Arrays.toString(cgpa) +
                ", Grade=" + calGrade() +
                '}';
    }
    public static int getCount() {
        return count;
    }
    public double getTotalDegree () {
        double sum = 0;
        for(double d : degress) {
            sum += d;
        }
        return sum;
    }

    public double[] getCgpa() {
        return cgpa;
    }

    public String getName() {
        return name;
    }
}
