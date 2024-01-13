import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

public class DoubleEndedQueue<E> implements DoubleEndedQueueInterface<E>{

    private Node<E> front = null;
	private Node<E> back = null;
	private int size = 0;

    public DoubleEndedQueue() {
		this.front = null;
		this.back = null;
		this.size = 0;
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
    public void removeAll() {
        this.size = 0;
        this.front = null;
		this.back = null;
    }
    



    @Override
    public Iterator<E> iterator() {
        return new ElementIterator<>(front);
    }



    @Override
    public void addFront(E element) throws NullPointerException {
        if (element == null) {
            throw new NullPointerException("element is null");
        }
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            front = newNode;
            back = newNode;
        } 
        else {
            newNode.setNext(front);
            front = newNode;
        }
        size++;
    }



    @Override
    public void addBack(E element) throws NullPointerException {
        if (element == null) {
            throw new NullPointerException("element is null");
        }
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            front = newNode;
            back = newNode;
        } 
        else {
            back.setNext(newNode);
            back = newNode;
        }
        //System.out.print(b.getElement() + " ");
        size++;
        
    }



    @Override
    public E removeFront() {
        if(isEmpty()) {
            return null;
        }
        E fElement = front.getElement();
        front = front.getNext();
        size--;
        return fElement;
    }



    @Override
    public E removeBack() {

        
        if (isEmpty()) {
            return null; 
        }

        E bElement = back.getElement();

        if (front == back) {
            
            front = null;
            back = null;
        } 
        else {
            Node<E> a = front;
            while (a.getNext() != back) {
                a = a.getNext();
            }

            a.setNext(null);
            back = a;
        }

        size--;
        return bElement;
    }






    @Override
    public E peekFront() {
        if (isEmpty()) {
            return null;
        }
        E fElement = front.getElement();
        return fElement;
    }



    @Override
    public E peekBack() {
        if (isEmpty()) {
            return null;
        }
        E bElement = back.getElement();
		return bElement;
    }
    
    public static void main(String[] args) {
        DoubleEndedQueue arr = new DoubleEndedQueue<>();
        arr.addBack("ash");
        arr.addBack(496);
        arr.addBack(47);
        arr.addFront(86);
        System.out.println(arr.peekFront());
        System.out.println(arr.removeBack());
        System.out.println(arr.peekBack());
        
    }
    
}

