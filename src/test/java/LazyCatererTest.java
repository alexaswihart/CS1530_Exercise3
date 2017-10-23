import org.junit.Test;
import static org.junit.Asser.*;
import static org.junit.Assert.*;

import exercise3;

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


public class TriTest {

  @Test
  public void testTri0(){
    assertEquals(exercise3.triangle(0), 0);
  }

  @Test
  public void testTri1(){
    assertEquals(exercise3.triangle(0), 1);
  }

  @Test
  public void testTri10(){
    assertEquals(exercise3.triangle(10), 55);
  }
}
