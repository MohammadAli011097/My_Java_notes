
public class CountCharacterOccurance {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Java Programming Java oops";
		
		int old =  str.length();
	  	
	int n=	str.replaceAll("o", "").length();
		
	int count = old - n;
	
	System.out.println(count);
	}

}
