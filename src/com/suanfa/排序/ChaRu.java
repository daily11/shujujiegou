package com.suanfa.排序;

import java.util.*;

public class ChaRu<E extends Comparable<E>> implements Sorter<E> {

	private E[] data;

	// 构造函数，传入数组的容量capacity构造Array
	public ChaRu(E[] arr) {
		data = arr;
	}

	/**
	 * 待插入元素从待插入位置往前遍历比较大小
	 * 原始数据：11 9 8
	 * 第一轮：11 
	 * 第二轮：11 9---11 11---9 11 
	 * 第三轮：9 11 8---9 11 11---9 9 11---8 9 11
	 */
	@Override
	public void sort() {
		int len = data.length;
		int preIndex;
		E cur;
		for (int i = 1; i < len; i++) {
			preIndex = i - 1;
			cur = data[i];
			// 1 如果前者大于后者
			while (preIndex >= 0 && data[preIndex].compareTo(cur) > 0) {
				// 2 就把所有元素往后推一个位置
				data[preIndex + 1] = data[preIndex];
				preIndex--;
			}
			// 3 待插入元素放入最小元素后一位
			data[preIndex + 1] = cur;
		}
	}

	@Override
	public void print() {
		int len = data.length;
		for (int i = 0; i < len; i++) {
			if (i != len - 1)
				System.out.print(data[i] + ",");
			else
				System.out.print(data[i]);
		}
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
