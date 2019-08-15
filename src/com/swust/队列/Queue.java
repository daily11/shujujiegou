package com.swust.队列;

public interface Queue<E> {
	
//    private class Node{
//        public E e;
//        public Node next;
//
//        public Node(E e, Node next){
//            this.e = e;
//            this.next = next;
//        }
//
//        public Node(E e){
//            this(e, null);
//        }
//
//        public Node(){
//            this(null, null);
//        }
//
//        @Override
//        public String toString(){
//            return e.toString();
//        }
//    }
//
//    private Node head, tail;
//    private int size;
//
//    public LinkedListQueue(){
//        head = null;
//        tail = null;
//        size = 0;
//    }

    void offer(E e);
    E poll();
    E peek();
    
    int getSize();
    boolean isEmpty();
}
