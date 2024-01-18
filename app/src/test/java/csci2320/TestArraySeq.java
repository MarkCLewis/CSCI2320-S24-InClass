package csci2320;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestArraySeq {
  @Test void emptyOnCreate() {
    var seq = new ArraySeq<Integer>();
    assertEquals(0, seq.size());
  }

  @Test void addGet() {
    var seq = new ArraySeq<Integer>();
    seq.add(7);
    seq.add(3);
    seq.add(9);
    seq.add(2);
    assertEquals(7, seq.get(0));
    assertEquals(3, seq.get(1));
    assertEquals(9, seq.get(2));
    assertEquals(2, seq.get(3));
  }

  @Test void addGetLots() {
    var seq = new ArraySeq<Integer>();
    for(int i = 0; i < 10; ++i) {
      seq.add(i);
    }
    for(int i = 0; i < 10; ++i) {
      assertEquals(i, seq.get(i));
    }
  }

}
