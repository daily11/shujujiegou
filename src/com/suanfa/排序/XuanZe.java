package com.suanfa.排序;

/**
 * 选择排序法
 *
 */
public class XuanZe<E extends Comparable<E>>{

	private E[] data;

    // 构造函数，传入数组的容量capacity构造Array
    public XuanZe(E[] arr){
    	data = arr;
    }
	
	public void sort() {
		int min,len = data.length;
		//1 进行n-1轮排序
		for(int i=0;i<len-1;i++){
			//2 每一轮排序，找出最小元素的下标min
			min = i;
			for(int j=i+1;j<len;j++){
				if(data[min].compareTo(data[j])>0)
					min = j;
			}
			//3 每一轮结束，将最小元素与头元素data[i]进行交换
			E temp = data[i];
			data[i] = data[min];
			data[min] = temp;
		}
	}

	public void print() {
		int len = data.length;
		for (int i = 0; i < len; i++) {
			if (i != len - 1)
				System.out.print(data[i] + ",");
			else
				System.out.print(data[i]);
		}
	}

}
