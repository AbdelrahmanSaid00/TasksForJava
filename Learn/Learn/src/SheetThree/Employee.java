package SheetThree;

public class Employee {
    private String name;
    private Department department;
    private double salary;
    private int hoursPerDay;

    public Employee(String name, Department department, int hoursPerDay, double salary) {
        this.name = name;
        this.department = department;
        this.hoursPerDay = hoursPerDay;
        this.salary = salary;
        updateSalaryRules();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        updateSalaryRules();
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(int hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
        updateSalaryRules();
    }

    private void updateSalaryRules() {
        double baseSalary = this.salary;

        if (department == Department.HR) {
            baseSalary += 100;
        } else if (department == Department.IT) {
            baseSalary += 150;
        } else if (department == Department.SALES) {
            baseSalary += 200;
        } else if (department == Department.FINANCE) {
            baseSalary += 250;
        }

        if (baseSalary < 1000) {
            baseSalary += 500;
        }

        if (hoursPerDay > 8) {
            baseSalary += 100;
        }

        this.salary = baseSalary;
    }


    @Override
    public String toString() {
        return "Employee Details [" +
                "Name: " + name +
                ", Department: " + department +
                ", Salary: " + salary +
                ", Hours/Day: " + hoursPerDay +
                "]";
    }

}
