import java.util.*;

import com.suanfa.排序.MaoPao;
import com.swust.二叉树.BST;
import com.swust.数组.Array;


public class Main {

	public static void main(String[] args) {
		Integer[] data = new Integer[]{6,4,9,8,3};
		MaoPao<Integer> maoPao = new MaoPao<>(data);
		maoPao.sort();
		maoPao.print();
	}
	
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}	



