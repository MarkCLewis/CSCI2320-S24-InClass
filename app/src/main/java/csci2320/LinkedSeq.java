package csci2320;

import java.util.Iterator;
import java.util.function.Function;

public class LinkedSeq<E> implements Seq<E> {
  private static class Node<E> {
    E data;
    Node<E> next;

    Node(E elem, Node<E> next) {
      data = elem;
      this.next = next;
    }
  }

  private Node<E> head = null;
  private Node<E> tail = null;
  private int numElems = 0;

  @Override
  public Iterator<E> iterator() {
    return new Iterator<E>() {
      Node<E> rover = head;
      @Override
      public boolean hasNext() {
        return rover != null;
      }

      @Override
      public E next() {
        var tmp = rover.data;
        rover = rover.next;
        return tmp;
      }

    };
  }

  @Override
  public void add(E elem) {
    if (tail == null) {
      head = tail = new Node<E>(elem, null);
    } else {
      tail.next = new Node<E>(elem, null);
      tail = tail.next;
    }
    numElems++;
  }

  @Override
  public void insert(int index, E elem) {
    if (index < 0 || index > numElems) {
      throw new IndexOutOfBoundsException("Asked for " + index + " of " + numElems);
    }
    numElems++;
    if (index == 0) {
      head = new Node<E>(elem, head);
      if (tail == null) tail = head;
    } else {
      Node<E> rover = head;
      for (int i = 0; i < index-1; ++i) {
        rover = rover.next;
      }
      rover.next = new Node<E>(elem, rover.next);
      if (rover == tail) tail = rover.next;
    }
  }

  @Override
  public E remove(int index) {
    if (index < 0 || index >= numElems) {
      throw new IndexOutOfBoundsException("Asked for " + index + " of " + numElems);
    }
    numElems--;
    if (index == 0) {
      var tmp = head.data;
      head = head.next;
      if (head == null) tail = null;
      return tmp;
    } else {
      Node<E> rover = head;
      for (int i = 0; i < index-1; ++i) {
        rover = rover.next;
      }
      var tmp = rover.next.data;
      rover.next = rover.next.next;
      if (rover.next == null) tail = rover;
      return tmp;
    }
  }

  @Override
  public E get(int index) {
    if (index < 0 || index >= numElems) {
      throw new IndexOutOfBoundsException("Asked for " + index + " of " + numElems);
    }
    Node<E> rover = head;
    for (int i = 0; i < index; ++i) {
      rover = rover.next;
    }
    return rover.data;
  }

  @Override
  public E set(int index, E elem) {
    if (index < 0 || index >= numElems) {
      throw new IndexOutOfBoundsException("Asked for " + index + " of " + numElems);
    }
    Node<E> rover = head;
    for (int i = 0; i < index; ++i) {
      rover = rover.next;
    }
    var tmp = rover.data;
    rover.data = elem;
    return tmp;
  }

  @Override
  public boolean contains(E elem) {
    Node<E> rover = head;
    while (rover != null && !elem.equals(rover.data)) rover = rover.next;
    return rover != null;
  }

  @Override
  public int size() {
    return numElems;
  }
  
  public <E2> Seq<E2> map(Function<E, E2> func) {
    Seq<E2> result = new LinkedSeq<>();
    for (E elem: this) {
      result.add(func.apply(elem));
    }
    return result;
  }
}
