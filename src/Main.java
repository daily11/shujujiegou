import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

import com.swust.数组.Array;


public class Main {
	public static void main(String[] args){
		
		Array<Integer> array = new Array<>();
		for(int i=0;i<30;i++){
			array.add(i);
		}
		sop(array.toString());
 	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}	
