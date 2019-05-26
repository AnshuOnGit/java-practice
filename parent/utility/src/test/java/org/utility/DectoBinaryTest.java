package org.utility;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import com.anshu.practices.patterns.utils.DectoBinary;

import junit.framework.TestCase;

public class DectoBinaryTest extends TestCase {
	
	@Test
	public void testBinaryNumGeneration() {
		int[] binaryNum = DectoBinary.getBinary(12);
		int[] expectedBinaryNum = {1,1,0,0};
		assertArrayEquals(expectedBinaryNum, binaryNum);
	}

}
