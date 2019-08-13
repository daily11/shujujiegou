package com.swust.二叉树;

/**
 * 满二叉树：所有节点（非叶子节点），左右子树均非空
 * 
 * 完全二叉树：非满的节点，必然在整棵树的右下角
 * 
 * 二分搜索树性质： 1 二分搜索树是二叉树 2 二分搜索树的每个节点的值： 大于其左子树的所有节点的值 小于其右子树的所有节点的值 3
 * 每一棵子树也是二分搜索树
 */
public interface BSTInterface<E extends Comparable<E>> {

	// private class Node{
	// public E e;
	// public Node left, right;
	//
	// public Node(E e){
	// this.e = e;
	// left = null;
	// right = null;
	// }
	// }
	//
	// private Node root;
	// private int size;

	int size();

	boolean isEmpty();

	/*********************************** 包含开始 ***************************************/

	// 看二分搜索树中是否包含元素e
	boolean contains(E e);

	// 看以node为根的二分搜索树中是否包含元素e, 递归算法
	// private boolean contains(Node node, E e)
	/*********************************** 包含结束 ***************************************/

	/*********************************** 增开始 ***************************************/
	// 向二分搜索树中添加新的元素e
	void add(E e);

	// 向以node为根的二分搜索树中插入元素e，递归算法
	// 返回插入新节点后二分搜索树的根
	// private Node add(Node node, E e)
	/*********************************** 增结束 ***************************************/

	/*********************************** 遍历开始 ***************************************/
	// 二分搜索树的前序遍历
	void preOrder();

	// private void preOrder(Node node)

	// 二分搜索树的前序遍历【非递归。入隊順序：先右子樹，再左子樹】
	void preOrderNR();

	// 二分搜索树的中序遍历
	void inOrder();

	// 二分搜索树的后序遍历
	void postOrder();

	// 二分搜索树的层序遍历[入隊順序：先左子樹，再右子樹]
	void levelOrder();

	/*********************************** 遍历结束 ***************************************/

	/*********************************** 查开始 ***************************************/
	// 寻找二分搜索树的最小元素
	/**
	 * 1 递归找到最左侧的节点
	 */
	E minimum();

	// 返回以node为根的二分搜索树的最小值所在的节点
	// private Node minimum(Node node);

	// 寻找二分搜索树的最大元素
	/**
	 * 1 递归找到最右侧的节点
	 */
	E maximum();

	// 返回以node为根的二分搜索树的最大值所在的节点
	// private Node maximum(Node node);
	/*********************************** 查开始 ***************************************/

	/*********************************** 删开始 ***************************************/
	// 从二分搜索树中删除最小值所在节点, 返回最小值
	E removeMin();

	// 删除掉以node为根的二分搜索树中的最小节点
	// 返回删除节点后新的二分搜索树的根
	/**
	 * 1 递归找到最小的节点 2 父节点的左孩子=待删除节点的右孩子
	 */
	// private Node removeMin(Node node)

	// 从二分搜索树中删除最大值所在节点
	E removeMax();

	/**
	 * 1 递归找到最大的节点 2 父节点的右孩子=待删除节点的左孩子
	 */
	// private Node removeMax(Node node)

	/**
	 * 从二分搜索树中删除元素为e的节点 1 递归查询到待删除的节点 2 待删除节点三种状态： 2.1 左子树空 2.2 右子树空 2.3 左右子树非空
	 * 2.3.1 找到待删除节点cur右子树最小的节点，命名为successor 2.3.2
	 * successor右子树为（cur右子树，这个右子树已经删除最小节点） 2.3.3 successor左子树为（cur左子树）
	 * 
	 * @param e
	 */
	void remove(E e);

	// 删除掉以node为根的二分搜索树中值为e的节点, 递归算法
	// 返回删除节点后新的二分搜索树的根
	// private Node remove(Node node, E e)
	/*********************************** 删结束 ***************************************/

}
