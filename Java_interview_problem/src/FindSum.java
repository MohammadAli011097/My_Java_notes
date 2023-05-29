import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class FindSum {
	public void sum(int[] num) {

	List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		   
		
		int ln = num.length;
		
		
		for (int i = 0; i < ln; i++) {
			
				
           if((num[i] % 2 == 0)) {
        	 odd.add(num[i]);
           }else {
        	   even.add(num[i]);
           }
		}
System.out.println(Collections.max(even));
		


	}
	


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8 };
		FindSum cl = new FindSum();
 
		cl.sum(num);

	}

}
