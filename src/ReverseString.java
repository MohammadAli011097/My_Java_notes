
public class ReverseString {

	public void RevName(String Name) {
		
	
		
		for(int i=Name.length()-1;i>=0;i--) {
	System.out.print(	Name.charAt(i));
			
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Name="Google";
ReverseString cl = new ReverseString();

cl.RevName(Name);

		
		
	}

}
