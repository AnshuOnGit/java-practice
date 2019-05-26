package anshu.goes.crazy.on.sorting;

public class MergeSorter implements Sorter {
	
	public static int[] mergeSort(int[] data) {
		if(data.length > 1) {
			int first = 0;
			int last = data.length;
			int mid = (first + last)/2;
			int[] firstArray = new int[mid -first];
			int[] secArray = new int[last - mid];
			for(int i = first, count=0; i<mid; i++, count++) {firstArray[count] = data[i];}
			for(int j = mid, count=0; j<last; j++, count++) {secArray[count] = data[j];}
			return merge(mergeSort(firstArray), mergeSort(secArray));
		}else {
			return data;
		}
		
	}
	
	public static int[] merge(int[] data1, int[] data2) {
		int i =0, j = 0, count =0;
		int[] out = new int[data1.length + data2.length];
		while(i < data1.length && j < data2.length && count < data1.length + data2.length) {
			if(data1[i] <= data2[j]) {
				out[count] = data1[i];
				i++;
			}else {
				out[count] = data2[j];
				j++;
			}
			count++;
		}
		
		if(i < data1.length) {
			while(i < data1.length) {
				out[count] = data1[i];
				i++;count++;
			}
		}else if(j < data2.length) {
			while(j < data2.length) {
				out[count] = data2[j];
				j++;count++;
			}
		}
		return out;
	}

	@Override
	public void sort(int[] data) {
		int [] result = mergeSort(data);
		for(int i =0; i< data.length; i++) {data[i] = result[i];}
	}
	
	public static void main(String[] args) {
		int[] data1 = {1,12,32};
		int[] data2= {10, -100, 19, 1, -1, 41, 8, 59, 45, 89};
		int[] result = mergeSort(data2);
		for(int elem : result) {
			System.out.println(elem);
		}
	}

}
