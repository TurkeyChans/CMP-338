
public class ArrayBasedList<I extends Comparable<I>> implements ListInterface<I> {

    //private Object [] Array = new Object[10];
    private Object [] Array = new Object[10];
	private int num = 0;

    @Override
    public ListInterface<I> copy() {
        int i;
        Object[] copyArray = new Object[num];
        for (i = 0; i < num; ++i) {
            copyArray[i] = Array[i];
        }
        ArrayBasedList<I> copyArr = new ArrayBasedList<>();
        for (i = 0; i < num; ++i) {
            copyArr.add((I) copyArray[i]);
        }
    
        return copyArr;

    }

    @Override
    public int size() {
        return num;
        
    }

    @Override
    public void add(I element) {
    
        if(num >= Array.length) {
            Object[] nArray = new Object [Array.length + 1];
		
		    for(int i = 0; i < Array.length; i++) {
			    nArray[i] = Array[i];
		    }
		    Array = nArray;
        }
        
        Array[num] = element;
        num++;
        }

    @Override
    public boolean isEmpty() {
        return(0 == num);
    }

    @Override
    public void add(I element, int index) throws IndexOutOfBoundsException {
        try {
            if(num >= Array.length) {
                Object[] nArray = new Object [Array.length + 1];
            
                for(int i = 0; i < Array.length; i++) {
                    nArray[i] = Array[i];
                }
                Array = nArray;
            }
            if(index >= Array.length) {
                Object[] nArray = new Object [index + 1];
            
                for(int i = 0; i < Array.length; i++) {
                    nArray[i] = Array[i];
                }
                Array = nArray;
            }
            Array[index] = element;
            num++;
        }
        catch(Exception e) {
            throw new UnsupportedOperationException("This exception is thrown if the specified index is invalid.");
        }
    }

    public void addSorted(I element) {
        int x = 0;
        Object[] nArray = new Object[Array.length+1];
        if (num >= Array.length) {
            int i;
            for (i = 0; i < Array.length; ++i) {
                nArray[i] = Array[i];
            }
            Array = nArray;
        }
        while (x < num && ((I) Array[x]).compareTo(element) < 0) {
            x++;
        }
        int i;
        for (i = num; i > x; --i) {
            Array[i] = Array[i-1];
        }
        Array[x] = element;
        num++;
    }

    @Override
    public I get(int index) throws IndexOutOfBoundsException {
        try {
            return (I) (Array[index]);
        }
        catch(Exception e) {
            System.out.println("The index you put in doesnt exist in the Array");
            
        }
        return null;
        
    }

    @Override
    public I replace(I element, int index) throws IndexOutOfBoundsException {
        I temp;
        try {
            temp = (I) Array[index];
            Array[index] = element;
            return temp;
        }
        catch(Exception e) {
            return null;
        }

    }

    @Override
    public I remove(int index) throws IndexOutOfBoundsException {
        try{
            Array[index] = null;
            for(int i = index; i <= num; ++i) {
                Array[i] = Array[i+1];
            
            }
            I removed = (I) Array[index];
            num--;
            return removed;
        }
        catch(Exception e){
            return null;
        }
    }

    @Override
    public void removeAll() {
        Object [] removeALL = new Object[num];
        for(int i = 0; i < this.num; ++i) {
            Array[i] = removeALL[i];
        }
        this.num = 0;
        

    }
    
    public static void main(String[] args) {
        ArrayBasedList Arr = new ArrayBasedList();
        String s = "sfs";
        s.length();
        System.out.println(s);
        Arr.add(30);
        Arr.add(10);
        Arr.add(11);
        Arr.add(10);
        Arr.add(16);

      

        
        

        
        
        

        Arr.removeAll();
        


        
        //full
    
    }

    
    
}
