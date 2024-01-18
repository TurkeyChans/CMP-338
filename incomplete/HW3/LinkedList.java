public class LinkedList<I extends Comparable<I>> implements ListInterface<I> {

    private NodesSetion<I> head = null;
    private NodesSetion<I> tail = null;
    private int size = 0;

    private class NodesSetion<I> {
        I data;
        NodesSetion<I> next = null;
        NodesSetion(I data) {
            this.data = data;
        }
    }
    @Override
    public ListInterface<I> copy() {
        LinkedList<I> copying = new LinkedList<>();
        NodesSetion<I> c = head;
        while (c != null) {
            copying.add(c.data);
            c = c.next;
        }
        return copying;
    }
    @Override
    public int size() {
        return this.size;
    }
    @Override
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public void add(I element) {
        NodesSetion<I> nodes = new NodesSetion<>(element);
            if(isEmpty() == true){
                head = nodes;
                tail = nodes;
            } else {
                tail.next = nodes;
                tail = nodes;
            }
        size++;
        /*
        NodesSetion<I> h = head;
        while (h != null) {
        System.out.print(h.data + " ");
        h = h.next;
        }
            System.out.println();
            */
        }

    @Override
    public void add(I element, int index) throws IndexOutOfBoundsException {
        try {
            NodesSetion<I> nodes = new NodesSetion<>(element);
            int i;
            if (index == 0) {
                nodes.next = head;
                head = nodes;
                if(isEmpty()) {
                    tail = nodes;
                }
            }
            else {
                NodesSetion<I> previousnodes = head;
                for (i = 0; i < index-1; ++i) {
                    previousnodes = previousnodes.next;
                }
                nodes.next = previousnodes.next;
                previousnodes.next = nodes;
                if (index == size) {
                    tail = nodes;
                }
            }
            size++;
        }
        catch(Exception e) {
            throw new UnsupportedOperationException("Unimplemented method");
        }
        
    }
    @Override
    public void addSorted(I element) {
        //check
        NodesSetion<I> nodes = new NodesSetion<>(element);
        NodesSetion<I> p = null;
        NodesSetion<I> c = head;

        if (isEmpty() || element.compareTo(head.data) <= 0) {
            nodes.next = head;
            head = nodes;
        } 
        else {

            while (c != null && element.compareTo(c.data) > 0) {
                p = c;
                c = c.next;
            }

            nodes.next = c;
            if (p != null) {
                p.next = nodes;
            } 
            else {
                head = nodes;
            }
        }
        size++;
    }
    @Override
    public I get(int index) throws IndexOutOfBoundsException {
        try{
            int i;
            NodesSetion<I> find = head;
            for (i = 0; i < index; ++i) {
                find = find.next;
            }
            return find.data;
        }
        catch(Exception e) {
            throw new IndexOutOfBoundsException("Index is out of bounds... Try another number");
        }
    }
    @Override
    public I replace(I element, int index) throws IndexOutOfBoundsException {
        try {
            int i;
            NodesSetion<I> find = head;
            for (i = 0; i < index; i++) {
                find = find.next;
            }
            I oldstuff = find.data;
            find.data = element;
            return oldstuff;
        }
        catch(Exception e) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
            

    }
    @Override
    public I remove(int index) throws IndexOutOfBoundsException {
        try{
            int i;
            int last = index-1;
            I removedValue;
            if (index == 0) {
                removedValue = head.data;
                head = head.next;
            } 
            else {
                NodesSetion<I> h = head;
                for (i = 0; i < last; i++) {
                    h = h.next;
                }
                removedValue = h.next.data;
                h.next = h.next.next;
                if (index == size - 1) {
                    tail = h;
                }
            }
            size--;
            return removedValue;
        }
        catch(Exception e) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        
    }
    @Override
    public void removeAll() {
        size = 0;
        this.head = null;
        this.tail = null;
        /*
        NodesSetion<I> h = head;
        while (h != null) {
        System.out.print(h.data + " ");
        h = h.next;
        }
            System.out.println();
            */
    }

    public static void main(String[] args) {
        LinkedList arr = new LinkedList();
        arr.add(1);
         arr.add(1);
          arr.add(3);
           arr.add(2);
            arr.add(1);
            arr.remove(2);
            System.out.println(arr.replace(205, 2));
             arr.add(1);
              arr.add(1);
               arr.add(1);
                arr.add(1);
                 arr.add(1);
                  arr.add(1);
                   arr.add(1);
                   arr.remove(2);
                   //arr.addSorted(null);
                //System.out.println(arr.get(35));
                

    

    }

}