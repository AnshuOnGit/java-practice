package anshu.goes.crazy.on.patternmatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PatternMatch {

	private static Logger logger = LoggerFactory.getLogger(PatternMatch.class);

	public static int[] simplePatternMatch(String pat, String text) {
		List<Integer> out = new ArrayList<>();
		for (int i = 0; i < text.length() - pat.length() + 1; i++) {
			int patternCounter =0;
			for (int j =0; j < pat.length(); j++) {
				if (text.charAt(i + j) == pat.charAt(j)) {
					patternCounter ++;
				}
			}
			if (patternCounter == pat.length()) {
				out.add(i);
			}

		}
		int[] outArray = new int[out.size()];
		for (int i = 0; i < out.size(); i++) {
			outArray[i] = out.get(i);
		}
		return outArray;
	}

	public static int[] cleverPatternMatch(String pat, String text) {
		int[] repCount = getSymmetry(pat);
		List<Integer> out = new ArrayList<>();
		int patternCounter = 0, i = 0;
		while (i < text.length()) {

			if (text.charAt(i) == pat.charAt(patternCounter)) {
				patternCounter++;
			} else {
				while (patternCounter >= 0 && text.charAt(i) != pat.charAt(patternCounter)) {
					patternCounter--;
				}
				if (patternCounter >= 0)
					patternCounter = repCount[patternCounter] + 1;
				else
					patternCounter = 0;
			}
			if (patternCounter == pat.length()) {
				out.add(i - pat.length() + 1);
				patternCounter = repCount[patternCounter - 1];
			}

			i++;
		}
		int[] outArray = new int[out.size()];
		for (int j = 0; j < out.size(); j++) {
			outArray[j] = out.get(j);
		}
		logger.info(Arrays.toString(outArray));
		return outArray;
	}

	public static int[] getSymmetry(String pat) {
		int[] out = new int[pat.length()];
		for (int i = 0; i < pat.length(); i++) {
			if (i == 0) {
				out[i] = 0;
			} else {
				// 0 <= out[i] <= out[i-1] +1
				int count = out[i-1] +1;
				for(int j = i-2; pat.charAt(j) != pat.charAt(i) && j>=0; j--) {
					
				}
			}
		}
		logger.info(Arrays.toString(out));
		return out;
	}

	public static void main(String[] args) {
		int[] result = cleverPatternMatch("TEST", "THIS IS A TEST");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
