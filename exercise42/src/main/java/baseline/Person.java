/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

public class Person implements Comparable<Person>{

    private final String firstName;
    private final String lastName;
    private final String salary;

    public Person(String name) {
        // Split name to fullName
        String[] fullName = name.split(", ");

        // lastName = fullName first part
        // firstName = fullName second part
        // salary = fullName third part
    }

    @Override
    public int compareTo(Person p) {
        int lastNameCompare;

        // check compareTo of last names

        // if compareTo for last names is 0
            // lastNameCompare = this first name compareTo p first name

        return lastNameCompare;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}