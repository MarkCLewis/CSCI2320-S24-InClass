package csci2320;

public interface MySet<E> {
  boolean add(E elem);
  boolean contains(E elem);
  boolean remove(E elem);
  int size();
  MySet<E> intersect(MySet<E> that);
  MySet<E> union(MySet<E> that);
  MySet<E> diff(MySet<E> that);
}
