package com.suanfa.排序;

import java.util.*;

/**
 * 冒泡排序法
 * 思路：
 * 	（1）外层进行n-1轮排序
 *  （2）内层进行n-1-i轮排序
 *  	2.1）因为外层每一次排序，最大的数都下沉到底部，因此倒数i个元素不要再排序
 *  	2.2）内层从头到尾两两排序，前者大于后者就交换二者值
 */
public class ChaRu<E extends Comparable<E>> implements Sorter<E> {
	
    private E[] data;

    // 构造函数，传入数组的容量capacity构造Array
    public ChaRu(E[] arr){
    	data = arr;
    }

	@Override
	public void sort() {
		int len = data.length;
		if(len==0)
			return;
		
		E[] sortList = (E[])new Object[len];
		int index;
		//1 遍历数组，依次找到待插入元素的位置index，然后在index位置插入元素操作
		for(int i=0;i<len;i++){
			E cur = data[i];
			for(int j=0;j<sortList.length;j++){
				if(sortList[j].compareTo(cur)<0){
					continue;
				}else{
					index = j;
					break;
				}
			}
		}
	}
//	function insertionSort(arr) {
//	    var len = arr.length;
//	    var preIndex, current;
//	    for (var i = 1; i < len; i++) {
//	        preIndex = i - 1;
//	        current = arr[i];
//	        while (preIndex >= 0 && arr[preIndex] > current) {
//	            arr[preIndex + 1] = arr[preIndex];
//	            preIndex--;
//	        }
//	        arr[preIndex + 1] = current;
//	    }
//	    return arr;
//	}

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
