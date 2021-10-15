/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution46 {

    private final HashMap<String, Integer> frequency;
    private final ArrayList<String> textParsed;
    private final ArrayList<String> values;

    public Solution46() {

        frequency = new HashMap<>();
        textParsed = new ArrayList<>();
        values = new ArrayList<>();

    }

    public static void main(String[] args) throws FileNotFoundException {

        Solution46 app = new Solution46();

        // read from exercise46_input.txt
        app.readFromFile("exercise46_input.txt");

        app.arrayListToHashMap();

        System.out.println(app.generateTable());

    }

    public List<String> readFromFile(String fileName) throws FileNotFoundException {

        // Set up file
        File input = new File(ClassLoader.getSystemResource(fileName).getFile());
        Scanner in = new Scanner(input);

        // add a String to textParsed
        while(in.hasNext())
            textParsed.add(in.next());

        return textParsed;

    }

    public Map<String, Integer> arrayListToHashMap() {

        String temp;

        // for each index of arrayList
        for (String s : textParsed) {
            // temp string
            temp = s;
            // if frequency contains String at index i
            if (frequency.containsKey(temp))
                frequency.put(temp, frequency.get(temp) + 1);
            else {
                frequency.put(temp, 1);
                values.add(temp);
            }
        }

        return frequency;

    }

    public String generateTable() {

        StringBuilder output = new StringBuilder();

        // for int i = 0 to size of hashmap
        for (String value : values) {
            // add the word and the value to the output
            output.append(String.format("%10s", value + ": "));
            output.append("*".repeat(Math.max(0, frequency.get(value))));
            output.append("\n");
        }

        return output.toString();

    }


}
