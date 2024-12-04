package org.example.week9.d1.e2;

public class Student extends Employee {
    private int grade;

    public Student(String name, String lastName, int age, int salary, int grade) {
        super(name, lastName, age, salary);
        this.grade = grade;
    }

    public void printStudentDetails() {
        super.printEmployeeDetails();
        if (grade != 0) {
            System.out.print(" " + grade);
        }
    }
}
