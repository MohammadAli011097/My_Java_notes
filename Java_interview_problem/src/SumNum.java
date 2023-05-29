
public class SumNum {

	public void sum(int num) {
		int rev=0;
		while(num!=0) {
			
			rev = rev + num%10;
			num = num/10;
		}
		System.out.println(rev);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num = 1234;	
	SumNum cl = new SumNum();
	
	cl.sum(num);
		
		
	}

}
