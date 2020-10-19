package io.aleksandr.labs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathTest {

  @Test
  void add() {
    final int sum = Math.add(1, 1);
    assertEquals(2, sum);
  }

  @Test
  void subtract() {
    final int difference = Math.subtract(2, -1);
    assertEquals(3, difference);
  }

  @Test
  void multiply() {
    final int product = Math.multiply(5, 6);
    assertEquals(30, product);
  }
}