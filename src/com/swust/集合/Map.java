package com.swust.集合;

public interface Map<K extends Comparable<K>, V>  {

//    class Node{
//        public K key;
//        public V value;
//        public Node left, right;
//
//        public Node(K key, V value){
//            this.key = key;
//            this.value = value;
//            left = null;
//            right = null;
//        }
//    }
    
	int getSize();
    
    boolean isEmpty();
    
    // 返回以node为根节点的二分搜索树中，key所在的节点
//    private Node getNode(Node node, K key)

    boolean contains(K key);
    
/***********************************增开始***************************************/
    // 向二分搜索树中添加新的元素(key, value)
    void put(K key, V value);
    
    // 向以node为根的二分搜索树中插入元素(key, value)，递归算法
    // 返回插入新节点后二分搜索树的根
//    private Node put(Node node, K key, V value);
/***********************************增结束***************************************/

/***********************************删开始***************************************/
    // 返回以node为根的二分搜索树的最小值所在的节点
//    private Node minimum(Node node)

    // 删除掉以node为根的二分搜索树中的最小节点
    // 返回删除节点后新的二分搜索树的根
//    private Node removeMin(Node node);
    
    V remove(K key);
/***********************************删开始***************************************/
    
    //改
    void set(K key, V value);
    
    //查
    V get(K key);
    
}
