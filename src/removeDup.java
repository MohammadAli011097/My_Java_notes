import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class removeDup {

	public void remove(String[] name) {
		
		Set<String> container = new HashSet<>();
		
		for(String index : name) {
			
			container.add(index);
			
		}
		
		System.out.println(container);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = {"david","david","ram","jam","kam","ram","kam","jam"};
	
		removeDup cl = new removeDup();
		
		cl.remove(name);
		
	}

}
