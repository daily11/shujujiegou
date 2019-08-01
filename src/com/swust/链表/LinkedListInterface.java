package com.swust.链表;

/**
 * 添加+删除：找前缀，其他操作找当前节点
 */
public interface LinkedListInterface<E> {

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
//    private Node dummyHead;
//    private int size;
	
//    public LinkedList(){
//        dummyHead = new Node();
//        size = 0;
//    }
	
	int size();
	
	boolean isEmpty();
	
	boolean contains(E e);
	
	/*********************添加元素***********************/
	
	void add(E e);
	
	void add(int index, E e);
	
	void addFirst(E e);
	
	void addLast(E e);
	
	/*********************获取元素***********************/
	E get(int index);
	
	E getFirst();
	
	E getLast();
	
	/*********************修改元素***********************/
	void set(int index, E e);
	
	/*********************删除元素***********************/
	E remove(int index);
	
	E removeFirst();
	
	E removeLast();
	
	void removeElement(E e);
	
}