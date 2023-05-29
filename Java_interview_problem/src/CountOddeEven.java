
public class CountOddeEven {

	public void count(int num) {

		int even = 0;
		int odd = 0;

		while (num != 0) {

			int take = num % 10;
			if (take % 2 == 0) {

				odd++;

			} else {

				even++;
			}
			num = num/10;
		}
		

	System.out.print(even +" " + odd );	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123456789;

		CountOddeEven cl = new CountOddeEven();

		cl.count(num);

	}

}
