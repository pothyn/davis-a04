package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    // Straightforward tests

    Product prod;

    @BeforeEach
    void init(){

        prod = new Product("Apple", 5.00, 10);

    }

    @Test
    void testGetters() {

        assertEquals("Apple",prod.getName());
        assertEquals(5.0,prod.getPrice());
        assertEquals(10,prod.getQuantity());

    }


}