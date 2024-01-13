public class MergeSort<T extends java.lang.Comparable<? super T>>
extends TestTimes implements SortInterface<T> {
    @Override
    public void sort(T[] arrayToSort) {
        // TODO Auto-generated method stub
        Object[] tempArray = new Object[arrayToSort.length];
        mergesort(arrayToSort, tempArray, 0, arrayToSort.length-1);
    }
    private void merge(T[] array, java.lang.Object[] tempArray, int first, int mid, int last) {
        int first1 = first;
		int very_frist = mid + 1;
		int i;
		int last1 = mid;
		int very_last = last;
        Object test = new Object();
        Object[] test2 = new Object[mid];
		int ind = first;
        //int comp = array[first1].compareTo(array[very_frist]);

		
		
		while ((first1 <= last1) && (very_frist <= very_last)) {
			if ((array[first1]).compareTo(array[very_frist]) < 0) {
				tempArray[ind++] = array[first1++];
                //int i;
			} 
            else {
				tempArray[ind++] = array[very_frist++];
			}
		}
		
		while (first1 <= last1) {
			tempArray[ind++] = array[first1++];
		}
		
		while (very_frist <= very_last) {
			tempArray[ind++] = array[very_frist++];
		}
		
		for (i = first; i <= last; ++i) {
			array[i] = (T) tempArray[i];
		}
        return;
        // for(int i = 0; i < arr.length; ++i) {
        //     System.out.print(arr[i] + " ");
        // }
    }
    private void mergesort(T[] array, java.lang.Object[] tempArray, int first, int last) {
        int mid = (first + last) / 2;
        int first1 = first;
        int very_frist = mid+1;
        int last1 = mid;
		int very_last = last;
        if (first < last) {
			mergesort(array, tempArray, first, mid);
			mergesort(array, tempArray, mid + 1, last);
			merge(array, tempArray, first, mid, last);
		}
        else{
            return;
        }
    }
    public static void main(String[] args) {
        MergeSort test = new MergeSort();

        Comparable[] arr = {10, 7, 8, 9, 1, 5};
        test.sort(arr);
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
