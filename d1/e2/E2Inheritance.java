package org.example.week9.d1.e2;

public class E2Inheritance {
    public static void main(String[] args) {

        Employee employee = new Employee("Joe","Smith",35,35000);
        employee.printEmployeeDetails();
        System.out.println();

        Student student = new Student("Adam", "Smith",15,0,10);
        student.printStudentDetails();
        System.out.println();

        Retiree retiree = new Retiree("Frank", "Smith", 15,0,0,"tour");
        retiree.printRetireeDetails();
        // Step 1: Create a `Person` class with `name`, `lastName`, and `age` as private variables, ensuring encapsulation.
// Step 2: Extend `Person` with an `Employee` class that adds `salary` and a method to print employee details.
// Step 3: Extend `Employee` with a `Student` class that adds `grade` and a method to print student details.
// Step 4: Extend `Student` with a `Retiree` class that adds `seniorActivity` and a method to print retiree details.
// Step 5: In the main class, create and test objects for each class, verifying all inherited properties and methods work correctly.

    }

}
