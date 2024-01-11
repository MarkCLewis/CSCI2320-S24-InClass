package csci2320;

public interface Seq<E> extends Iterable<E> {
  void add(E elem);
  void insert(int index, E elem);
  E remove(int index);
  E get(int index);
  E set(int index, E elem);
  boolean contains(E elem);
  int size();
}
