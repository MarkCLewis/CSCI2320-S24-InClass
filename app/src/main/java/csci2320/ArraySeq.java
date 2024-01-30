package csci2320;

import java.util.Iterator;

public class ArraySeq<E> implements Seq<E> {
  @SuppressWarnings("unchecked")
  private E[] data = (E[]) new Object[10];
  private int numElems = 0;

  @Override
  public Iterator<E> iterator() {
    return new Iterator<E>() {
      private int i = 0;
      @Override
      public boolean hasNext() {
        return i < numElems;
      }

      @Override
      public E next() {
        E tmp = data[i];
        i++;
        return tmp;
      }
      
    };
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
    E tmp = data[index];
    for (int i = index; i < numElems - 1; ++i) {
      data[i] = data[i + 1];
    }
    numElems--;
    data[numElems] = null;
    return tmp;
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
