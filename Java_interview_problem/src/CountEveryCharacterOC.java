import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountEveryCharacterOC {

	public void getcout(String name) {
		
	String[] sp = name.split(" ");	
	char[] charArray = null;
	Map<Character, Integer> countMap = new HashMap<>();
	
		for(String s: sp) {
			
			 charArray = s.toCharArray();
			
			for(char Index: charArray) {
			if(countMap.containsKey(Index)) {	
				
			countMap.put(Index , countMap.get(Index) + 1);	
				
			}else {
				
				countMap.put(Index , 1);
				
			}
				
			}
			
			
		}
		
		Set<Character> coutSet = countMap.keySet();
		
		
		for(char a:coutSet) {
			
			System.out.println(a + "=" + countMap.get(a));
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "java is a oop language";
		
		CountEveryCharacterOC cl = new CountEveryCharacterOC();
		
		cl.getcout(name);
		
		
	}

}
