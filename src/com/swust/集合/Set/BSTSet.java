package com.swust.集合.Set;

import com.swust.二叉树.BST;

public class BSTSet<E extends Comparable<E>> implements SetInterface<E> {

	private BST<E> bst;
	
	public BSTSet(){
		bst = new BST<>();
	}
	
	@Override
	public int size() {
		return bst.size();
	}

	@Override
	public boolean isEmpty() {
		return bst.isEmpty();
	}

	@Override
	public boolean contains(E e) {
		return bst.contains(e);
	}

	@Override
	public void add(E e) {
		if(!bst.contains(e))
			bst.add(e);
	}

	@Override
	public void remove(E e) {
		bst.remove(e);
	}

}
