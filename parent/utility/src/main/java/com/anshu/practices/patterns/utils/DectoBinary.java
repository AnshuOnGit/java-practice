package com.anshu.practices.patterns.utils;

public class DectoBinary {

	public static int[] getBinary(int num) {
		int[] binaryNum = new int[getBinaryNumLength(num)];
		int quotient = num;
		for (int i = binaryNum.length -1; i >= 0; i--) {
			binaryNum[i] = quotient % 2;
			quotient = quotient / 2;
		}
		return binaryNum;
	}
	
	public static boolean isExactPowerofTwo(int num) {
		double x = Math.log(num +1)/Math.log(2); 
		return x - (int)x == 0;
	}

	public static int getBinaryNumLength(int num) {
		if (num == 0) {
			return 1;
		} else if(isExactPowerofTwo(num)) {
			int length = (int) (Math.log(num + 1) / Math.log(2));
			return length;
		} else {
			int length = (int) (Math.log(num + 1) / Math.log(2));
			return length + 1;
		}
	}

	public static void main(String[] args) {
		int[] binaryNum = DectoBinary.getBinary(2);
		for (int i = 0; i < binaryNum.length; i++) {
			System.out.print(binaryNum[i]);
		}
		
	}

}
