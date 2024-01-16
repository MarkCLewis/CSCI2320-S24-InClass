package csci2320;

import java.util.Iterator;

public class ArraySeq<E> implements Seq<E> {
  @SuppressWarnings("unchecked")
  private E[] data = (E[]) new Object[10];
  private int numElems = 0;

  @Override
  public Iterator<E> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }

  @Override
  public void add(E elem) {
    data[numElems] = elem;
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
    return data[index];
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
    return numElems;
  }
  
}
