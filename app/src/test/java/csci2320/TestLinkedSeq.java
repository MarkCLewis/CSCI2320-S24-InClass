package csci2320;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestLinkedSeq {
  @Test void emptyOnCreate() {
    LinkedSeq<Integer> seq = new LinkedSeq<>();
    assertEquals(0, seq.size());
  }
  @Test void addGet() {
    LinkedSeq<Integer> seq = new LinkedSeq<>();
    seq.add(1);
    seq.add(2);
    seq.add(5);
    seq.add(9);
    assertEquals(1, seq.get(0));
    assertEquals(2, seq.get(1));
    assertEquals(5, seq.get(2));
    assertEquals(9, seq.get(3));
  }
  @Test void testMap() {
    LinkedSeq<Integer> seq = new LinkedSeq<>();
    seq.add(1);
    seq.add(2);
    seq.add(5);
    seq.add(9);
    var newSeq = seq.map(x -> x * 2);
    // assertEquals(LinkedSeq.of(2, 4, 10, 18), newSeq);
    assertEquals(2, newSeq.get(0));
    assertEquals(4, newSeq.get(1));
    assertEquals(10, newSeq.get(2));
    assertEquals(18, newSeq.get(3));
  }
}
