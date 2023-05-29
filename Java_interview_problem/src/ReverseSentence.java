
public class ReverseSentence {

	public void sentence(String sent) {
	String rev = "";	
	
	String revString = "";
	String[] cut = sent.split(" ");
	
		for(String s : cut) {
			
		String revword="";	
		for(int i=s.length()-1;i>=0;i--) {
			
			revword =revword+ s.charAt(i);
			
		}
		revString = revString + revword + " ";
		
		}
		
		System.out.println(revString);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String sent = "Welcome to world of java";
	
	ReverseSentence  cl= new ReverseSentence();
	
	cl.sentence(sent);
		
	}

	
	
	
	
}
