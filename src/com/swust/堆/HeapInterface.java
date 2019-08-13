package com.swust.堆;

import com.swust.数组.Array;

/**
 * 二叉堆是一棵完全二叉树，通常是一个可以被看做一棵树的数组对象 特性：所有节点值>=孩子节点值
 * 
 * 父节点 = (index - 1) / 2; 左孩子 = index * 2 + 1; 右孩子 = index * 2 + 2;
 */
public interface HeapInterface<E extends Comparable<E>> {

	// private Array<E> data;

	int getSize();

	boolean isEmpty();

	boolean contains(E e);

	// 返回父节点值
	int parent(int index);

	// 返回左孩子值
	int leftChild(int index);

	// 返回右孩子值
	int rightChild(int index);

	// 向堆中添加元素
	public void add(E e);

	/**
	 * 元素上浮 从最末尾节点开始 变动的子节点与父节点大，则交换位置
	 * 
	 * @param k
	 *            子节点索引值
	 */
	// private void siftUp(int k);

	// 取出堆中最大元素
	public E extractMax();

	/**
	 * 元素下浮
	 * 
	 * 从最开始节点开始 max(左孩子，右孩子)与父节点大，则交换位置
	 * 
	 * @param k
	 *            子节点索引值
	 */
	// private void siftDown(int k)

}
