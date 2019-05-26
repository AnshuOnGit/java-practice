import java.util.HashMap;
import java.util.Map;

public class StringSplit {

	public Map<Character, Integer> frequencyCount(String s) {
		HashMap<Character, Integer> output = new HashMap<>();
		for (Character c : s.toCharArray()) {
			if (output.containsKey(c)) {
				Integer oldCount = output.get(c);
				output.put(c, oldCount + 1);
			} else {
				output.put(c, 1);
			}
		}
		return output;
	}

	public boolean matches(Map<Character, Integer> input1, Map<Character, Integer> input2, int k) {
		if(input1.keySet().size() < k || input2.keySet().size() < k) {
			return false;
		}
		int count = 0;
		for (Character c : input1.keySet()) {
			if (input2.containsKey(c) && input1.get(c) == input2.get(c)) {
				count++;
			}
		}
		return count >= k;
	}

	public int splitCount(String s, int k) {
		int count = 0, sepPos = 1;
		while (sepPos <= s.length()) {
			String pre = s.substring(0, sepPos);
			String post = s.substring(sepPos, s.length());
			if (matches(frequencyCount(pre), frequencyCount(post), k)) {
				count++;
			}
			sepPos++;
		}
		return count;
	}

	public static void main(String[] args) {
		    StringSplit ss = new StringSplit();
            System.out.println(ss.splitCount("aabbccaa", 2));
	}

}
