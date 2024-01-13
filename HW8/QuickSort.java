//import java.util.Arrays;
import java.util.Random;

public class QuickSort<T extends java.lang.Comparable<? super T>> extends TestTimes implements SortInterface<T>{

    public enum PivotType {
        FirstElement,
        RandomElement,
        MidOfFirstMidLastElement
    }

    private PivotType pivotType;
    
    public PivotType getPivotType() {
        return pivotType;
    }
    public void setPivotType(PivotType pivotType) {
        this.pivotType = pivotType;
    }
    @Override
    public void sort(T[] arrayToSort) {
        QuickSort test = new QuickSort();
        quicksort(arrayToSort, 0, arrayToSort.length-1);
    }
    public void choosePivot(T[] array, int first, int last) {
        int math = first + last;
		int mid =  math / 2;
		T temp = array[first];
		T fronts = array[first];
		T mmm = array[mid];
		T backs = array[last];
		
		if(pivotType == PivotType.MidOfFirstMidLastElement) {
			if((fronts.compareTo(mmm) <= 0) && (backs.compareTo(mmm) >= 0)) {
			
			array[first] = array[mid];
			array[mid] = temp;
			
			}
            else if ((fronts.compareTo(mmm) >= 0) && (backs.compareTo(mmm) <= 0)) {
                array[first] = array[mid];
			    array[mid] = temp;
            }
            else if((fronts.compareTo(backs) <= 0) && (mmm.compareTo(backs) >= 0)) {
		
			array[first] = array[last];
			array[last] = temp;
			
            }
            else if(((fronts.compareTo(backs) >= 0) && (mmm.compareTo(backs) <= 0))) {
                array[first] = array[last];
                array[last] = temp;
            }
        // for(int i = 0; i < array.length; ++i) {
        //     System.out.print(" " + array[i]);
        // }
		}
            else if(pivotType == PivotType.RandomElement) {
				Random random = new Random();
				int ran = first + random.nextInt(last - first);
				array[first] = array[ran];
				array[ran] = temp;
            }
	    }

    private void quicksort(T[] array, int first, int end) {
        if(end <= first) {
            return;
        }
        int p = partition(array, first, end);
        int i;
        quicksort(array, first, p - 1);
        quicksort(array, p + 1 , end);
        //for(i = 0; i < array.length; ++i) {
           // System.out.print(array[i] + " ");
        ///}
        //System.out.println();

    }
    private int partition(T[] array, int first, int end) {
        T find = array[end];
        int i = first - 1;
        for (int j = first ; j <= end ; ++j) {
            if(array[j].compareTo(find) < 0) {
                i++;
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        T temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
    public static void main(String[] args) {
        //QuickSort test = new QuickSort();
        Comparable[] arrayss = {4,472,342,5,32,536,3674,5,523,5963,25,23,5,325,34,32523,6};
        //test.quicksort(arrayss,0,arrayss.length-1);
        //test.sort(arrayss);
        QuickSort test = new QuickSort<>();
        test.setPivotType(QuickSort.PivotType.MidOfFirstMidLastElement);
        test.choosePivot(arrayss,0,arrayss.length-1);
       

    }
   
}
