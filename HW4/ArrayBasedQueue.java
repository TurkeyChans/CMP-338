import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayBasedQueue <E> implements QueueInterface<E> {
	
	private int size = 0;
	private int f = -1;
	private int b = -1;
	private Object [] array = new Object[10000];
    //private Object [] array = ;

    public ArrayBasedQueue() {
		this.array = new Object[10000];
        //Object [] array = {3,3,534,5,436,5346,436,4,64};
		this.size = 0;
		this.f = -1;
		this.b = -1;
	}
    public ArrayBasedQueue(int arrayMaxQueueSize) {
		this.array = new Object[arrayMaxQueueSize];
		this.size = 0;
		this.f = -1;
		this.b = -1;
	}

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
    @Override
    public boolean isEmpty() {
        return (size <= 0);
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public QueueInterface<E> copy() {
        ArrayBasedQueue<E> copyArr = new ArrayBasedQueue<>(array.length);
        int i;
        for (i = 0; i < size; ++i) {
            int index = (f + i) % array.length;
            copyArr.enqueue((E) array[index]);
        }
        return copyArr;
    }
    
    @Override
    public void enqueue(E element) throws NullPointerException, IllegalStateException {
        if (element == null) {
            throw new NullPointerException("element is null");
        }
        if (size == array.length) {
            throw new IllegalStateException("The queue is full.");
        }
        
        
        if (isEmpty()) {
            f = 0; 
        }
        
        b = (b + 1) % array.length;  
        array[b] = element;
        size++;
        /* 
        if(size == 5) {
            System.out.println(dequeue());
        }
        
        
        for(int i = 0; i < array.length; ++i) {
            System.out.print(array[i]);
            
        }
        System.out.println(); */
    }
    

    @Override
    public E peek() {
        E element = (E) this.array[f];
		return element;
    }
    @Override
    public E dequeue() {
		E element = (E) this.array[f];
		f++;
		this.size--;
		return element;
    }
    @Override
    public E dequeue(int index) throws NoSuchElementException {
        if (!(index >= 0 && index < this.size)) {
            throw new NoSuchElementException("Index " + index + " cannot be found");
        }

        E r = (E) this.array[(f+index) % this.array.length];

        for (int i = index; i < this.size-1; i++) {
            int math = (f + i) % this.array.length;
            int math2 = (f + i + 1) % this.array.length;
            this.array[math] = this.array[math2];
        }
        this.b = (b-1 + this.array.length) % this.array.length; 
        this.size--;

        return r;
    }

    @Override
    public void removeAll() {
        Object [] array = new Object[10000];
        f = -1;
        b = -1;
        size = 0;
        
    }
    public static void main(String[] args) {
        Object[] t = {42353,523,5,35,435,345,45,34};
        ArrayBasedQueue arr = new ArrayBasedQueue();
        arr.enqueue(4);
        arr.enqueue(4);
        arr.enqueue(4);
        arr.enqueue(4);
        arr.enqueue(4);
        arr.enqueue(4);
        arr.enqueue(4);
        arr.enqueue(6);
        arr.enqueue(4);
        arr.enqueue(4);
        arr.enqueue(4);
        arr.enqueue(4);
        arr.enqueue(4);
        arr.enqueue(6);
        arr.enqueue(4);
        arr.enqueue(4);

        arr.enqueue(4);

        arr.enqueue(4);

        //System.out.print(arr.enqueue(4));
        

    }
	
}