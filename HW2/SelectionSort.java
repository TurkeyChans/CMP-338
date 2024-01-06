public class SelectionSort implements SortInterface{
    
    @Override
    public void sort(Integer[] arrayToSort) {
        int i,j,k,temp;
        for(i = 0; i < arrayToSort.length-1; ++i) {
			k = i;
			for(j = i+1; j < arrayToSort.length; ++j) {
				if(arrayToSort[k] > arrayToSort[j]) {
					k = j;
				}
			}
			
			temp = arrayToSort[i];
			arrayToSort[i] = arrayToSort[k];
			arrayToSort[k] = temp;
		}
		
	}
    
    

    public static void main(String[] args) {
        /*int[] t = {754,3,5,42,1,4,53,34,7547,447,74536,696,9};
        int temp;
        int key = Integer.MAX_VALUE;
        int s = 0;
        int save = 0;
        
        for(int j = 0; j < t.length; ++j) {
            temp = t[j];
            s += j;
            while(s != t.length) {
                if(temp > t[s] && key > t[s]) {
                    key = t[s];
                    for(int r = 0; r < t.length; r++) {
                        if(key == t[r]) {
                            save = r;
                            break;
                        }
                    }
                }
                s++;
            }
            if (key == Integer.MAX_VALUE) {
                
            }
            else {
                t[j] = key;
                t[save] = temp;
                

            }
            key = Integer.MAX_VALUE;
            s = 0;
        }
        for(int i = 0; i < t.length; ++i) {
            System.out.print(t[i] + " ");
        }*/
    }
    
}
