package crazy2;

public class SplitSetsInTwo {

	public int sum(int input[], int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			int index;
			if (i > input.length - 1) {
				index = i % input.length;
			} else {
				index = i;
			}
			sum += input[index];
		}
		return sum;
	}

	public int modDiff(int a, int b) {
		if (a - b < 0) {
			return b - a;
		} else {
			return a - b;
		}
	}

	public int[][] split(int[] input) {
		int firstStart = 0;
		int firstEnd = input.length - 1;
		int secondStart = input.length - 1;
		int secondEnd = input.length;

		int diff = modDiff(sum(input, firstStart, firstEnd), sum(input, secondStart, secondEnd));

		for (int i = 0, firstPtr = firstStart, secondPtr = secondEnd; i < input.length
				- 2; i++, firstPtr++, secondPtr++) {
			int newDiff = modDiff(sum(input, firstPtr, firstEnd), sum(input, secondStart, secondPtr));
			if (newDiff < diff) {
				diff = newDiff;
				firstStart = firstPtr;
				secondEnd = secondPtr;
			}
		}

		int[] firstSet = new int[firstEnd - firstStart];
		for (int i = 0, j = firstStart; i < firstSet.length; i++, j++) {
			firstSet[i] = input[j];
		}
		int[] secondSet = new int[secondEnd - secondStart];
		for (int i = 0, j = secondStart; i < secondSet.length; i++, j++) {
			if (j > input.length - 1) {
				secondSet[i] = input[j % input.length];
			} else {
				secondSet[i] = input[j];
			}
		}

		int[][] result = { firstSet, secondSet };
		return result;
	}

}
