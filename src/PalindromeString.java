
public class PalindromeString {

	public void plName(String name) {

		String OldName = name;
		String NewName ="";
		for (int i = name.length() - 1; i >= 0; i--) {

			NewName = NewName + name.charAt(i);

		}

		System.out.println(OldName + "= " + NewName);
		
		
		if (OldName.contains(NewName)) {

			System.out.println("It's a PalindromeStringr");

		} else {

			System.out.println("It's a not PalindromeString");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "MADAM";

		PalindromeString cl = new PalindromeString();
		cl.plName(name);

	}

}
