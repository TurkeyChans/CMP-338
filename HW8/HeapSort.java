public class HeapSort<T extends java.lang.Comparable<? super T>>
extends TestTimes
implements SortInterface<T>{
    private T[] heap;
    private int heapSize;

    public int getHeapSize() {
        return heapSize;
    }
    public void setHeapSize(int heapSize) {
        this.heapSize = heapSize;
    }

    
    public void sort(T[] arrayToSort) {
        heapSort(arrayToSort);
    }

    private void heapSort(T[] arrayToSort) {
        heap = arrayToSort;
        heapSize = arrayToSort.length;
        int math = (heapSize / 2) - 1;
        int math2 = heapSize - 1;
        int i;
        for (i = math; i >= 0; --i) {
            siftDown(i);
        }

        for (i = math2; i > 0; --i) {
            swap(heap, 0, i);
            heapSize--;
            siftDown(0);
        }
    }

   

    private void siftDown(int node) {
        int leftly = (2 * node) + 1;
        int rightly = (2 * node) + 2;
        int big = node;
        //for(int i = 0; i < node; ++i)
        if (leftly < heapSize ) {
            if(heap[leftly].compareTo(heap[big]) > 0) {
                big = leftly;
        //         for(int i = 0; i < heap.length; ++i) {
        //     System.out.print(heap[i] + " ");
        // }
            }
        }

        if (rightly < heapSize) {
            if(heap[rightly].compareTo(heap[big]) > 0) {
                big = rightly;
        //         for(int i = 0; i < heap.length; ++i) {
        //     System.out.print(heap[i] + " ");
        // }
            }
        }



        if (big != node) {
            swap(heap, node, big);
            siftDown(big);
        }
        else{
            return;
        }
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{7,13,650,5723,312,48,94422,3,20,525,545,38};
        HeapSort<Integer> hs = new HeapSort<>();
        hs.sort(arr);
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        
                

    }


}
