package com.swust.红黑树;

import java.util.ArrayList;

/**
 * 红黑树：是二分搜索树的一种，具有以下特质：
 * (1)每个节点或者是红色的，或者是黑色的
 * (2)根节点是黑色的
 * (3)每一个叶子节点（最后的空节点）是黑色的
 * (4)如果一个节点是红色的，那么他的孩子节点都是黑色的
 * (5)从任意一个节点到叶子节点，经过的黑色节点是一样的
 * 
 * 旋转操作：
 * 
 *   黑                     红          (左旋转)       黑               (右旋转)        黑                       (颜色旋转)       红
 * 红       --->红                    --->      红                        --->      红              红                    --->      黑              黑
 *           黑                                    红
 */
public interface RBTreeInterface<K extends Comparable<K>, V> {

//	   private class Node{
//	        public K key;
//	        public V value;
//	        public Node left, right;
//	        public boolean color;
//
//	        public Node(K key, V value){
//	            this.key = key;
//	            this.value = value;
//	            left = null;
//	            right = null;
//	            color = RED;
//	        }
//	    }
//
//	    private Node root;
//	    private int size;
//
//	    public RBTree(){
//	        root = null;
//	        size = 0;
//	    }
	
	int size();
	
	boolean isEmpty();
	
	 /**
     *  判断节点node的颜色
     * 
     * 思路：
     * 1 直接返回节点颜色
     */
//    private boolean isRed(Node node);
    
	
    //   node                      x
    //  /   \     左旋转                                   /  \
    // T1    x   --------->    node   T3
    //      / \               /   \
    //     T2 T3             T1   T2
//    private Node leftRotate(Node node)
	
	
    //     node                   x
    //    /   \     右旋转                          /  \
    //   x    T2   ------->     y  node
    //  / \                        /  \
    // y  T1                      T1  T2
//    private Node rightRotate(Node node)
	
	
    // 颜色翻转
//    private void flipColors(Node node)
	
	
   
    // 向二分搜索树中添加新的元素(key, value)
    public void put(K key, V value);
    
    /**
     * 思路：
     * 1 左黑右红，左旋转
     * 2 左红左左红，右旋转
     * 3 左红右红，颜色翻转
     */
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
