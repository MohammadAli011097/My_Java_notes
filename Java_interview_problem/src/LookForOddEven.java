import java.awt.Event;
import java.util.ArrayList;
import java.util.List;

public class LookForOddEven {
	public void find(int num) {
		
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
	int  holder = 0;
		
	while(num!=0) {	
		holder = num%10;
		num = num/10;
		
		
		if(holder%2 ==0) {
			odd.add(holder);
			
		}else {
			
			even.add(holder);
		}
	}
		
		System.out.println(odd + " "+ even);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345678;
		
		 LookForOddEven cl = new  LookForOddEven();
		 
		 cl.find(num);
		
	}

}
