package org.example.week9.d4.e5;

public class E5MethodOverriding {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new Manager();
        employees[1] = new Developer();
        employees[2] = new Intern();

        for (Employee employee : employees) {
            employee.hello();
        }

        Developer developer = new Developer();
        developer.work();
        developer.takeBreak();
        developer.attendMeeting();
        // Step 1: Create a `Employee` class and create the following :
        // Create a public method named work that prints "I am an Employee working".
        // Create a protected method named takeBreak that prints "I am an Employee taking a break".
        // Create a default (package-private) method named attendMeeting that prints "I am an Employee attending a meeting".
        // Create a private method named submitReport that prints "I am an Employee submitting a report".
        // Create a public method named hello() that prints "method in Employee class".
        // Step 2: Create the Manager.java, Developer.java, and Intern.java classes as subclasses of Employee:
        // In each subclass, override the work method to print:
        // For Manager: "I am a Manager working"
        // For Developer: "I am a Developer working"
        // For Intern: "I am an Intern working"
        // Override these methods similarly in each subclass with appropriate messages:
        // For Manager: "I am a Manager taking a break", "I am a Manager attending a meeting", "method in Manager class"
        // For Developer: "I am a Developer taking a break", "I am a Developer attending a meeting", "method in Developer class"
        // For Intern: "I am an Intern taking a break", "I am an Intern attending a meeting", "method in Intern class"
        // Step 3: In the E5MethodOverriding.java class,Main method,Create objects of Manager, Developer, and Intern classes and Store these objects in an array of Employee type.
        // Loop through the array and call the hello() method for each object to demonstrate method overriding.
        // Create an object of the Developer class and call the work, takeBreak, and attendMeeting methods to see which overridden methods are accessible.
        // Print the output to verify that all methods are being called correctly


    }

}



