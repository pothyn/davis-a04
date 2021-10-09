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
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution41 {

    public static void main(String[] args) throws IOException {

        Solution41 app = new Solution41();

        String fileInputName;
        String fileOutputName;

        // set fileName equal to the file in question
        fileInputName = "exercise41_input.txt";
        fileOutputName = "exercise41_output.txt";

        ArrayList<Person> names = app.parsePeople(fileInputName);

        // sort arrayList through given commands
        Collections.sort(names);

        app.output(names, fileOutputName);

    }

    public ArrayList<Person> parsePeople(String fileInputName) throws FileNotFoundException {
        // Setup File Input
        File input = new File(ClassLoader.getSystemResource(fileInputName).getFile());
        Scanner in = new Scanner(input);

        // Create ArrayList of Persons
        ArrayList<Person> people = new ArrayList<>();

        // while file has next line
        while(in.hasNextLine())
            people.add(new Person(in.nextLine()));
        return people;
    }

    public String output(List<Person> names, String fileOutputName) throws IOException {
        // Setup File Output
        FileWriter output = new FileWriter("src/main/resources/" + fileOutputName);
        StringBuilder fullTable = new StringBuilder();

        // print the array list size
        fullTable.append("Total of ").append(names.size()).append(" names\n-----------------");

        // runs through each of the arrayList values and returns the full string.
        for (Person name : names) fullTable.append("\n").append(name.toString());

        output.append(fullTable.toString());
        output.close();

        return fullTable.toString();
    }

}
