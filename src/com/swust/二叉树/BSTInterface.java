package com.swust.二叉树;

public interface BSTInterface<E> {

	int getSize();
	
	boolean isEmpty();
	
	// 向二分搜索树中添加新的元素e
	void add(E e);
	
	// 看二分搜索树中是否包含元素e
	boolean contains(E e);
	
	// 二分搜索树的前序遍历
	void preOrder();
	
	// 二分搜索树的前序遍历【非递归】
	void preOrderNR();
	
	// 二分搜索树的中序遍历
	void inOrder();
	
	// 二分搜索树的后序遍历
	void postOrder();
	
	// 二分搜索树的层序遍历
	void levelOrder();
	
	// 寻找二分搜索树的最小元素
	E minimum();
	
	// 寻找二分搜索树的最大元素
	E maximum();
	
	// 从二分搜索树中删除最小值所在节点, 返回最小值
	E removeMin();
	
	// 从二分搜索树中删除最大值所在节点
	E removeMax();
	
	/**
	 *  从二分搜索树中删除元素为e的节点
	 *  1 递归查询到待删除的节点
	 *  2 待删除节点三种状态：
	 *  	2.1 左子树空
	 *  	2.2 右子树空
	 *  	2.3 左右子树非空
	 * @param e
	 */
	void remove(E e);
	
	
}
