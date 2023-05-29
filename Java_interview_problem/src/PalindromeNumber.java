
public class PalindromeNumber {
	public void plNum(int num) {
		
		int num1=num;
		int rev =0;
		while(num!=0) {
			
		rev = rev*10 + num%10;	

		num = num/10;	
		
		}
	
if(num1==rev) {
			
			System.out.println("It's a PalindromeNumber");
			
		}else {
			
			System.out.println("It's a not PalindromeNumber");
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=16461;

PalindromeNumber cl= new PalindromeNumber(); 

cl.plNum(num);
		
		
	}

}
