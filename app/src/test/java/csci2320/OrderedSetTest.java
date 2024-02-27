package csci2320;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OrderedSetTest {
  @Test void emptyOnCreate() {
    var set = new OrderedSet<Integer>();
    assertEquals(0, set.size());
  }

  @Test void addStuff() {
    var set = new OrderedSet<Integer>();
    assertTrue(set.add(5));
    assertTrue(set.add(7));
    assertTrue(set.add(3));
    assertEquals(3, set.size());
    assertFalse(set.add(3));
    assertEquals(3, set.size());
    assertTrue(set.contains(7));
    assertTrue(set.contains(5));
    assertTrue(set.contains(3));
    assertFalse(set.contains(4));
  }

  @Test void rangeSearch() {
    var set = new OrderedSet<Integer>();
    assertTrue(set.add(5));
    assertTrue(set.add(7));
    assertTrue(set.add(2));
    assertTrue(set.add(3));
    assertTrue(set.add(1));
    assertTrue(set.add(9));
    assertTrue(set.add(4));
    assertTrue(set.add(8));
    var range = set.allInRange(4, 7);
    assertTrue(range.contains(4));
    assertTrue(range.contains(5));
    assertTrue(range.contains(7));
    assertFalse(range.contains(6));
  }

}
