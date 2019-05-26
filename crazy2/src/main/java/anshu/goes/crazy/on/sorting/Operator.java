package anshu.goes.crazy.on.sorting;

public class Operator {
	
	private Sorter sorter;

	public Operator(Sorter sorter) {
		this.sorter = sorter;
	}
	
	public void sort(int[] data) {
		sorter.sort(data);
	}

}
