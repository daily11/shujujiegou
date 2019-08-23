import java.util.*;

import com.suanfa.排序.MaoPao;
import com.suanfa.排序.Util;
import com.swust.二叉树.BST;
import com.swust.数组.Array;


public class Main {
	
	public static void main(String[] args){
		int[] arr = new int[]{3,4,2,6};
		MaoPao<Integer> mp = new MaoPao<>(Util.intToInteger(arr));
		mp.sort();
		mp.print();
 	}
	
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}	



