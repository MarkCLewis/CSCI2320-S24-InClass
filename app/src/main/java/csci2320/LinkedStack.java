package csci2320;

import java.util.EmptyStackException;

public class LinkedStack<E> {
  private static class Node<E> {
    E data;
    Node<E> next;

    Node(E elem, Node<E> next) {
      data = elem;
      this.next = next;
    }
  }
  Node<E> top = null;

  public E pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    var tmp = top.data;
    top = top.next;
    return tmp;
  }

  public void push(E elem) {
    top = new Node<E>(elem, top);
  }

  public E peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return top.data;
  }

  public boolean isEmpty() {
    return top == null;
  }
}
