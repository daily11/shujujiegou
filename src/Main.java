import java.util.TreeMap;


public class Main {
	public static void main(String[] args){
		
		TreeMap<String,String> map = new TreeMap<>();
		map.put("name", "chenyixing");
		map.remove("name");
		map.put("name", "zou");
		map.get("name");
		sop(map.toString());
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}	
