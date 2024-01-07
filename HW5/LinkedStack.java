import java.util.Iterator;

public class LinkedStack<E> implements StackInterface<E>{
    private Node<E> head = null;
	//private Node<E> tail = null;
	private int size = 0;
    
    public LinkedStack() {
        this.head = null;
        this.size = 0;
    }
    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (size <= 0);
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return size;
    }

    @Override
    public StackInterface<E> copy() {
        LinkedStack<E> news = new LinkedStack<>();
        LinkedStack<E> tempstack = new LinkedStack<>(); 
        Node<E> current = head;

        while (current != null) {
            tempstack.push(current.getElement());
            current = current.getNext();
        }

        while (!tempstack.isEmpty()) {
            news.push(tempstack.pop());
        }

        return news;
    }




    @Override
    public void push(E e) throws IllegalStateException, NullPointerException {
        if (e == null) {
            throw new NullPointerException("element is null");
        }
        // no need for IllegalStateException
        Node<E> newNode = new Node<E>(e);
        newNode.setNext(head); 
        head = newNode; 
        size++;
        
        
        /*Node<E> c = head;
        while (c != null) {
        System.out.print(c.getElement() + " ");
        c = c.getNext();
        }
        System.out.println();*/
        //System.out.println(peek());
        // if(size == 2) {
        //     System.out.println(pop());
        // }
        // if(size == 2) {
        //     System.out.println(copy());
         
        // }
        
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        Node<E> c = head;
        return c.getElement();
    }

    @Override
    public E pop() {
        E top = head.getElement();
        head = head.getNext();
        size--; 
        return top; 
    
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }
    public static void main(String[] args) {
        LinkedStack s = new LinkedStack();
        s.push(5);
        s.push(6);
        s.push(1);
        s.push(100);
        s.push(7);
        
        

    }
    
}
