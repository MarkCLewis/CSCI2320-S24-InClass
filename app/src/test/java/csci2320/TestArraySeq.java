package csci2320;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestArraySeq {
  @Test void emptyOnCreate() {
    var seq = new ArraySeq<Integer>();
    assertEquals(0, seq.size());
  }
}
