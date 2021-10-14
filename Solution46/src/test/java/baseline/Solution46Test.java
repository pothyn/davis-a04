package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class Solution46Test {

    Solution46 app;

    @BeforeEach
    void init() {
        app = new Solution46();
    }

    @Test
    void testReadFile() {

        ArrayList<String> words = new ArrayList<>();
        words.add("badger");
        words.add("badger");
        words.add("badger");

        words.add("badger");
        words.add("mushroom");

        words.add("mushroom");
        words.add("snake");
        words.add("badger");
        words.add("badger");

        words.add("badger");

        ArrayList<String> Sol46Words = app.readFromFile("exercise46_input.txt");

        for(int i = 0; i < words.size(); i++)
            assertEquals(words.get(i), Sol46Words.get(i));
    }

    @Test
    void testArrayListToHashMap() {

        HashMap<String, Integer> testValues = new HashMap<>();

        testValues.put("badger", 7);
        testValues.put("mushroom", 2);
        testValues.put("snake", 1);

        app.readFromFile("exercise46_input.txt");
        assertEquals(testValues, app.arrayListToHashMap());

    }

    @Test
    void testSortHashMap() {

        HashMap<String, Integer> testValues = new HashMap<>();

        testValues.put("badger", 7);
        testValues.put("mushroom", 2);
        testValues.put("snake", 1);

        app.readFromFile("exercise46_input.txt");
        app.arrayListToHashMap();

        assertEquals(testValues, app.sortHashMap());

    }

    @Test
    void testGenerateTable() {

        HashMap<String, Integer> testValues = new HashMap<>();

        testValues.put("badger", 7);
        testValues.put("mushroom", 2);
        testValues.put("snake", 1);

        app.readFromFile("exercise46_input.txt");
        app.arrayListToHashMap();
        app.sortHashMap();

        assertEquals("badger:   *******\n" +
                "mushroom: **\n" +
                "snake:    *", app.generateTable());

    }


}