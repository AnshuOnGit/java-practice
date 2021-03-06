package anshu.goes.crazy.on.sorting;

public class Quicksorter implements Sorter {

	public static void quickSort(int[] input, int first, int last) {
		if (first < last - 1) {
			int start = first;
			int end = last - 1;
			int pivotIndex = (first + end) / 2;
			int pivot = input[pivotIndex];
			while (start < end) {
				if (input[start] > pivot && input[end] <= pivot) {
					swap(input, start, end);
				}
				while (start < last && input[start] <= pivot) {
					start++;
				}
				while (end >= first && (input[end] >= pivot)) {
					end--;
				}
			}
			if (start > pivotIndex) {
				swap(input, start - 1, pivotIndex);
				quickSort(input, first, start - 1);
				quickSort(input, start, last);
			} else {
				swap(input, start, pivotIndex);
				quickSort(input, first, start);
				quickSort(input, start + 1, last);
			}
		}
	}

	public static void swap(int[] input, int i, int j) {
	    assert(0 <= i && j < input.length);
		if (i != j) {
			int temp = input[i];
			input[i] = input[j];
			input[j] = temp;
		}
	}

	public static void main(String[] args) {
		int[] toTest = { 2, 1, -1000, 0, -100, -100 ,0};
		quickSort(toTest, 0, 7);
		for (int elem : toTest) {
			System.out.println(elem);
		}
	}

	@Override
	public void sort(int[] data) {
		quickSort(data, 0, data.length);
	}

}
