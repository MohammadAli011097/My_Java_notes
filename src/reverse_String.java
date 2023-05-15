
public class reverse_String {

	public void check(String name) {
		
		
	
	System.out.println(name.length());
	
	for(int i = name.length()-1;i>=0;i--) {
		
		System.out.println(name.charAt(i));
		
	}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="Welcome";
		
		reverse_String cl =new  reverse_String();
		
		cl.check(name);
		
	}

}
