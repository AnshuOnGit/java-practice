package anshu.goes.crazy.on.patternmatch;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Ignore;
import org.junit.Test;

public class PatternMatchTest {
	
	@Test
	public void randomTestForsimplePatternMatch() {
		int[] patMatchResult = PatternMatch.simplePatternMatch("aabaa", "aabaabbbaabaaaaaabaabaaaaa");
		int[] expResult = {0,8,15,18};
		assertArrayEquals(expResult, patMatchResult);
	}
	
	
	@Test
	public void randomTestForsimplePatternMatch1() {
		int[] patMatchResult = PatternMatch.simplePatternMatch("aabaa", "aabaabaa");
		int[] expResult = {0,3};
		assertArrayEquals(expResult, patMatchResult);
	}
	
	@Test
	public void randomTestForsimplePatternMatch2() {
		int[] patMatchResult = PatternMatch.simplePatternMatch("aabaa", "aabbaabaa");
		int[] expResult = {4};
		assertArrayEquals(expResult, patMatchResult);
	}
	
	@Test
	public void randomTestForsimplePatternMatch3() {
		int[] patMatchResult = PatternMatch.simplePatternMatch("aabaa", "aabaabaaabbaaabaa");
		int[] expResult = {0,3,12};
		assertArrayEquals(expResult, patMatchResult);
	}
	
	@Test
	public void randomTestForsimplePatternMatch4() {
		int[] patMatchResult = PatternMatch.simplePatternMatch("ab", "abbbbaab");
		int[] expResult = {0,6};
		assertArrayEquals(expResult, patMatchResult);
	}
	
	@Test
	public void randomTestForsimplePatternMatch5() {
		int[] patMatchResult = PatternMatch.simplePatternMatch("a", "abbbbaab");
		int[] expResult = {0,5,6};
		assertArrayEquals(expResult, patMatchResult);
	}
	
	@Test
	public void randomTestForsimplePatternMatch6() {
		int[] patMatchResult = PatternMatch.simplePatternMatch("abab", "abbbbaabaaavbbbaaabaaabaaaaba");
		int[] expResult = new int[0];
		assertArrayEquals(expResult, patMatchResult);
	}
	
	@Test
	public void symmetryTest() {
		int[] result = PatternMatch.getSymmetry("abab");
		int[] exp = {0,0,1,2};
		assertArrayEquals(exp, result);
		
	}

}
