
public class sunNumber {

	public void add(int num) {
		int sum = 0;
		while(num!=0) {
		sum = sum + num%10;	
			num = num/10;
		}
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123456;

		sunNumber cl = new sunNumber();
		
		cl.add(num);
	}

}
