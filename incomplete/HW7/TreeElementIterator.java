import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

public class TreeElementIterator<E extends KeyedElementInterface<K>, K extends java.lang.Comparable<? super K>> extends java.lang.Object implements java.util.Iterator<E>{


    private Vector<E> elements;
    private int currentIndex;
    private BinarySearchTree<E, K> bst;
    private Vector<TreeNode<E, K>> tree;
    private int size;


    public TreeElementIterator(BinarySearchTree<E, K> binary) {
        this.bst = binary;
        this.tree = new Vector<>();
        setInOrder(); 
        this.size = tree.size();
        this.currentIndex = 0;
    }

    public int size() {
        if(isEmpty()) {
            return 0;
        }
        else {
            return size;
        }
    }

    public boolean isEmpty() {
        return tree.isEmpty() || currentIndex >= tree.size();
    }
    

    /*public TreeElementIterator(Vector<E> elements) {
        this.elements = elements;
        currentIndex = 0;
    }*/

    public boolean hasNext() {
        return this.currentIndex < tree.size();
    }

    public E next() throws NoSuchElementException {
      
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the iterator");
        }
        return tree.get(this.currentIndex++).getElement();
    }

    public void setPreOrder() {
		tree.clear();
		preOrder(this.bst.getRoot());
        size = tree.size();
	}
	
	public void setInOrder() {
        tree.clear();
        inOrder(this.bst.getRoot());
        size = tree.size();
	}
	
	public void setPostOrder() {
        tree.clear();		
        postOrder(this.bst.getRoot());
        size = tree.size();
	}

    private void preOrder(TreeNode<E, K> treeNode) {
        if (treeNode != null) {
            tree.add(treeNode);
            size++;
            preOrder(treeNode.getLeftChild());
            preOrder(treeNode.getRightChild());
        }
    }

    private void inOrder(TreeNode<E, K> treeNode) {
        if (treeNode != null) {
            inOrder(treeNode.getLeftChild());
            tree.add(treeNode);
            size++;
            inOrder(treeNode.getRightChild());
        }
    }

    private void postOrder(TreeNode<E, K> treeNode) {
        if (treeNode != null) {
            postOrder(treeNode.getLeftChild());
            postOrder(treeNode.getRightChild());
            tree.add(treeNode);
            size++;
        }
    }
    public static void main(String[] args) {
        //BinarySearchTree<, Integer> bst = new BinarySearchTree<>();
    


        






    }
}
