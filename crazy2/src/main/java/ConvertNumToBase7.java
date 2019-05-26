import java.util.ArrayList;
import java.util.List;

public class ConvertNumToBase7 {

	public static List<Integer> convert(int n) {
		List<Integer> outList = new ArrayList<>();
		int quo = n;
		while (quo != 0) {
			int remainder = quo % 7;
			outList.add(remainder);
			quo = quo/7;
		}
		return outList;
	}

	public static void main(String[] args) {
		List<Integer> result = convert(17);
		result.forEach(x -> System.out.println(x));
	}
}
