import java.util.ArrayList;
import java.util.List;

public class LookForOddEveb {

	public void oddEven(int num) {

		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		
		int rev = 0;

		while (num != 0) {

			rev = num%10;
			if(rev%2==0) {
				
		odd.add(rev);	
				
			}else {
				
				even.add(rev);
				
			}
		       num=num/10;	
		}
System.out.println("Odd Number are = " + " " + odd + " " + " Even Number are = " + " " + even);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 145678;

		LookForOddEveb cl = new LookForOddEveb();

		cl.oddEven(num);

	}

}
