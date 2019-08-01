package com.swust.集合.Set;

import com.swust.链表.LinkedList;

public class LinkedListSet<E> implements SetInterface<E> {

	private LinkedList<E> list;
	
	public LinkedListSet(){
		list = new LinkedList<>();
	}
	
	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.size()==0;
	}

	@Override
	public boolean contains(E e) {
		return list.contains(e);
	}

	@Override
	public void add(E e) {
		if(!list.contains(e))
			list.add(e);
	}

	@Override
	public void remove(E e) {
		list.removeElement(e);
	}
	
	@Override
    public String toString(){
        return list.toString();
    }
	
    public static void main(String[] args){
    	LinkedListSet<Integer> set = new LinkedListSet<>();
    	for(int i=0;i<10;i++){
    		set.add(i);
    	}
    	sop(set.toString());
    	set.remove(7);
    	sop(set.toString());
    }
    
    public static void sop(Object obj){
    	System.out.println(obj);
    }

}
