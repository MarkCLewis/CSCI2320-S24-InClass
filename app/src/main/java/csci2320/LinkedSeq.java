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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'insert'");
  }

  @Override
  public E remove(int index) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
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
