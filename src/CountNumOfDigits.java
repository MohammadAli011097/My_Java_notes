
public class CountNumOfDigits {

public void digits(int num ) {	
	int count = 0;
	
while(num!=0) {	
	num = num/10;
	count++;
	
}
	
	System.out.println(count);
	
	
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 1456789;

CountNumOfDigits cl = new CountNumOfDigits();

cl.digits(num);
		
		
	}

}
