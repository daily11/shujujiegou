package com.swust.栈;

public interface Stack<E> {

    void push(E e);
    E pop();
    E peek();
    
    int getSize();
    boolean isEmpty();
}
