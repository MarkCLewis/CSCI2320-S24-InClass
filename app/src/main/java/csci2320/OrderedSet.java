package csci2320;

public class OrderedSet<E extends Comparable<E>> implements MySet<E> {

  private static class Node<E> {
    E elem;
    Node<E> left = null, right = null;
    E min, max;
    Node(E elem) {
      this.elem = elem;
      min = elem;
      max = elem;
    }
    public boolean overlapsRange(E rmin, E rmax) {
      // TODO:
      return true;
    }
    public void addRange(E newElem) {
      // TODO:
    }
  }

  private Node<E> root = null;
  private int numElems = 0;

  @Override
  public boolean add(E elem) {
    Node<E> rover = root;
    Node<E> trailer = null;
    while (rover != null && !rover.elem.equals(elem)) {
      trailer = rover;
      rover.addRange(elem);
      if (elem.compareTo(rover.elem) < 0) rover = rover.left;
      else rover = rover.right;
    }
    if (rover != null) {
      return false;
    } else if (trailer == null) {
      root = new Node<E>(elem);
      numElems++;
      return true;
    } else {
      numElems++;
      if (elem.compareTo(trailer.elem) < 0) trailer.left = new Node<E>(elem);
      else trailer.right = new Node<E>(elem);
      return true;
    }
  }

  @Override
  public boolean contains(E elem) {
    Node<E> rover = root;
    while (rover != null && !rover.elem.equals(elem)) {
      if (elem.compareTo(rover.elem) < 0) rover = rover.left;
      else rover = rover.right;
    }
    return rover != null;
  }

  private void allInRangeRecur(E min, E max, OrderedSet<E> set, Node<E> current) {
    if (current == null || !current.overlapsRange(min, max)) return;
    if (current.elem.compareTo(min) >= 0 && current.elem.compareTo(max) <= 0) {
      set.add(current.elem);
    }
    allInRangeRecur(min, max, set, current.left);
    allInRangeRecur(min, max, set, current.right);
  }

  public OrderedSet<E> allInRange(E min, E max) {
    OrderedSet<E> ret = new OrderedSet<>();
    allInRangeRecur(min, max, ret, root);
    return ret;
  }

  @Override
  public boolean remove(E elem) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public int size() {
    return numElems;
  }

  @Override
  public MySet<E> intersect(MySet<E> that) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'intersect'");
  }

  @Override
  public MySet<E> union(MySet<E> that) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'union'");
  }

  @Override
  public MySet<E> diff(MySet<E> that) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'diff'");
  }
  
}
