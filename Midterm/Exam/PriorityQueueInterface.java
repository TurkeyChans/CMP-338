public interface PriorityQueueInterface<E> {
    public void enqueue(E element, int priority);
    public E dequeue();
    public E peek();
    public boolean isEmpty();
    public int size();
    public E poll();
    public void clear();

}