/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    Solution41 app;

    @BeforeEach
    void init(){
        app = new Solution41();
    }


    @Test
    void testParsePeople() throws FileNotFoundException {
        ArrayList<Person> testArrayList = new ArrayList<>();
        testArrayList.add(new Person("Johnson, Jim"));
        testArrayList.add(new Person("Jones, Chris"));
        testArrayList.add(new Person("Ling, Mai"));
        testArrayList.add(new Person("Swift, Geoffrey"));
        testArrayList.add(new Person("Xiong, Fong"));
        testArrayList.add(new Person("Zarnecki, Sabrina"));

        ArrayList<Person> names = new ArrayList<>();
        names = app.parsePeople("exercise41_output.txt");
        assertEquals(testArrayList, names);
    }

    @Test
    void testPrintFull() {
//        assertEquals("Ling, Mai", app.getFull());

    }
}