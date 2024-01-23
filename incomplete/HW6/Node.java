
public class Node<E> {

	private Node<E> previous;
	private E element;
	private Node<E> next;
	
	public Node() {
		this.previous = null;
		this.element = null;
		this.next = null;
	}
	
	public Node(E element) {
		this.previous = null;
		this.element = element;
		this.next = null;
	}

	public Node(Node<E> previous, E element, Node<E> next) {
		this.previous = previous;
		this.element = element;
		this.next = next;
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


