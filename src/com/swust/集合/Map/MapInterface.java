package com.swust.集合.Map;

public interface MapInterface<K, V> {

	int size();
	
	boolean isEmpty();
	
//	private Node getNode(K key)
	boolean contains(K key);
	
	void put(K key,V value);
	
	V remove(K key);
	
	V get(K key);
    
}
