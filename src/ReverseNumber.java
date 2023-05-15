
public class ReverseNumber {

	public void rev(int num ) {
		int RevNum = 0; 
		
	while(num!=0) {	
		
RevNum =RevNum*10 + num%10;		

num = num/10;
	}
	
		System.out.println(RevNum);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123456;
		ReverseNumber cl = new ReverseNumber();
		
		cl.rev(num);
		
		
	}

}
