import java.util.ArrayList;
import java.util.List;

public class CheckSum {

	public void sum(List<Integer> num) {

		
		int add = 0;
		for (int i = 0; i < num.size(); i++) {

			int valu1 = num.get(i);

			for (int j = i + 1; j < num.size(); j++) {

				add = valu1 + num.get(j);
 
				if (add == 7) {

			System.out.println( valu1 + " + " + num.get(j) + " " + "=" +" 7");		
					
					
					
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num = new ArrayList<>();

		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		CheckSum cl = new CheckSum();

		cl.sum(num);

	}

}
