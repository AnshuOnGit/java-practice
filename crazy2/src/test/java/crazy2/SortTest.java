package crazy2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import anshu.goes.crazy.on.sorting.MergeSorter;
import anshu.goes.crazy.on.sorting.Operator;
import anshu.goes.crazy.on.sorting.Quicksorter;

public class SortTest {
	
	private Operator operator;
    
	@Before
	public void setUp() {
		operator = new Operator(new MergeSorter());
	}
	@Test
	public void testMinimumWithPositiveInput() {
		int[] input = {1};
		operator.sort(input);
		int[] expected = {1};
		assertArrayEquals(expected, input);
	}
	
	@Test
	public void testMinimumWithZeroInput() {
		int[] input = {0};
		operator.sort(input);
		int[] expected = {0};
		assertArrayEquals(expected, input);
	}
	
	@Test
	public void testMinimumWithNegativeInput() {
		int[] input = {-1};
		operator.sort(input);
		int[] expected = {-1};
		assertArrayEquals(expected, input);
	}
	
	@Test
	public void testSortedInput() {
		int[] input = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
		operator.sort(input);
		int[] expected = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
		assertArrayEquals(expected, input);
	}
	
	@Test
	public void testReverseSortedInput() {
		int[] input = {27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
		operator.sort(input);
		int[] expected = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
		assertArrayEquals(expected, input);
	}
	
	@Test
	public void testRandomInput() {
		int[] input = {10, -100, 19, 1, -1, 41, 8, 59, 45, 89};
		operator.sort(input);
		int[] expected = {-100, -1, 1, 8, 10, 19, 41, 45, 59, 89};
		assertArrayEquals(expected, input);
	}
	
	@Test
	public void testRepeatedInput() {
		int[] input = {12, 11, 10, 67, 34, 12 , 81, 67, 32, 24, 10};
		operator.sort(input);
		int[] expected = {10,10,11,12,12,24,32,34,67,67,81};
		assertArrayEquals(expected, input);
	}
	
	@Test
	public void testAllNegativeInput() {
		int[] input = {-12, -11, -10, -67, -34, -12 , -81, -67, -32, -24, -10};
		operator.sort(input);
		int[] expected = {-81,-67,-67,-34,-32,-24,-12,-12,-11,-10,-10};
		assertArrayEquals(expected, input);
	}

}
