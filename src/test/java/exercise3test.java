import org.junit.Test;
import static org.junit.Assert.*;

import exercise3;

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
