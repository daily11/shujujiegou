package com.swust.链表;

import java.util.HashMap;

/**
 * 递归链表
 * @author chen
 *
 * @param <E>
 */
public class LinkedListR<E> implements LinkedListInterface<E> {

	private class ListNode{
		public E e;
		public ListNode next;
		
		public ListNode(E e,ListNode next){
			this.e = e;
			this.next = next;
		}
		
		public ListNode(E e) {
			this(e, null);
		}
		
		public ListNode() {
			this(null,null);
		}

		@Override
		public String toString() {
			return e.toString();
		}
	}
	
	private ListNode head;
	private int size;
	private E deleteElement;
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void add(int index, E e) {
	      if(index < 0 || index > size)
	          throw new IllegalArgumentException("Add failed. Illegal index.");

	      head = add(head, index, e);
	      size ++;
	}
	
	/**
	 * 添加新节点（从头开始）
	 */
	public ListNode add(ListNode node,int index,E e) {
	      if(index == 0) {
	    	  return new ListNode(e, node);
	      }
	      
	      node.next = add(node.next, index - 1, e);
	      return node;
	}
	
	@Override
	public void addFirst(E e) {
		add(0,e);
	}

	@Override
	public void addLast(E e) {
		add(size,e);
	}

	@Override
	public E get(int index) {
		if(index < 0 || index >= size)
	          throw new IllegalArgumentException("Get failed. Illegal index.");
		
		E e = get(head,index);
		return e;
	}

	private E get(ListNode node, int index) {
		if(index==0) {
			return node.e;
		}
		return get(node.next,index-1);
	}

	@Override
	public E getFirst() {
		return get(0);
	}

	@Override
	public E getLast() {
		return get(size-1);
	}

	@Override
	public void set(int index, E e) {
		if(index < 0 || index >= size)
	          throw new IllegalArgumentException("Update failed. Illegal index.");
		
		head = set(head,index,e);
	}

	private ListNode set(ListNode node, int index, E e) {
		
		if(index==0) {
			node.e = e;
			return node;
		}
		
		node.next = set(node.next,index-1,e);
		return node;
	}

	@Override
	public boolean contains(E e) {
		return contains(head,e);
	}
	
	public boolean contains(ListNode node,E e) {
		
		if(node == null)
			return false;
		
		if(node.e.equals(e)) {
			return true;
		}
		
		return contains(node.next,e);
	}

	@Override
	public E remove(int index) {
		
		if(index < 0 || index >= size)
	          throw new IllegalArgumentException("Remove failed. Index is illegal.");
		
		head = remove(head,index);
		size --;
		return deleteElement;
	}
	
	public ListNode remove(ListNode node,int index) {
		if(index==0) {
			deleteElement = node.e;
			return node.next;
		}
		node.next = remove(node.next,index-1);
		return node;
	}

	@Override
	public E removeFirst() {
		return remove(0);
	}

	@Override
	public E removeLast() {
		return remove(size-1);
	}

	@Override
	public void removeElement(E e) {
		
		head = removeElement(head,e);
		size --;
	}
	
	public ListNode removeElement(ListNode node,E e) {
		if(node==null)
			return null;
		
		if(node.e.equals(e)) {
			return node.next;
		}
		
		node.next = removeElement(node.next,e);
		return node;
	}
	
	@Override
	public String toString() {
	      StringBuilder res = new StringBuilder();
	      ListNode cur = head;
	      while(cur != null){
	          res.append(cur + "->");
	          cur = cur.next;
	      }
	      res.append("NULL");
	      return res.toString();
	}
	


	public static void main(String[] args) {
		LinkedListR<Integer> list = new LinkedListR<>();
		for (int i = 0; i < 10; i++)
			list.addFirst(i);
		
		System.out.println("链表--->"+list);
		System.out.println("修改前第2个数值--->"+list.get(2));
		
		list.set(2,111);
		System.out.println("修改后第2个数值--->"+list.get(2));
		
		boolean flag = list.contains(112);
		System.out.println("是否包含第2个数值--->"+flag);
		
		list.remove(2);
		System.out.println("删除第2个数值后的链表--->"+list);
		
		list.removeElement(8);
		System.out.println("删除数值8后的链表--->"+list);
		
		System.out.println();
		
		while (!list.isEmpty())
			System.out.println("removed " + list.removeLast()+" ,链表："+list);
	}

	@Override
	public void add(E e) {
		
	}

}
