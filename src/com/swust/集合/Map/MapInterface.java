package com.swust.集合.Map;

public interface MapInterface<K, V> {

	// 获取二分搜索树的大小
	int size();

	// 判断二分搜索树是否为空
	boolean isEmpty();

	// 从二分搜索树中获取键为key的节点
	// private Node getNode(K key)

	// 判断二分搜索树种是否存在键为key的节点
	boolean contains(K key);

	// 往二分搜索树种添加键为key,值为value的节点
	void put(K key, V value);

	// 从二分搜索树种获取键为key的节点值
	V get(K key);

	// 返回以node为根的二分搜索树的最小值所在的节点
	// private Node minimum(Node node)

	// 删除掉以node为根的二分搜索树中的最小节点,返回删除节点后新的二分搜索树的根
	// private Node removeMin(Node node)

	// 从二分搜索树中删除键为key的节点
	V remove(K key);

}
