package com.swust.avl平衡树;

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
	
    // 判断该二叉树是否是一棵二分搜索树
    public boolean isBST();
    
//    private void inOrder(Node node, ArrayList<K> keys)
    
    // 判断该二叉树是否是一棵平衡二叉树
    public boolean isBalanced();
    
//    private boolean isBalanced(Node node)
    
    // 获得节点node的高度
//    private int getHeight(Node node)
    
    // 获得节点node的平衡因子
//    private int getBalanceFactor(Node node)
    
    //右旋转
//    private Node rightRotate(Node y)
    
    //左旋转
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
    
//    private Node remove(Node node, K key)
    
}
