import java.util.Iterator;
import java.util.NoSuchElementException;
//import java.util.Vector;

public class ElementIterator<E> implements Iterator<E> {
    private Node<E> current;

    public ElementIterator(Node<E> front) {
        this.current = front;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E element = current.getElement();
        current = current.getNext();
        return element;
    }
}
