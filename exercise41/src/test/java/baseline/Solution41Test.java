/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    Solution41 app;
    ArrayList<Person> testArrayList;

    @BeforeEach
    void init(){
        app = new Solution41();
        testArrayList = new ArrayList<>();
        testArrayList.add(new Person("Johnson, Jim"));
        testArrayList.add(new Person("Jones, Aaron"));
        testArrayList.add(new Person("Jones, Chris"));
        testArrayList.add(new Person("Ling, Mai"));
        testArrayList.add(new Person("Swift, Geoffrey"));
        testArrayList.add(new Person("Xiong, Fong"));
        testArrayList.add(new Person("Zarnecki, Sabrina"));
    }


    @Test
    void testParsePeople() throws FileNotFoundException {

        ArrayList<Person> names;
        names = app.parsePeople("exercise41_input.txt");
        Collections.sort(names);

        // the toString is reliant on the constructor, which is reliant on parsePeople()
        // therefore, proving this works proves parsePeople() works
        for(int i = 0; i < names.size(); i++) {
            assertEquals(testArrayList.get(i).toString(),names.get(i).toString());
        }
    }

    @Test
    void testOutput() throws IOException {
        ArrayList<Person> names = app.parsePeople("exercise41_input.txt");
        Collections.sort(names);

        assertEquals("Total of 7 names\n" +
                "-----------------\n" +
                "Johnson, Jim\n" +
                "Jones, Aaron\n" +
                "Jones, Chris\n" +
                "Ling, Mai\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong\n" +
                "Zarnecki, Sabrina", app.output(names, "exercise41_output.txt"));

    }
}