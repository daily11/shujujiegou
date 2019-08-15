package com.swust.并查集;

public interface UnionFindInterface {
	
//	private int[] rank;
//    private int[] parent; // parent[i]表示第i个元素所指向的父节点
//
//    // 构造函数
//    public UnionFind(int size){
//
//        rank = new int[size];
//        parent = new int[size];
//
//        // 初始化, 每一个parent[i]指向自己, 表示每一个元素自己自成一个集合
//        for( int i = 0 ; i < size ; i ++ ){
//            parent[i] = i;
//            rank[i] = 1;
//        }
//    }

	/**
	 * 查找p对应的集合编号，采用路径压缩方案，具体parent[p] = parent[parent[p]];
	 * 
	 *         0                0                 0
	 *       1                1                1      2
	 *     2                2                       3    4 
	 *   3      ------》      3    4   ------》                       
	 * 4
	 */
//	private int find(int p)
	
	/**
	 * 判断两个元素是否有共同的父节点
	 */
	boolean isConnected(int p , int q);
	
	/**
	 * 根据两个元素所在树的rank不同判断合并方向
	 * 将rank低的集合合并到rank高的集合上
	 */
	void union(int p , int q);
}
