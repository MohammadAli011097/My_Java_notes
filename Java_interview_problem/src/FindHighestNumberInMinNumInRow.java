
public class FindHighestNumberInMinNumInRow {

	public void number(int abc[][]) {

		int min = abc[0][0];
		int Ln = abc.length;
        int col=0;
        int max = abc[0][col];
		for (int i = 0; i < Ln; i++) {

			for (int j = 0; j < Ln; j++) {

				if (abc[i][j]<min) {

					min = abc[i][j];
                   col = j;
                  
				}

			}

		}
		int k = 0;
while(k<3) {
	
	if(abc[k][col]>max) {
		
		max = abc[k][col];
		
	}
	k++;
	
}
		//System.out.println(col);
		System.out.println(max);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][] = { { 2, 4, 5 }, { 3, 4, 7 }, { 1, 2, 9 } };

		FindHighestNumberInMinNumInRow cl = new FindHighestNumberInMinNumInRow();

		cl.number(abc);

	}

}
