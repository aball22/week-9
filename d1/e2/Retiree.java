package org.example.week9.d1.e2;

public class Retiree extends Student{
    private String seniorActivity;

    public Retiree(String name, String lastName, int age, int salary, int grade, String seniorActivity) {
        super(name, lastName, age, salary, grade);
        this.seniorActivity = seniorActivity;
    }

    public void printRetireeDetails() {
        super.printStudentDetails();
        System.out.print(" " + seniorActivity);
    }
}

