package com.swust.avl平衡树;

import java.util.ArrayList;

/**
 * 平衡二叉树：对于任意一个节点，左子树和右子树的高度差不能为超过1
 * 
 * AVL：首先，是二分搜索树；其次，是平衡二叉树
 */
public interface AVLInterface<K extends Comparable<K>, V> {

//    private class Node{
//        public K key;
//        public V value;
//        public Node left, right;
//        public int height;
//
//        public Node(K key, V value){
//            this.key = key;
//            this.value = value;
//            left = null;
//            right = null;
//            height = 1;
//        }
//    }
//
//    private Node root;
//    private int size;
//
//    public AVLTree(){
//        root = null;
//        size = 0;
//    }
	
	int size();
	
	boolean isEmpty();
	
	 /**
     * 判断该二叉树是否是一棵二分搜索树
     * 
     * 思路：
     * 1 中序遍历
     * 2 针对中序遍历结果，前者大于后者则非二分搜索树！
     */
    public boolean isBST();
    
//    private void inOrder(Node node, ArrayList<K> keys)
    
    /**
     * 判断该二叉树是否是一棵平衡二叉树
     * 
     * 思路：
     * 左右子树高度差不能大于1。因此，递归遍历左右子树，
     * 只要有一个节点的平衡因子大于1就返回false
     * 到了根节点递归还没结束，则代表所有节点都没有遇到上一行的情况，因此返回true
     */
    public boolean isBalanced();
    
//    private void inOrder(Node node, ArrayList<K> keys)
    
//    private boolean isBalanced(Node node)
    
    // 获得节点node的高度
//    private int getHeight(Node node)
    
    // 获得节点node的平衡因子
//    private int getBalanceFactor(Node node)
    
    // 对节点y进行向右旋转操作，返回旋转后新的根节点x
    //        y                              x
    //       / \                           /   \
    //      x   T4     向右旋转 (y)          z     y
    //     / \       - - - - - - - ->    / \   / \
    //    z   T3                       T1  T2 T3 T4
    //   / \
    // T1   T2
    /**
     * 右旋转
     * 
     * 思路：
     * 旋转完成以后，要注意更新旋转点的高度
     */
//    private Node rightRotate(Node y)
    
    // 对节点y进行向左旋转操作，返回旋转后新的根节点x
    //    y                             x
    //  /  \                          /   \
    // T1   x      向左旋转 (y)         y     z
    //     / \   - - - - - - - ->   / \   / \
    //   T2  z                     T1 T2 T3 T4
    //      / \
    //     T3 T4
    
    /**
     * 左旋转
     * 
     * 思路：
     * 1 传入的参数节点，就是不平衡的节点！
     * 2 旋转完成以后，要注意更新旋转点的高度
     */
//    private Node leftRotate(Node y)
    
    // 向二分搜索树中添加新的元素(key, value)
    public void put(K key, V value);
    
//    private Node put(Node node, K key, V value)
    
    // 返回以node为根节点的二分搜索树中，key所在的节点
//    private Node getNode(Node node, K key)
    
    public boolean contains(K key);
    
    public V get(K key);
    
    public void set(K key, V newValue);
    
    // 返回以node为根的二分搜索树的最小值所在的节点
//    private Node minimum(Node node)
    
//    private Node removeMin(Node node)

    // 从二分搜索树中删除键为key的节点
    public V remove(K key);
    
    //待删除节点，左右子树均空，既待删除节点是叶子节点，就没必要更新高度与旋转操作了
//    private Node remove(Node node, K key)
    
}
