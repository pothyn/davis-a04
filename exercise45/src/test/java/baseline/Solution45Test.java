/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Solution45Test {

    Solution45 app;

    @BeforeEach
    void init() {

        app = new Solution45("exercise45_input.txt","exercise45_output.txt",
                "use","utilize");

    }

    @Test
    void testPullFromFile() throws IOException {

        app.pullFromFile();

        assertEquals("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\". ", app.getIntake());

    }

    @Test
    void testReplaceAll() {

        app.setIntake("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\". ");

        app.replaceAll();

        assertEquals("One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".", app.getIntake());

    }

    @Test
    void testPrintToFile() throws IOException {

        app.setIntake("One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".");

        app.printToFile();

        Solution45 appTest = new Solution45("Solution45_output.txt", "", "", "");

        assertEquals("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".", appTest.getIntake());

    }

}