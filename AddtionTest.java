package DEVOPS_LAB_2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AddtionTest {

    @Test
    public void testAdd() {
        Addition addition = new Addition();
        Addition.Add adder = addition.new Add();
        int result = adder.add(5, 7);
        assertEquals(12, result, "The sum is: 12");
    }


}
