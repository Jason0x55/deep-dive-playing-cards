package edu.cnm.deepdive.cards;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class SuitTest {

  private static final String[] SUIT_SYMBOLS = {
    "\u2663",
    "\u2666",
    "\u2665",
    "\u2660"
  };

  @Test
  void testToString() {
    // TODO Test suit.toString() for expected return value.
    for (Suit suit : Suit.values()) {
      //assertTrue(suit.toString().equals(SUIT_SYMBOLS[suit.ordinal()]));
      assertEquals(SUIT_SYMBOLS[suit.ordinal()], suit.toString());
      System.out.println(suit);
    }
  }
}