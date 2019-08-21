package com.suanfa.排序;

import java.util.*;

/**
 * 排序器接口(策略模式: 将算法封装到具有共同接口的独立的类中使得它们可以相互替换)
 */
public interface Sorter<T extends Comparable<T>> {
	/**
	 * 排序
	 * @param list 待排序的数组
	 */
	public void sort();
	
	/**
	 * 打印
	 * @param list
	 */
	public void print();

//	/**
//	 * 排序
//	 * @param list 待排序的数组
//	 * @param comp 比较两个对象的比较器
//	 */
//	public void sort(T[] list, Comparator<T> comp);
}