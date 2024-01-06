public class InsertionSort implements SortInterface{

    @Override
    public void sort(Integer[] arrayToSort) {
        int temp;
        int s = 0;
        boolean leave = false;


        for(int j = 1; j < arrayToSort.length; ++j) {
            temp = arrayToSort[j];
            s = j-1;
            while(s >= 0 && arrayToSort[s] > temp) {
                arrayToSort[s+1] = arrayToSort[s];
                s--;
            }
            arrayToSort[s+1] = temp;
            
        }
    }

    public static void main(String[] args) {
        int[] t = {754,3,5,42,1,4,53,34,7547,447,6,456,45,6,548,65,8,5,5,34,1,24,3167,5675,67,5334,654,6546,45,64,56,45663,27,57,254,754,7,46,46,4,64,56,45,754,7,57,47,67,57,48,68,56,85,6486548,4568,56,8,56,4536,696,9,654,6,56,54,654,64,57,67,6,75,7,56,754,74,7654,6,46,56,45,633,6,356,7,8,97,586,7,64,5,46768,79,7908,687,6,54,334,354,36,347,57,45,74574857,465,465,43747,57,54754,745,38,45,73754,7,547,54,7,6,86,3,52,4,32,532,7,87,0,45,7437,34,7378,64,56,45,74,88758,75,657,4,64,7,47,48,78,7,976,857,67,574,747,4367};
        int temp;
        int s = 0;
        boolean leave = false;


        for(int j = 1; j < t.length; ++j) {
            temp = t[j];
            s = j-1;
            while(s >= 0 && t[s] > temp) {
                t[s + 1] = t[s];
                s--;
            }
            t[s + 1] = temp;
            
        }
        for(int i = 0; i < t.length; ++i) {
            System.out.print(t[i] + " ");
        }
    }
    
}
