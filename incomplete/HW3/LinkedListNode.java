public class LinkedListNode<I extends java.lang.Comparable<? super I>> extends java.lang.Object {
    private I element;
    private LinkedListNode<I> next = null;

    LinkedListNode(I element) {
        this.element = element;
        this.next = null;
    }

    LinkedListNode(I element, LinkedListNode<I> next) {
        this.element = element;
        this.next = next;
    }
    public I getElement() {
        return element;
    }
    public void setElement(I element) {
        this.element = element;
    }
    public LinkedListNode<I> getNext() {
        return next;
    }
    public void setNext(LinkedListNode<I> next) {
        this.next = next;
    }
    public static void main(String[] args) {
        
    }
}
