import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dupname {

	public void duplicate(String[] name) {

		Map<String, Integer> nam = new HashMap<>();

		for (String index : name) {

			if (nam.containsKey(index)) {

				nam.put(index, nam.get(index) + 1);

			} else {

				nam.put(index, 1);

			}

		}

		Set<String> fi = nam.keySet();

		for (String key : fi) {

			if (nam.get(key) >= 1) {

				System.out.println(key + "=" + nam.get(key));

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = { "java", "C#", "java", "java", "C#", "python", "ruby", "ruby" };

		Dupname cl = new Dupname();




		cl.duplicate(name);

	}

}
