/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution42 {

    // Code is very similar to Solution41
    // In an actual coding workplace, it would make a lot more sense to merge them together

    public static void main(String[] args) throws IOException {

        Solution42 app = new Solution42();

        // The file we access data from
        String fileInputName;
        // The file we print to
        String fileOutputName;

        // set fileName equal to the files in question
        fileInputName = "exercise42_input.txt";
        fileOutputName = "exercise42_output.txt";

        // Create array list people of Persons given through fileInputName
        // In this case, fileInputName is hardcoded to "exercise42_input.txt"
        ArrayList<Person> people = app.parsePeople(fileInputName);

        app.output(people, fileOutputName);

    }

    public ArrayList<Person> parsePeople(String fileInputName) throws FileNotFoundException {
        // Setup File Input
        File input = new File(ClassLoader.getSystemResource(fileInputName).getFile());
        Scanner in = new Scanner(input);

        ArrayList<Person> people = new ArrayList<>();

        // while file has another line
        while(in.hasNextLine())
            // add new person to people array list
            people.add(new Person(in.nextLine()));

        return people;

    }

    public String output(List<Person> names, String fileOutputName) throws IOException {
        // Setup File Output
        FileWriter output = new FileWriter("src/main/resources/" + fileOutputName);
        StringBuilder fullTable = new StringBuilder();

        // add ArrayList size to output in format
        fullTable.append(String.format("%8s %8s %8s%n--------------------------","Last", "First", "Salary"));

        // use a for loop to run through each Person instance and add the toString to the output
        for (Person name : names)
            fullTable.append("\n").append(name.toString());

        // print to file
        output.append(fullTable.toString());
        output.close();

        // return output
        return fullTable.toString();
    }
}
