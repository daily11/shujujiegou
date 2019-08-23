package com.suanfa.排序;

import java.util.*;

/**
 * 冒泡排序法
 * 思路：
 * 	（1）外层进行n-1轮排序
 *  （2）内层进行n-1-i轮排序
 *  	2.1）因为内层每一次排序，最大的数都下沉到底部，因此倒数i个元素不要再排序
 *  	2.2）内层从头到尾两两排序，前者大于后者就交换二者值
 */
public class MaoPao<E extends Comparable<E>> implements Sorter<E> {
	
    private E[] data;

    // 构造函数，传入数组的容量capacity构造Array
    public MaoPao(E[] arr){
    	data = arr;
    }

	@Override
	public void sort() {
		for (int i = 0, len = data.length; i < len - 1; ++i) {
			for (int j = 0; j < len - 1 - i; ++j) {
				if (data[j].compareTo(data[j + 1]) > 0) {
					E temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
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
