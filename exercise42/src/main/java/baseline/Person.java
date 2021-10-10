/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

public class Person{

    private final String firstName;
    private final String lastName;
    private final String salary;

    public Person(String name) {
        // Split name to fullName
        String[] fullName = name.split(",");

        // lastName = fullName first part
        lastName = fullName[0];
        // firstName = fullName second part
        firstName = fullName[1];
        // salary = fullName third part
        salary = fullName[2];
    }

    @Override
    public String toString() {
        return String.format("%8s %8s %8s", lastName, firstName, salary);
    }
}