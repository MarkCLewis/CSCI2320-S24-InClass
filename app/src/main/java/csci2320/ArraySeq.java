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
    if (numElems >= data.length) {
      growArray();
    }
    data[numElems] = elem;
    numElems++;
  }

  private void growArray() {
    @SuppressWarnings("unchecked")
    E[] tmp = (E[])new Object[data.length * 2];
    for(int i = 0; i < data.length; ++i) {
      tmp[i] = data[i];
    }
    data = tmp;
  }

  @Override
  public void insert(int index, E elem) {
    if (numElems >= data.length) {
      growArray();
    }
    for (int i = numElems; i > index; --i) {
      data[i] = data[i-1];
    }
    data[index] = elem;
    numElems++;
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
    var tmp = data[index];
    data[index] = elem;
    return tmp;
  }

  @Override
  public boolean contains(E elem) {
    for (int i = 0; i < numElems; ++i) {
      if (data[i].equals(elem)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int size() {
    return numElems;
  }
  
}
