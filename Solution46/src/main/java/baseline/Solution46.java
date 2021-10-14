package baseline;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution46 {

    private HashMap<String, Integer> frequency;
    private ArrayList<String> textParsed;

    public static void main(String[] args) {

        Solution46 app = new Solution46();

        // read from exercise46_input.txt
        app.readFromFile("exercise46_input.txt");

        app.arrayListToHashMap();

        app.sortHashMap();

        System.out.println(app.generateTable());

    }

    public ArrayList<String> readFromFile(String fileName) {

        // Set up file

        // add a String to textParsed

        return textParsed;

    }

    public HashMap<String, Integer> arrayListToHashMap() {

        // for each index of arrayList
            // if frequency contains String at index i
                // frequency.put(String, frequency.get(i) + 1)
            // else
                // frequency.put(String, 1)

        return frequency;

    }

    public HashMap<String, Integer> sortHashMap() {

        // for int i = 0 to size of hashmap - 1
            // if hashmap.get(i) > hashmap.get(i + 1)
                // swap

        return frequency;

    }

    public String generateTable() {

        String output = "";

        // for int i = 0 to size of hashmap
            // add the word and the value to the output

        return output;

    }


}
