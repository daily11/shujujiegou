package com.suanfa.排序;

/**
 * 选择排序法
 *
 */
public class XuanZe<E extends Comparable<E>> implements Sorter<E> {

	private E[] data;

    // 构造函数，传入数组的容量capacity构造Array
    public XuanZe(E[] arr){
    	data = arr;
    }
	
	@Override
	public void sort() {
		int min,len = data.length;
		for(int i=0;i<len-1;i++){
			min = i;
			for(int j=i+1;j<len;j++){
				if(data[min].compareTo(data[j])>0)
					min = j;
			}
			E temp = data[i];
			data[i] = data[min];
			data[min] = temp;
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
