package SheetFour;

import static java.lang.Math.max;

public class StudentTest {
    private Student[] students;

    public StudentTest(Student[] students) {
        this.students = students;
    }

    public void findHighDegreeOfTheStudent () {
        double mxDegree = -1;
        for(Student t : students) {
            mxDegree = max (mxDegree , t.getTotalDegree());
        }
        System.out.println("\n--- Students with Highest Total Degree (" + mxDegree + ") ---");
        for (Student s : students) {
            if (s.getTotalDegree() == mxDegree) {
                System.out.println(s.toString() + " → " + s);
            }
        }
    }
    public void findProbationStudents() {
        System.out.println("\n--- Students on Probation (CGPA < 2 for 2 consecutive semesters) ---");
        boolean found = false;

        for (Student s : students) {
            double[] cgpas = s.getCgpa();
            int consecutive = 0;
            for (double c : cgpas) {
                if (c < 2.0)
                    consecutive++;
                else
                    consecutive = 0;

                if (consecutive == 2) {
                    System.out.println(s.getName() + " → " + s);
                    found = true;
                    break;
                }
            }
        }

        if (!found)
            System.out.println("No students on probation.");
    }
}
