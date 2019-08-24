package com.suanfa.查找;

/**
 * 前置条件：
 * 	待查找的数据已经事先排序好
 * 思路：
 * 	将数据分割成两等份，再比较键值与中间值的大小，如果键值小于中间值，可确定要找的数据在前半段，否则在后半段。 
 * 	如此分割数次直到找到或确定不存在为止。
 */
public class ErFen<E extends Comparable<E>> {

	private E[] data;

	public ErFen(E[] arr) {
		data = arr;
	}

	public int search(E e) {
		int mid = -1, low = 0, high = data.length - 1;
		while (low <= high) { // 考虑data=边界，这种情况必须“等号”处理
			mid = (low + high) / 2;
			if (e.compareTo(data[mid]) > 0) {
				low = mid + 1;
			} else if (e.compareTo(data[mid]) < 0) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;// 这个很重要，代表没有查到值
	}

}
