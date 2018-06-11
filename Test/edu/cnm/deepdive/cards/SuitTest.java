package edu.cnm.deepdive.cards;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static edu.cnm.deepdive.cards.Suit.*;

import org.junit.jupiter.api.Test;

class SuitTest {

  private static final String[] SUITS = {
    "\u2663",
    "\u2666",
    "\u2665",
    "\u2660"
  };

  @Test
  void testToString() {
    // TODO Test suit.toString() for expected return value.
    int i = 0;
    for (Suit suit : Suit.values()) {
      assertTrue(suit.toString().equals(SUITS[i++]));
    }
  }
}