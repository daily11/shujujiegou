import java.util.*;

import com.suanfa.排序.*;


public class Main {
	
	public static void main(String[] args){
		int[] arr = new int[]{3,4,2,6};
		KuaiSu<Integer> ks = new KuaiSu<Integer>(Util.intToInteger(arr));
		ks.sort();
		ks.print();
 	}
	
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}	



