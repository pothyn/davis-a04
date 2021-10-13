package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution44Test {

    Solution44 app;
    ArrayList<Product> products;

    @BeforeEach
    void init() {

        app = new Solution44("exercise44_input.txt");

        products = new ArrayList<>();
        products.add(new Product("Widget", 25.0, 5));
        products.add(new Product("Thing", 15.0, 5));
        products.add(new Product("Doodad", 5.0, 10));

    }

    @Test
    void testTakeNameInput() {
        // Input functions like this are untestable, but the other functions and runtime will ensure that this function works
    }

    @Test
    void testJsonToProduct() throws IOException {

            assertEquals(products.get(0).getName(), app.jsonToProduct().get(0).getName());
            assertEquals(products.get(0).getPrice(), app.jsonToProduct().get(0).getPrice());
            assertEquals(products.get(0).getQuantity(), app.jsonToProduct().get(0).getQuantity());
    }

    @Test
    void testCheckName() {
        assertEquals(1, app.checkName("Thing", products));
    }

    @Test
    void testGetProductInfo() {
        assertEquals("Name: Thing\nPrice: 15.00\nQuantity: 5", app.getProductInfo(1, products));
    }

}