package com.suanfa.查找;

public class HaXi<E extends Comparable<E>> {
	
	private class Node<E>{
		public E e;
		public Node next;
		public Node(E e){
			this.e = e;
			this.next = null;
		}
	}
	
	private static final int M = 7;
	private Node[] data;
	
	public HaXi(){
		data = new Node[M];
	}
	
	/**
	 * 创建哈希表
	 * @param e
	 */
	public void add(E e){
		int hash = e.hashCode()  % M;
		Node cur = data[hash];
		if(cur==null){
			cur = new Node(e);
			data[hash] = cur;
		}else{
			while(cur!=null){
				cur = cur.next;
			}
			cur = new Node(e);
		}
	}
	
	/**
	 * 哈希查找
	 */
	public int find(E e){
		int i=0, hash = e.hashCode() % M;
		Node cur = data[hash];
		while(cur!=null){
			if(cur.e.equals(e)){
				i++;
				return i;
			}else{
				cur = cur.next;
			}
		}
		return -1;
	}
	
}
