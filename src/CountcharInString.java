
public class CountcharInString {

public void nam(String name) {	
	
	String[] cut = name.split(" ");
	int count =0;
	
	for(String s: cut) {
		
	for(int i=0; i <s.length();i++) {	
              count++;		
		
	}
		
	}
	
	System.out.println(count);
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "I love you tash";
		
		CountcharInString cl = new CountcharInString();
		cl.nam(name);
		
	}

}
