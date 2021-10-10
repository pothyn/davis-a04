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

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {

    Solution42 app;
    ArrayList<Person> testArrayList;

    @BeforeEach
    void init(){
        app = new Solution42();
        testArrayList = new ArrayList<>();
        testArrayList.add(new Person("Ling,Mai,55900"));
        testArrayList.add(new Person("Johnson,Jim,56500"));
        testArrayList.add(new Person("Jones,Aaron,46000"));
        testArrayList.add(new Person("Jones,Chris,34500"));
        testArrayList.add(new Person("Swift,Geoffrey,14200"));
        testArrayList.add(new Person("Xiong,Fong,65000"));
        testArrayList.add(new Person("Zarnecki,Sabrina,51500"));
    }


    @Test
    void testParsePeople() throws FileNotFoundException {

        ArrayList<Person> names;
        names = app.parsePeople("exercise42_input.txt");

        // the toString is reliant on the constructor, which is reliant on parsePeople()
        // therefore, proving this works proves parsePeople() works
        for(int i = 0; i < names.size(); i++) {
            assertEquals(testArrayList.get(i).toString(), names.get(i).toString());
        }
    }

    @Test
    void testOutput() throws IOException {
        ArrayList<Person> names = app.parsePeople("exercise42_input.txt");

        // This comes out as failed, but when clicking on <Click to see difference>
        // there are 0 differences between the two.
        assertEquals("""
                    Last    First   Salary
                --------------------------
                    Ling      Mai    55900
                 Johnson      Jim    56500
                   Jones    Aaron    46000
                   Jones    Chris    34500
                   Swift Geoffrey    14200
                   Xiong     Fong    65000
                Zarnecki  Sabrina    51500""", app.output(names, "exercise42_output.txt"));

    }
}