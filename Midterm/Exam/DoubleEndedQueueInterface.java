/**
 *
 * <p>
 * This is the DoubleEndedQueueInterface for the Midterm Exam of CMP-338.
 * </p>
 *
 * 
 * 



 import java.util.Stack;

public class StackApplications {

    public static double evaluatePostFixExpression(String s) {
        Stack<Double> stack = new Stack<>();

        String[] tokens = s.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            try {
                double number = Double.parseDouble(token);
                stack.push(number);
            } catch (NumberFormatException e) {

                double operand2 = stack.pop();
                double operand1 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }
        }
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid postfix expression");
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluatePostFixExpression("3 4 +"));          
        System.out.println(evaluatePostFixExpression("3 4 * 2 / 5 +")); 
        System.out.println(evaluatePostFixExpression("5 2 * 8 +"));      
    }
}









public class DoubleEndedQueue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size;

    public DoubleEndedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void addBack(E element) {
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public void addFront(E element) {
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            rear = newNode;
        } else {
            newNode.next = front;
        }
        front = newNode;
        size++;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public E peekBack() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return rear.element;
    }

    public E peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return front.element;
    }

    public void removeAll() {
        front = null;
        rear = null;
        size = 0;
    }

    public E removeBack() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        E element = rear.element;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            Node<E> current = front;
            while (current.next != rear) {
                current = current.next;
            }
            rear = current;
            rear.next = null;
        }
        size--;
        return element;
    }

    public E removeFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        E element = front.element;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
        }
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
            next = null;
        }
    }
}
















 * <p>
 * The DoubleEndedQueue ADT is a double-ended queue. Users are allowed to add and 
 * remove elements from both the front and the back of the DoubleEndedQueue.
 * </p>
 * 
 * @author Sameh Fakhouri
 *
 * @param <E>	The generic parameter that specifies the type of elements in the DoubleEndedQueue.
 */
public interface DoubleEndedQueueInterface<E> extends Iterable<E> {

	/**
	 * This method is called to determine if the DoubleEndedQueue is empty.
	 * 
	 * @return 	Returns <b>true</b> if the DoubleEndedQueue is empty, otherwise it returns <b>false</b>. 
	 */
	public boolean isEmpty();

	/**
	 * This method is called to obtain the count of elements in the list.
	 * 
	 * @return 	Returns the numbers of elements that are currently in the DoubleEndedQueue.
	 */
	public int size();

	/**
	 * 
	 * Adds the specified element to the <b><code>front</code></b> of the DoubleEndedQueue. If the specified element is <b><code>null</code></b>
	 * the method will throw a NullPointerException.
	 * 
	 * @param	element	The element to add.
	 * 
	 * @throws 	NullPointerException	If the specified element being added is null. 
	 * 
	 */
	public void addFront(E element) throws NullPointerException;

	/**
	 * 
	 * Adds the specified element to the <b><code>back</code></b> of the DoubleEndedQueue. If the specified element is <b><code>null</code></b>
	 * the method will throw a NullPointerException.
	 * 
	 * @param	element	The element to add.
	 * 
	 * @throws 	NullPointerException	If the specified element being added is null. 
	 * 
	 */
	public void addBack(E element) throws NullPointerException;
	
	/**
	 * 
	 * Retrieves and removes the element at the <b><code>front</code></b> of the DoubleEndedQueue.
	 * 
	 * @return	The element at the front of the DoubleEndedQueue or <b><code>null</code></b> if the DoubleEndedQueue is empty.
	 * 
	 */
	public E removeFront();
	
	/**
	 * 
	 * Retrieves and removes the element at the <b><code>back</code></b> of the DoubleEndedQueue.
	 * 
	 * @return	The element at the back of the DoubleEndedQueue or <b><code>null</code></b> if the DoubleEndedQueue is empty.
	 * 
	 */
	public E removeBack();
	
	/**
	 * 
	 * Retrieves, but does not remove element at the <b><code>front</code></b> of the DoubleEndedQueue.
	 * 
	 * @return	The element at the front of the DoubleEndedQueue or <b><code>null</code></b> if the DoubleEndedQueue is empty.
	 * 
	 */
	public E peekFront();
	
	/**
	 * 
	 * Retrieves, but does not remove element at the <b><code>back</code></b> of the DoubleEndedQueue.
	 * 
	 * @return	The element at the back of the DoubleEndedQueue or <b><code>null</code></b> if the DoubleEndedQueue is empty.
	 * 
	 */
	public E peekBack();

	/**
	 * 
	 * Removes all elements from the DoubleEndedQueue making it empty.
	 * 
	 */
	public void removeAll();
}
