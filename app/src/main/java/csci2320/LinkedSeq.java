package csci2320;

import java.util.Iterator;

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

  @Override
  public Iterator<E> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }

  @Override
  public void add(E elem) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public E set(int index, E elem) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'set'");
  }

  @Override
  public boolean contains(E elem) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }
  
}
