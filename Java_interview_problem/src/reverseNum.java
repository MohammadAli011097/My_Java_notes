
public class reverseNum {

	public void check(int num ) {
		
		int rev =0;
		while(num!=0) {
			
		rev = rev*10 + num%10;	
		num = num/10;
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345678;
		
		reverseNum cl = new reverseNum();
		
		cl.check(num);
		
	}

}
