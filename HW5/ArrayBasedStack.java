import java.util.Iterator;

public class ArrayBasedStack<E> implements StackInterface<E>{
    private int size = 0; 
    private Object[] arr = new Object[10000];
    
    public ArrayBasedStack() {
        this.size = 0;
        this.arr = new Object[10000];
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (size <= 0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public StackInterface copy() {
        ArrayBasedStack<E> copyall = new ArrayBasedStack<>();
        Object[] copyarr = new Object[10000];
        int i;
        for (i = 0; i < size; i++) {
            copyarr[i] = arr[i];
        }
        copyall.arr = copyarr;
        copyall.size = size;

        return copyall;
    }

    @Override
    public void push(Object e) throws IllegalStateException, NullPointerException {
        if (e == null) {
            throw new NullPointerException("element is null");
        }        
        if (size == arr.length) {
            throw new IllegalStateException("The queue is full.");
        }
        if(size == 0) {
            arr[0] = e;
            size++;
        }
        else {
            int i;
            Object[] arr1 = new Object[10000];
            
            arr1 = arr;
            for (i = arr1.length - 2; i >= 0; --i) {
                arr1[i + 1] = arr[i];
            }
            
            arr1[0] = e; 
            
            arr = arr1;
       
        /* }
        if(size == 0) {
            arr[size] = e;
            size++;
        }
        else{
        int i = 1;
            Object temp,temp1,temp2,temp3,temp4,temp5,temp6,temp7,temp8;
            temp = arr[0];
            arr[0] = e;
            temp1 = arr[1];
            temp2 = arr[2];
            temp3 = arr[3];
            temp4 = arr[4];
            temp5 = arr[5];
            temp6 = arr[6];
            temp7 = arr[7];
            temp8 = arr[8];
            arr[i] = temp;
            i++;
            arr[i] = temp1;
            i++;
            arr[i] = temp2;
            i++;
            arr[i] = temp3;
            i++;
            arr[i] = temp4;
            i++;
            arr[i] = temp5;
            i++;
            arr[i] = temp6;
            i++;
            arr[i] = temp7;
            i++;
            arr[i] = temp8;
            size++;
        }*/
        size++;
        /*for(int j = 0; j < arr.length; ++j) {
            System.out.print(arr[j] +  " ");
        }
        System.out.println("");*/
        }

    }

    @Override
    public E peek() {
        if(size != 0 ) {
            return (E) arr[0];
        }
        else{
            return null;
        }
        
    }

    @Override
    public E pop() {
        // Object temp = arr[0];
        //     for(int i = 9; i <= size; ++i) {
        //         arr[i] = arr[i+1];
        //     }
        //     size--;
        // return (E) temp;
        if(size == 0) {
            return null;
        }
        else {
            Object[] arr1 = new Object[10000];
            E ans = (E) arr[0];
            int i;
            for (i = 0; i < arr1.length - 1; ++i) {
                arr1[i] = arr[i + 1];
            }
            arr = arr1;
            size--;
            return ans;
        }
        
        
    }

    @Override
    public void clear() {
        this.arr = new Object[10];
        this.size = 0;
    }
    public static void main(String[] args) {
        ArrayBasedStack test = new ArrayBasedStack<>();
        test.push(null);
        test.push(7835);
        test.push(636);
        test.push(3452);
        test.push(100);
        test.push(60);
        test.push(10);
        test.push(8);
        System.out.println(test.pop());

        //test.push(1);
        //test.push(1);
        //test.push(1);
        //test.push(1);
        test.push(74373);
        test.push(2);
        test.push(1);
        test.push(2);
        test.push(1);
        System.out.print(test.peek());
        test.push(1);

        
    } 
}  
