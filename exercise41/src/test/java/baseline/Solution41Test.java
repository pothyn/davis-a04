/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    Solution41 app;

    @BeforeEach
    void init(){
        app = new Solution41();
    }


    @Test
    void testReadLine() {
        String thisLine = app.readLine("exercise41_input.txt", 0);
        assertEquals("Ling, Mai", thisLine);
    }

    @Test
    void testPrintFull() {
        assertEquals("Ling, Mai", app.getFull());

    }
}