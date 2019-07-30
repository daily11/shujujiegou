package com.swust.队列;

public interface Queue<E> {

    void offer(E e);
    E poll();
    E peek();
    
    int getSize();
    boolean isEmpty();
}
