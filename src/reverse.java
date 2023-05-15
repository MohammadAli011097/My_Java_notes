import java.util.Arrays;

public class reverse {
	
	public void Ali(String name) {
		
		
	String[] spString = name.split(" ");
	String rev = "";
		
	
		
	
		for(int i = spString.length-1; i>=0;i--) {
			
			rev = rev+spString[i] + " ";  
		    
			
		}
		System.out.println(rev);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "My name is Ali";
		
		reverse cl = new reverse();
		cl.Ali(name);
		
		
	}

}
