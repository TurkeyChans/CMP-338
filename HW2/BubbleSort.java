public class BubbleSort implements SortInterface{

    @Override
    public void sort(Integer[] arrayToSort) {
        int i,j,temp;
        int k = 0;
        int last = arrayToSort.length-1;

        for(i = 0; i < arrayToSort.length; i++) {
            for(j = 0; j < arrayToSort.length; j++) {
                
                if(k == 1) {
                    temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[last];
                    arrayToSort[last] = temp;
                    k = 0;
                }
                else if(arrayToSort[j] > arrayToSort[j+1]) {
                    temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = temp;
                    
                    
                }
                if(j == arrayToSort.length-2) {
                        k = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        /*int[] a = {647,23,5,75,3,55325};
        int i,j,temp;
        int k = 0;
        int last = a.length-1;

        for(i = 0; i < a.length; i++) {
            for(j = 0; j < a.length; j++) {
                
                if(k == 1) {
                    temp = a[j];
                    a[j] = a[last];
                    a[last] = temp;
                    k = 0;
                }
                else if(a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    
                    
                }
                if(j == a.length-2) {
                        k = 1;
                }
            }*/
        }

}
    

