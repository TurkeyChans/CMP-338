import java.util.Arrays;
import java.util.Random;


public class SortDriverGeneric implements SortDriverInterfaceGeneric{
    private String[] ss = {"Equal ", "Random ", "Increasing ", "IncreasingAndRandom ", "Decreasing "};
    public enum TimeUnits {
        MILLISECONDS,
        MICROSECONDS,
        NANOSECONDS

    }
    public static void main(String[] args) {
        SortType[] w = {SortType.MergeSort, SortType.QuickSortFirstElement,SortType.QuickSortRandomElement, SortType.QuickSortMidOfFirstMidLastElement, SortType.HeapSort};
        ArrayType[] a = {ArrayType.Equal,ArrayType.Random,ArrayType.Increasing,ArrayType.IncreasingAndRandom,ArrayType.Decreasing};
        SortDriverGeneric test = new SortDriverGeneric();
     
    
        
        
       

        //Object[] ns = new Object[10];
        
        int i,j;
        for(j = 0; j <= 4; ++j) {
            int k = 1000;
            int l = 10;
            
            test.prints(j, "1000");
            for(i = 0; i <= 4; ++i ) {
            
            if(i == 0) {
                 System.out.print("                     MergSort ");
                
                test.runtime(w[i], a[j], k, l);
                System.out.print("");
            }
            else if(i == 1) {
                System.out.print("       QuickSort FirstElement ");
                test.runtime(w[i], a[j], k, l);
               
            }
            else if(i == 2) {
                System.out.print("      QuickSort RandomElement ");
                
                test.runtime(w[i], a[j], k, l);
                
            }
            else if(i == 3) {
                System.out.print("QuickSort MidFirstLastElement ");
                
                test.runtime(w[i], a[j], k, l);
     
            }
            else {
                
                System.out.print("                     HeapSort ");
                test.runtime(w[i], a[j], k, l);
            }
            
        }
        System.out.println();
        test.prints2();
        System.out.println();
        for(i = 0; i <= 4; ++i ) {
            
            if(i == 0) {
                
                System.out.print("                     HeapSort ");
                test.runkilo(w[i], a[j], k, l);
                System.out.print("");
            }
            else if(i == 1) {
                System.out.print("                     MergSort ");
                test.runkilo(w[i], a[j], k, l);
               
            }
            else if(i == 2) {
                System.out.print("       QuickSort FirstElement ");
                test.runkilo(w[i], a[j], k, l);
                
            }
            else if(i == 3) {
                System.out.print("QuickSort MidFirstLastElement ");
                test.runkilo(w[i], a[j], k, l);
     
            }
            else {
                System.out.print("      QuickSort RandomElement ");
                test.runkilo(w[i], a[j], k, l);
            }
            
        }
        System.out.println();
        }
        for(j = 0; j <= 4; ++j) {
            int k = 10000;
            int l = 100;
            
            test.prints(j, "10000");
            for(i = 0; i <= 4; ++i ) {
            
            if(i == 0) {
                 System.out.print("                     MergSort ");
                
                test.runtime(w[i], a[j], k, l);
                System.out.print("");
            }
            else if(i == 1) {
                System.out.print("       QuickSort FirstElement ");
                test.runtime(w[i], a[j], k, l);
               
            }
            else if(i == 2) {
                System.out.print("      QuickSort RandomElement ");
                
                test.runtime(w[i], a[j], k, l);
                
            }
            else if(i == 3) {
                System.out.print("QuickSort MidFirstLastElement ");
                
                test.runtime(w[i], a[j], k, l);
     
            }
            else {
                
                System.out.print("                     HeapSort ");
                test.runtime(w[i], a[j], k, l);
            }
            
        }
        System.out.println();
        test.prints2();
        System.out.println();
        for(i = 0; i <= 4; ++i ) {
            
            if(i == 0) {
                
                System.out.print("                     HeapSort ");
                test.runkilo(w[i], a[j], k, l);
                System.out.print("");
            }
            else if(i == 1) {
                System.out.print("                     MergSort ");
                test.runkilo(w[i], a[j], k, l);
               
            }
            else if(i == 2) {
                System.out.print("       QuickSort FirstElement ");
                test.runkilo(w[i], a[j], k, l);
                
            }
            else if(i == 3) {
                System.out.print("QuickSort MidFirstLastElement ");
                test.runkilo(w[i], a[j], k, l);
     
            }
            else {
                System.out.print("      QuickSort RandomElement ");
                test.runkilo(w[i], a[j], k, l);
            }
            
        }
        System.out.println();
    }
        
            
        
            for(j = 0; j <= 4; ++j) {
            int k = 10000;
            int l = 100;
            
            test.prints(j, "1000");
            for(i = 0; i <= 4; ++i ) {
            
            if(i == 0) {
                 System.out.print("                     MergSort ");
                
                test.runtime(w[i], a[j], k, l);
                System.out.print("");
            }
            else if(i == 1) {
                System.out.print("       QuickSort FirstElement ");
                test.runtime(w[i], a[j], k, l);
               
            }
            else if(i == 2) {
                System.out.print("      QuickSort RandomElement ");
                
                test.runtime(w[i], a[j], k, l);
                
            }
            else if(i == 3) {
                System.out.print("QuickSort MidFirstLastElement ");
                
                test.runtime(w[i], a[j], k, l);
     
            }
            else {
                
                System.out.print("                     HeapSort ");
                test.runtime(w[i], a[j], k, l);
            }
            
        }
        System.out.println();
        test.prints2();
        System.out.println();
        for(i = 0; i <= 4; ++i ) {
            
            if(i == 0) {
                
                System.out.print("                     HeapSort ");
                test.runkilo(w[i], a[j], k, l);
                System.out.print("");
            }
            else if(i == 1) {
                System.out.print("                     MergSort ");
                test.runkilo(w[i], a[j], k, l);
               
            }
            else if(i == 2) {
                System.out.print("       QuickSort FirstElement ");
                test.runkilo(w[i], a[j], k, l);
                
            }
            else if(i == 3) {
                System.out.print("QuickSort MidFirstLastElement ");
                test.runkilo(w[i], a[j], k, l);
     
            }
            else {
                System.out.print("      QuickSort RandomElement ");
                test.runkilo(w[i], a[j], k, l);
            }
            
        }
        System.out.println();
        }
        for(j = 0; j <= 4; ++j) {
            int k = 10000;
            int l = 100;
            
            test.prints(j, "10000");
            for(i = 0; i <= 4; ++i ) {
            
            if(i == 0) {
                 System.out.print("                     MergSort ");
                
                test.runtime(w[i], a[j], k, l);
                System.out.print("");
            }
            else if(i == 1) {
                System.out.print("       QuickSort FirstElement ");
                test.runtime(w[i], a[j], k, l);
               
            }
            else if(i == 2) {
                System.out.print("      QuickSort RandomElement ");
                
                test.runtime(w[i], a[j], k, l);
                
            }
            else if(i == 3) {
                System.out.print("QuickSort MidFirstLastElement ");
                
                test.runtime(w[i], a[j], k, l);
     
            }
            else {
                
                System.out.print("                     HeapSort ");
                test.runtime(w[i], a[j], k, l);
            }
            
        }
        System.out.println();
        test.prints2();
        System.out.println();
        for(i = 0; i <= 4; ++i ) {
            
            if(i == 0) {
                
                System.out.print("                     HeapSort ");
                test.runkilo(w[i], a[j], k, l);
                System.out.print("");
            }
            else if(i == 1) {
                System.out.print("                     MergSort ");
                test.runkilo(w[i], a[j], k, l);
               
            }
            else if(i == 2) {
                System.out.print("       QuickSort FirstElement ");
                test.runkilo(w[i], a[j], k, l);
                
            }
            else if(i == 3) {
                System.out.print("QuickSort MidFirstLastElement ");
                test.runkilo(w[i], a[j], k, l);
     
            }
            else {
                System.out.print("      QuickSort RandomElement ");
                test.runkilo(w[i], a[j], k, l);
            }
            
        }
        System.out.println();
    }
    }
        // for(int i = 0; i < ns.length; ++i) {
        //     System.out.print(ns[i] + " ");
        // }

        
            
                    
        

    public void runkilo(SortType s, ArrayType a, int k, int j) {
        double totalTime = 0;
        for (int i = 1; i <= 10; i++) {
            double startTime = System.nanoTime();
            runSort(s, a, k, j);
            double  endTime = System.nanoTime();
            double testTime = endTime - startTime;
            double kilobytes = (double) testTime / 1024;
            double ans = Math.round(kilobytes);
            System.out.println(ans + "  ");
    
            totalTime += ans;
        }
        System.out.println(runave(totalTime));
    }
    
    public void runtime(SortType s, ArrayType a, int k, int j) {
       
            double totalTime = 0;
            for (int i = 1; i <= 10; i++) {
                long startTime = System.nanoTime();
                runSort(s,a,k,j);
                long endTime = System.nanoTime();
                long testTime = endTime - startTime;
                double ans = testTime / 1000;
                System.out.println(ans + "    ");
                totalTime += ans;
            }
            System.out.println(runave(totalTime));

        
    }
    public double runave(double totalTime) {
        return (double) ((double) totalTime / 10.0);
    }
    public void prints(int j, String s) {
        System.out.println("ArrayType = " + ss[j] + ", Array Size" + " = " + s);
        System.out.println("-------------------------");
        System.out.print("                                Run 1     Run 2     Run 3     Run 4     Run 5     Run 6     Run 7     Run 8     Run 9     Run 10     Average");
        
        System.out.println();
        System.out.print("                                Micro     Micro     Micro     Micro     Micro     Micro     Micro     Micro     Micro     Micro       Micro");
        System.out.println();
        System.out.print("                               Seconds   Seconds   Seconds   Seconds   Seconds   Seconds   Seconds   Seconds   Seconds   Seconds     Seconds");
        System.out.println();
        System.out.print("                               -------   -------   -------   -------   -------   -------   -------   -------   -------   -------     -------");
        System.out.println();
    //     System.out.println("                     MergSort");
    //     System.out.println("       QuickSort FirstElement");
    //     System.out.println("      QuickSort RandomElement");
    //     System.out.println("QuickSort MidFirstLastElement");
    //     System.out.println("                     HeapSort");
    // 
    }
    public void prints2() {
        
        System.out.print("                                Run 1      Run 2       Run 3      Run 4       Run 5     Run 6        Run 7       Run 8       Run 9       Run 10      Average");
        System.out.println();
        System.out.print("                              Kilo Bytes Kilo Bytes   Kilo Bytes  Kilo Bytes Kilo Bytes Kilo Bytes   Kilo Bytes  Kilo Bytes  Kilo Bytes  Kilo Bytes  Kilo Bytes");
        System.out.println();
        System.out.print("                             ----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- ----------- -----------");
    }
    @Override
    public Integer[] createArray(SortDriverInterfaceGeneric.ArrayType arrayType, int arraySize) {
        // TODO Auto-generated method stub
        Integer[] array = new Integer[arraySize];
        Random rand = new Random();
        int any = Integer.MAX_VALUE;
        int plus = 0;
        int i,k,j,l,s;
        
        if (arrayType == SortDriverInterfaceGeneric.ArrayType.Equal) {
            for (i = 0; i < array.length; i++) {
                array[i] = 0;
            }
        } 
        else if (arrayType == SortDriverInterfaceGeneric.ArrayType.Random) {
            for (k = 0; k < array.length; k++) {
                array[k] = rand.nextInt(any);
            }
        } 
        else if (arrayType == SortDriverInterfaceGeneric.ArrayType.Increasing) {
            for (j = 0; j < array.length; j++) {
                plus += 1;
                array[j] = plus;
            }
        } 
        else if (arrayType == SortDriverInterfaceGeneric.ArrayType.Decreasing) {
            for (l = 0; l < array.length; l++) {
                arraySize -= 1;
                array[l] = arraySize;
            }
        }
        else if (arrayType == SortDriverInterfaceGeneric.ArrayType.IncreasingAndRandom) {
            int pers = (int) (0.90 * arraySize);
        
            for (s = 0; s < array.length; s++) {
            if (s < pers) {
                plus += 1;
                array[s] = plus;
            } 
            else {
                array[s] = rand.nextInt(any);
            }
        }
        }
        
        return array;
        }

    @Override
    public Object[] runSort(SortDriverInterfaceGeneric.SortType sortType, SortDriverInterfaceGeneric.ArrayType arrayType, int arraySize, int numberOfTimes) throws java.lang.IllegalArgumentException, java.lang.NullPointerException {
        if(sortType == null) {
            throw new IllegalArgumentException("Sort type cannot be found");
        }
        if(arrayType == null) {
            

        }
        // TODO Auto-generated method stub
        int math = numberOfTimes * 2 + 1;
        Object[] arr = new Object[math];
        TestTimes testTimes = new TestTimes();
        int i;
        Integer[] unsorted;
        Integer[] sorted;
        for (i = 0; i < numberOfTimes; i++) {
            unsorted = createArray(arrayType, arraySize);
            sorted = Arrays.copyOf(unsorted, unsorted.length);
            
            long startTime = System.nanoTime();
        
            if (sortType == SortType.MergeSort) {
                MergeSort bubble = new MergeSort();
                bubble.sort(sorted);
            } 
            else if (sortType == SortType.HeapSort) {
                HeapSort LOUISIANA = new HeapSort();
                LOUISIANA.sort(sorted);
            }
            else if (sortType == SortType.QuickSortFirstElement){
                QuickSort cddbqfkti = new QuickSort();
                cddbqfkti.sort(sorted);
            }
            else if (sortType == SortType.QuickSortMidOfFirstMidLastElement){
                QuickSort ss = new QuickSort();
                ss.sort(sorted);
            }
            else if (sortType == SortType.QuickSortRandomElement){
                QuickSort sss = new QuickSort();
                sss.sort(sorted);
            }
            else {
                throw new IllegalArgumentException("Sort type cannot be found");
            }
       
            long endTime = System.nanoTime();

            long testTime = endTime - startTime;
        
            testTimes.addTestTime(testTime);

        arr[i * 2] = Arrays.copyOf(unsorted, unsorted.length);
        arr[i * 2 + 1] = Arrays.copyOf(sorted, sorted.length);
    }
    arr[numberOfTimes * 2] = testTimes;
    return arr;
    }
}
    

