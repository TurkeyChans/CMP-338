import java.util.Iterator;
import java.util.Vector;

public class ElementIterator<E> implements Iterator<E> {

    private Vector<E> elements;
    private int currentIndex;

    public ElementIterator(Vector<E> elements) {
        this.elements = elements;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < elements.size();
    }

    @Override
    public E next() {
        E element = elements.get(currentIndex);
        currentIndex++;
        return element;
    }
}
