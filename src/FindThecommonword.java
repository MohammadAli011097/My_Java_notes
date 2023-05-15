
public class FindThecommonword {

	public void find(String name1, String name2) {

	String[]	sp1 = name1.split(" ");
	String[]    sp2 = name2.split(" ");
	
	for(String s1 : sp1) {
		
		for(String s2: sp2) {
			
		if(s1.contains(s2)) {
			
			System.out.println(s1);
		}
			
		}
		
	}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 = "My name is Mohammad";
		String name2 = "My name is Ali";
		FindThecommonword cl = new FindThecommonword();

		cl.find(name1, name2);
	}

}
