import org.junit.Test;

import static org.junit.Assert.*;

import exercise.exercise3;

public class exercise3test{
    @Test
  public void testTri0(){
    assertEquals(exercise3.triangle(0), 0);
  }

  @Test
  public void testTri1(){
    assertEquals(exercise3.triangle(1), 1);
  }

  @Test
  public void testTri10(){
    assertEquals(exercise3.triangle(10), 55);
  }
    
    @Test
    public void testLazyCaterer0() {
        assertEquals(exercise3.lazyCaterer(0), 1);
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


