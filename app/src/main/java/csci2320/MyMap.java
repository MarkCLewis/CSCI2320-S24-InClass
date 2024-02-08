package csci2320;

public interface MyMap<K, V> {
  V put(K key, V value);
  V get(K key);
  boolean contains(K key);
  V remove(K key);
  int size();
}
