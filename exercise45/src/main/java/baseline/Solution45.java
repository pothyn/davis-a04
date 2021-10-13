/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution45 {

    private final String fileInputName;
    private String fileOutputName;
    private String intake;
    private final String initialReplace;
    private final String finalReplace;
    private final String filePath;

    public Solution45(String fileInputName, String fileOutputName, String initialReplace, String finalReplace) {
        // Set all private variables in the constructor
        this.fileInputName = fileInputName;
        this.fileOutputName = fileOutputName;
        this.initialReplace = initialReplace;
        this.finalReplace = finalReplace;

        intake = "";

        // All the important text files will be found in resources
        filePath = System.getProperty("user.dir") + "/src/main/resources/";

    }

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        // The file we print to
        String fileOutputName;

        // Prompt and get fileOutputName
        System.out.print("Where would you like to print to? ");
        fileOutputName = in.nextLine();

        // Construct a new instance of this Solution45 class using hardcoded values and fileOutputName
        Solution45 app = new Solution45("exercise45_input.txt", fileOutputName, "utilize", "use");

        app.replaceAndPrint();

    }

    public void replaceAndPrint() throws IOException {

        pullFromFile();

        replaceAll();

        printToFile();

    }

    public void pullFromFile() {
        // Set up file (fileInputName)
        try {
            File file = new File(filePath + fileInputName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                intake = intake + data;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void replaceAll() {

        intake = intake.replaceAll(initialReplace, finalReplace);

        System.out.println(intake);
    }

    public void printToFile() throws IOException {

        // Create new file (fileOutputName)
        fileOutputName += ".txt";
        FileWriter output = new FileWriter(filePath + fileOutputName);

        // write to file
        output.write(intake);

        // close file
        output.close();

    }

    public String getIntake() {
        // Useful for testing
        return intake;
    }

    public void setIntake(String intake) {
        // Useful for testing too!
        this.intake = intake;
    }
}
