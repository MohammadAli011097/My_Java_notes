
public class CountOddEven {

	public void OddEven(int num) {
		int odd = 0;
		int even = 0;
        int rev=0;
		while (num != 0) {

			rev =num%10;
			
			if (rev % 2 == 0) {
				even++;

			} else {

				odd++;

			}
			num=num/10;
			
		}
		System.out.println("EvenNumber =" + even +" "+ "OddNumber =" + odd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 145678;
		CountOddEven cl = new CountOddEven();

		cl.OddEven(num);

	}

}
