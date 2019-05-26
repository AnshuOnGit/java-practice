package crazy2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestSplitSetsInTwo {

	/*
	 * @Test public void test() { SplitSetsInTwo obj = new SplitSetsInTwo(); int[]
	 * input = {1,3,7,8,12}; int[][] result = obj.split(input);
	 * Arrays.stream(result[0]).forEach(elem -> System.out.println(elem));
	 * System.out.println("------------------");
	 * Arrays.stream(result[1]).forEach(elem -> System.out.println(elem)); }
	 */
   
	@Test
	public void test1() {
		SplitSetsInTwo obj = new SplitSetsInTwo();
		int[] input = {1,5,6,11};
		int[][] result = obj.split(input);
		Arrays.stream(result[0]).forEach(elem -> System.out.println(elem));
		System.out.println("------------------");
		Arrays.stream(result[1]).forEach(elem -> System.out.println(elem));
	}
}
