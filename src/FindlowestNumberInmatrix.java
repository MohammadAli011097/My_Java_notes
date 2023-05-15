
public class FindlowestNumberInmatrix {

	public void Lownumber(int abc[][]) {

		int min = abc[0][0];
		int ln = abc.length;

		for (int i = 0; i < ln; i++) {

			for (int j = 0; j < ln; j++) {

				if (abc[i][j] < min) {

					min = abc[i][j];

				}

			}

		}

		System.out.println(min);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 3, 2, 9 } };
		FindlowestNumberInmatrix cl = new FindlowestNumberInmatrix();

		cl.Lownumber(abc);

	}

}
