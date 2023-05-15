import java.util.ArrayList;
import java.util.List;

public class add {
	
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
	
				
		
		
		
		
				List<Integer> list = new ArrayList<>() ;
	        list.add(1);
		        list.add(2);
		        
	        list.add(3);    
	        list.add(4);
	        
	        list.add(5);
	        
	        int value;    
	        
for (int i = 0; i <list.size(); i++)	{		
	
 value = list.get(i);
	
	for (int j = i+1; j<list.size();j++) {
		
		
		int sum = value + list.get(j);
		if(sum == 7) {
			
			System.out.println(value+"" + list.get(j) );
			
		} 
		
	} 
	
	}

	}
}
