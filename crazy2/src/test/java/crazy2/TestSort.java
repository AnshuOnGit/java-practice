package crazy2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSort {

	@Test
	public void test() {
		QuickSort qs = new QuickSort();
		int[] input = {100, 2, 56, 78, 13,200};
		int[] sortedArray = {2, 13, 56, 78, 100, 200};
		assertArrayEquals(sortedArray, qs.shortByJdk(input));
	}

}
