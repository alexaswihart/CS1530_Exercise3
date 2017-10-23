import org.junit.Test;
import static org.junit.Asser.*;

import ex3.exercise3;

public class exercise3test.java {
    
    @Test
    public void testLazyCaterer0() {
        assertEquals(exercise3.lazyCaterer(0), 0);
    }
    
    @Test
    public void testLazyCaterer1() {
        assertEquals(exercise3.lazyCaterer(3), 7);
    }
    
    @Test
    public void testLazyCaterer2() {
        assertEquals(exercise3.lazyCaterer(5), 16);
    }
}