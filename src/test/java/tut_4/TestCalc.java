package tut_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalc {
  Calc foo = new Calc();

  @Test
  void t1() {
    assertEquals(foo.add(1, 2), 3);
  }
}
