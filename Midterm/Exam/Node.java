
public class Node<E> {

	private Node<E> previous;
	private E element;
	private Node<E> next;
	private int priority;
	
	public Node() {
		this.previous = null;
		this.element = null;
		this.next = null;
		this.priority = 0;
	}
	
	public Node(E element) {
		this.previous = null;
		this.element = element;
		this.next = null;
		this.priority = 0;
	}

	public Node(Node<E> previous, E element, Node<E> next, int priority) {
		this.previous = previous;
		this.element = element;
		this.next = next;
		this.priority = priority;
	}
	
	public Node(E element, int priority) {
        this.previous = null;
        this.element = element;
        this.next = null;
        this.priority = priority;
    }

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Node<E> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<E> previous) {
		this.previous = previous;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
}
