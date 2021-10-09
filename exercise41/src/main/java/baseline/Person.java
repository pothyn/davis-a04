package baseline;

public class Person implements Comparable<Person>{

    private String firstName;
    private String lastName;

    public Person(String name) {
        // Split name to fullName
        // firstName = fullName first part
        // lastName = fullName second part
    }

    @Override
    public int compareTo(Person p) {
        // check compareTo of last names

        // if compareTo for last names is 0
            // return compareTo of firstNames

        // return compareTo of last Names
        return 0;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}
