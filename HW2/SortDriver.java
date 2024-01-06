import java.util.Arrays;
import java.util.Random;

public class SortDriver implements SortDriverInterface {

    
    public enum arrayssssss{
        //https://youtu.be/TCMhP8trGwY?si=bOE1Roia43vkdMTN
        // helps teach enum
    }
    

    public static void main(String[] args) {
        SortDriver s = new SortDriver();
        ArrayType r = ArrayType.Equal;
        SortType b = SortType.BubbleSort;
        int num = 1000;
        int max = 10;
        long totalTime;
        for (int u = 0; u <= 1; ++u) {
            if(u == 1) {
                num = 10000;
                max = 100;
            }
            for (int h = 0; h <= 4; h++) {
                if(h == 0) {
                    r = ArrayType.Equal;
                }
                else if (h == 1) {
                    r = ArrayType.Random;
                }
                else if (h == 2) {
                    r = ArrayType.Increasing;
                }
                else if (h == 3) {
                    r = ArrayType.Decreasing;
                }
                else if (h == 4) {
                    r = ArrayType.IncreasingAndRandom;
                }
                
                for (int t = 0; t <= 2; t++) {
                    if(t == 0) {
                        b = SortType.BubbleSort;
                    }
                    else if(t == 1) {
                        b = SortType.SelectionSort;
                    }
                    else if(t == 2) {
                        b = SortType.InsertionSort;
                    }
                    System.out.println(b + ", " + r + ", " + num);
                    System.out.println("--------------------------------------------------------------------------------------------------------------------");
    
                    totalTime = 0;
    
                    for (int i = 1; i <= 10; i++) {
                        long startTime = System.nanoTime();
                        s.runSort(b, r, num, max);
                        long endTime = System.nanoTime();
                        long testTime = endTime - startTime;
                        System.out.print(testTime + " ");
                        totalTime += testTime;
                    }
    
                    long ave = (long) ((long) totalTime / 10.0);
                    
                    System.out.print("Ave Tine: " + ave);
                    System.out.println();
                    System.out.println();
                
                }
            }
        }
    }
    

    

@Override
public Integer[] createArray(SortDriverInterface.ArrayType arrayType, int arraySize) {
    Integer[] array = new Integer[arraySize];
    Random rand = new Random();
    int any = Integer.MAX_VALUE;
    int plus = 0;
    int i,k,j,l,s;
    
    if (arrayType == SortDriverInterface.ArrayType.Equal) {
        for (i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    } 
    else if (arrayType == SortDriverInterface.ArrayType.Random) {
        for (k = 0; k < array.length; k++) {
            array[k] = rand.nextInt(any);
        }
    } 
    else if (arrayType == SortDriverInterface.ArrayType.Increasing) {
        for (j = 0; j < array.length; j++) {
            plus += 1;
            array[j] = plus;
        }
    } 
    else if (arrayType == SortDriverInterface.ArrayType.Decreasing) {
        for (l = 0; l < array.length; l++) {
            arraySize -= 1;
            array[l] = arraySize;
        }
    }
    else if (arrayType == SortDriverInterface.ArrayType.IncreasingAndRandom) {
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
    public Object[] runSort(SortType sortType, ArrayType arrayType, int arraySize, int numberOfTimes) {
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
        
            if (sortType == SortType.BubbleSort) {
                BubbleSort bubble = new BubbleSort();
                bubble.sort(sorted);
            } 
            else if (sortType == SortType.SelectionSort) {
                SelectionSort LOUISIANA = new SelectionSort();
                LOUISIANA.sort(sorted);
            }
            else if (sortType == SortType.InsertionSort){
                InsertionSort cddbqfkti = new InsertionSort();
                cddbqfkti.sort(sorted);
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
    

