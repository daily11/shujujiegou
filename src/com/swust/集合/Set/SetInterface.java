package com.swust.集合.Set;

public interface SetInterface<E> {

    int size();
    
    boolean isEmpty();
    
    boolean contains(E e);
    
	void add(E e);
	
	void remove(E e);
}
