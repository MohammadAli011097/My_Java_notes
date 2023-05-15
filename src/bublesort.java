import java.util.Arrays;

public class bublesort {

	public void Bsort(int[] num) {

		int s = num.length;

		for (int i = 0; i <s-1; i++) {

			for (int j = 0; j <s-1 ; j++) {

				if (num[j] > num[j + 1]) {

					int tump = num[j];

					num[j] = num[j + 1];
					num[j + 1] = tump;

				}

			}

		}
		for(int arr:num) {
			System.out.println(arr);
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 1, 2, 3, 6, 5, 4, 7, 8 };

		bublesort cl = new bublesort();

		cl.Bsort(num);

	}

}
