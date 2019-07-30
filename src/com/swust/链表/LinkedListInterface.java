package com.swust.链表;

/**
 * 添加+删除：找前缀，其他操作找当前节点
 */
public interface LinkedListInterface<E> {

	int getSize();
	
	boolean isEmpty();
	
	void add(int index, E e);
	
	void addFirst(E e);
	
	void addLast(E e);
	
	E get(int index);
	
	E getFirst();
	
	E getLast();
	
	void set(int index, E e);
	
	boolean contains(E e);
	
	E remove(int index);
	
	E removeFirst();
	
	E removeLast();
	
	void removeElement(E e);
}