package io.aleksandr.labs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathTest {

  @Test
  void add() {
    final int sum = Math.add(1, 1);
    assertEquals(2, sum);
  }
}