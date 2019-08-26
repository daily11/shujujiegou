import java.util.*;

import com.suanfa.排序.*;


public class Main {
	static int[] data = new int[]{3,4,2,6};
	
	public static void main(String[] args){
		
 	}
	
	public static int query(int value){

		return -1;
	}
	
	public static void sort(){
		
	}
	
	private static void swap(int i, int j) {
		int temp = data[j];
		data[j] = data[i];
		data[i] = temp;
	}
	
	private static void print(){
		for(int i=0;i<data.length;i++){
			if(i!=data.length-1){
				System.out.print(data[i]+",");
			}else{
				System.out.print(data[i]);
			}
		}
	}

	public static void sop(Object obj){
		System.out.println(obj);
	}
}	



