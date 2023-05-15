import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class dupchar {
	
	public void nam(String name ) {
		
	char[] namchar=name.toCharArray(); 	
	Map<Character,Integer> map = new HashMap<>();
	
		for(Character index : namchar) {
			
			if(map.containsKey(index)) {
				
				map.put(index, map.get(index)+ 1);
				
			}else {
				
				map.put(index, 1);
				
			}
			
		}
		Set<Character> setnam = map.keySet();
		for(Character index2 : setnam) {
			
		if(map.get(index2)>=1) {	
			
			System.out.println( index2+"="+ map.get(index2));
			
		}
			
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "bmcc";

dupchar cl = new dupchar();	

cl.nam(name);
		
	}

}
