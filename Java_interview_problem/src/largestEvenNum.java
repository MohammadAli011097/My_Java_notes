import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class largestEvenNum {

	public void find(int[] num) {

		
		List<Integer> even = new ArrayList<>();
		
for(int i =0;i<num.length;i++) {		
	
   if(num[i]%2 !=0) {
	   even.add(num[i]);
	   
   }
}
		System.out.println(Collections.max(even));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		largestEvenNum cl = new largestEvenNum();

		cl.find(num);
	}

}
