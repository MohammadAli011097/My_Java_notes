import java.util.HashMap;
import java.util.Map;

public class CountEveryCharInSentence {

	public void check(String name) {

		String[] spString = name.split(" ");
		System.out.println(spString);

		Map<Character, Integer> container = new HashMap<>();

		for (String s : spString) {

			char[] getchar = s.toCharArray();

			for (char index : getchar) {

				if (container.containsKey(index)) {
					container.put(index, container.get(index) + 1);

				} else {
					container.put(index, 1);
				}
			}

		}

		System.out.println(container);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "java is oop language";
		CountEveryCharInSentence cl = new CountEveryCharInSentence();

		cl.check(name);

	}

}
