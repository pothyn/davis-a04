/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution43Test {

    Solution43 app;

    @BeforeEach
    void init() {
        app = new Solution43();
    }

    @Test
    void testGenerateWebsites() {
        // run generateWebsites() and check each file exists
        app.generateWebsites("awesomeco", true, true);

        // Check that the base path exists
        File base = new File("awesomeco");
        assertTrue(base.exists());
    }

    @Test
    void testWriteToIndex() throws IOException {
        // check the contents of the index.html file match with preset
        app.writeToIndex("awesomeco", "Max Power");

        // Setup for the File input
        File input = new File(ClassLoader.getSystemResource("website/awesomeco/index.html").getFile());
        Scanner in = new Scanner(input);

        // Take in lines in order
        String title = in.nextLine();
        String meta = in.nextLine();

        // Assert that the two are the same strings
        assertEquals("<title>"+"awesomeco"+"</title>", title);
        assertEquals("<meta", meta);
    }

    @Test
    void testGenerateDirectory() {
        app.generateDirectory("awesomeco/js");
        File file = new File("/website/awesomeco/js");
        assertTrue(file.exists());
    }
}