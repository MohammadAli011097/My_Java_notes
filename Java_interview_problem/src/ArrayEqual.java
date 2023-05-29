import java.util.Arrays;

public class ArrayEqual {

	public void check(int[] num1, int[] num2) {

//		boolean status = Arrays.equals(num1, num2);

		if (Arrays.equals(num1, num2)) {

			System.out.println("There are equal");

		} else {

			System.out.println("There are not  equal");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num1 = { 1, 3, 2,4, 6,7 , 5, 8 };
		int[] num2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		
		
		
		ArrayEqual cl = new ArrayEqual();

		cl.check(num1, num2);

	}

}
