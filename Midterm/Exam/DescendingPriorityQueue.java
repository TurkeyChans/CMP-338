import java.util.Iterator;
import java.util.NoSuchElementException;
public class DescendingPriorityQueue<E> implements PriorityQueueInterface<E>{
    

    private Node<E> front;
    private int size;

    public DescendingPriorityQueue() {
        front = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }
    

    @Override
    public void enqueue(E element, int priority) {
        Node<E> tests = new Node<>(element, priority);
        //int i,a = 0;
        int test,i;
        String sss;
        
        boolean w = true;
        if (isEmpty() || priority > front.getPriority()) {
            tests.setNext(front);
            front = tests;
        } 
        else {
            Node<E> a = front;
            boolean checker = false;

            while (a.getNext() != null) {
                if (priority <= a.getNext().getPriority()) {
                    a = a.getNext();
                } 
                else {
                    tests.setNext(a.getNext());
                    a.setNext(tests);
                    checker = true;
                    break;
                }
            }

            if (!checker) {
                tests.setNext(a.getNext());
                a.setNext(tests);
            }
        }
        size++;
        /*Node<E> current = front;
        while (current != null) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println();*/
        
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        Node<E> rFront = front;
        front = front.getNext(); 
        size--;
        return rFront.getElement();
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        E fElement = front.getElement();
        return fElement;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        Node<E> fNode = front;
        front = front.getNext();
        size--;
        return fNode.getElement();
    }

    @Override
    public void clear() {
        this.size = 0;
        this.front = null;
    }
    public static void main(String[] args) {
        DescendingPriorityQueue arr = new DescendingPriorityQueue();
       
        arr.enqueue(16, 1);
        arr.enqueue(12, 3);
        arr.enqueue(8, 2);
        arr.enqueue(8, 9);
        arr.enqueue(8, 6);
        arr.enqueue(0, 1);
        
        
    }
}


