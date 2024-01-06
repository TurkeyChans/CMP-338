import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedQueue<E>  implements QueueInterface<E>{

    private Node<E> f = null;
	private Node<E> b = null;
	private int size = 0;

    public LinkedQueue() {
		this.f = null;
		this.b = null;
		this.size = 0;
	}
    
    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public QueueInterface<E> copy() {
        LinkedQueue<E> copyQueue = new LinkedQueue<>(); 
        Node<E> current = f;
        while(current != null) {
            copyQueue.enqueue(current.getElement());
            current = current.getNext();
        }
        return copyQueue;
    }

    @Override
    public void enqueue(E element) throws IllegalStateException, NullPointerException {
        if (element == null) {
            throw new NullPointerException("element is null");
        }
        //IllegalStateException is not needed
    
        Node<E> newNode = new Node<>(element);
    
        if (isEmpty()) {
            f = newNode;
            b = newNode;
        } 
        else {
            b.setNext(newNode);
            b = newNode;
        }
        //System.out.print(newNode);
        
        //System.out.println(dequeue());
        //System.out.println(dequeue(3));
        //System.out.println(dequeue(1));
        size++;
    }
    
    

    

    @Override
    public E peek() {
        E fElement = f.getElement();
		return fElement;
    }

    @Override
    public E dequeue() {
        E fElement = f.getElement();
        f = f.getNext();
        size--;
        return fElement;

    }

    @Override
    public E dequeue(int index) throws NoSuchElementException {
        int math = index-1;
        int math2 = size-1;
        int i;
        if(index < 0 || index >= size) {
            throw new NoSuchElementException("This index is no good");
        }
        
        else if(index == math2) {
            E belement = b.getElement();
            Node<E> currentNode = f;
            for (i = 0; i < size - 2; i++) {
                currentNode = currentNode.getNext();
            }
            b = currentNode;
            size--;
            return belement;
        }
        else {
            Node<E> previousNode = f;
            for (i = 0; i < math; ++i) {
                previousNode = previousNode.getNext();
            }
            Node<E> removedNode = previousNode.getNext();
            E removedElement = removedNode.getElement();
            previousNode.setNext(removedNode.getNext());
            size--;
            return removedElement;
        }
    }

    @Override
    public void removeAll() {
        this.size = 0;
        this.f = null;
		this.b = null;
    }
    public static void main(String[] args) {
        LinkedQueue arr = new LinkedQueue();
        arr.enqueue(1);
        arr.enqueue(1);
        arr.enqueue(5);
        arr.enqueue(8);
        arr.enqueue(10);

        arr.enqueue(1);
        arr.enqueue(3);
        arr.enqueue(7);
        arr.enqueue(1);
        arr.enqueue(16);
    }
    
}
