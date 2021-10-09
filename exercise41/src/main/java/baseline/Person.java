/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

public class Person implements Comparable<Person>{

    private String firstName;
    private String lastName;

    public Person(String name) {
        // Split name to fullName
        String[] fullName = name.split(", ");

        // firstName = fullName first part
        lastName = fullName[0];
        // lastName = fullName second part
        firstName = fullName[1];
    }

    @Override
    public int compareTo(Person p) {
        // check compareTo of last names
        int lastNameCompare = this.lastName.compareTo(p.lastName);

        // if compareTo for last names is 0
        if(lastNameCompare == 0) {
            return this.firstName.compareTo(p.firstName);
        }

        return lastNameCompare;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}
