package com.suanfa.排序;

public class KuaiSu<E extends Comparable<E>> {

	private E[] data;

	// 构造函数，传入数组的容量capacity构造KuaiSu
	public KuaiSu(E[] arr) {
		data = arr;
	}

	public void sort() {
		sort(data, 0, data.length - 1);
	}

	public void sort(E[] d, int lf, int rg) {
		int lf_idx, rg_idx;
		E tmp;
		if (lf < rg) {
			lf_idx = lf + 1;
			rg_idx = rg;
			while (true) {
				// 从左到右找到第一个大于等于d[lf]的值
				for (int i = lf_idx; i <= rg; i++) {
					if (d[i].compareTo(d[lf]) >= 0) {
						lf_idx = i;
						break;
					}
					lf_idx++;
				}
				// 从右到左找到第一个小于等于d[lf]的值
				// 不可以写成j>=lf_idx,因lf_idx在上面for中已经变了
				for (int j = rg; j >= lf + 1; j--) {
					if (d[j].compareTo(d[lf]) <= 0) {
						rg_idx = j;
						break;
					}
					rg_idx--;
				}
				// 转换d[lf_idx]与d[rg_idx]的值
				if (lf_idx < rg_idx) {
					tmp = d[lf_idx];
					d[lf_idx] = d[rg_idx];
					d[rg_idx] = tmp;
				} else {
					break;// 结束while循环
				}
			}// end for while循环
			if (lf_idx >= rg_idx) {
				tmp = d[lf];
				d[lf] = d[rg_idx];
				d[rg_idx] = tmp;
				// 递归左侧快速排序
				sort(d, lf, rg_idx - 1);
				// 递归右侧快速排序
				sort(d, rg_idx + 1, rg);
			}
		}// end for if
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
