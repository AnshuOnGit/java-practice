import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumProfitInShares {
	public int maxProfit(final List<Integer> A) {
		if (A == null || A.size() == 0) {
			return 0;
		}
		int buyDay = 0;
		int sellDay = A.size() - 1;
		int buyPrice = A.get(0);
		int sellPrice = A.get(A.size() - 1);
		for (int i = 0, j = A.size() - 1; i < A.size() && j >= 0  && j > i; i++, j--) {
			System.out.println("i = " + i+ ", j= "+j);
			if (A.get(i) < buyPrice) {
				buyDay = i;
				buyPrice = A.get(i);
			}
			if (A.get(j) > sellPrice) {
				sellDay = j;
				sellPrice = A.get(j);
			}
			 
		}
		if (sellPrice > buyPrice) {
			System.out.println("sellDay =" +sellDay);
			System.out.println("buyDay =" + buyDay);
			return sellPrice - buyPrice;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {

		MaximumProfitInShares mp = new MaximumProfitInShares();
		
		System.out.println(mp.maxProfit(Arrays.asList(12, 1, 4, 8, 100, 9 , 45, 16, 7, 58)));
	}
}
