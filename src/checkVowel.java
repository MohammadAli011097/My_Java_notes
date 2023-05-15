
public class checkVowel {

	public void check(String name) {
		
		char[] sp = name.toCharArray();
		
		
		
		for (char s: sp) {
			 if(s == 'a'|| s == 'e'|| 
			          s == 'i' || s == 'o' || 
			          s == 'u') {
				 
				 
				 System.out.print(s);
				 
			 }
			
			
		}
		
		

		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String name = "welcomea";	
	
	checkVowel cl = new checkVowel();
	
	cl.check(name);
		
		
	}

}
