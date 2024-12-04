package org.example.week9.d1.e2;

public class Employee extends Person {
    private int salary;

    public Employee(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }

    public void printEmployeeDetails() {
        super.personDetails();
        if (salary != 0) {
            System.out.print(" " + salary);
        }
    }
}

