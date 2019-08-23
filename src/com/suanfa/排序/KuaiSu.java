package com.suanfa.排序;

/**
 * 快速排序法
 * 思路：通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，则可分别对这两部分记录继续进行排序，以达到整个序列有序。
 */
public class KuaiSu<E extends Comparable<E>> implements Sorter<E> {

	private E[] data;

    // 构造函数，传入数组的容量capacity构造Array
    public KuaiSu(E[] arr){
    	data = (E[])new Object[arr.length];
        for(int i = 0 ; i < arr.length ; i ++)
            data[i] = arr[i];
    }

	@Override
	public void sort() {
		
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
}
