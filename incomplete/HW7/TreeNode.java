public class TreeNode <E extends KeyedElementInterface<K>,K extends java.lang.Comparable<? super K>> {
    private E element = null;
    private TreeNode<E,K> leftChild = null;
    private TreeNode<E,K> parent = null;
    private TreeNode<E,K> rightChild = null;
    public  TreeNode(E element) {
    this.element = element;
    this.leftChild = null;
    this.parent = null;
    this.rightChild = null;
    }
    public E getElement() {
        return element;
    }
    public TreeNode<E, K> getLeftChild() {
        return leftChild;
    }
    public TreeNode<E, K> getParent() {
        return parent;
    }
    public TreeNode<E, K> getRightChild() {
        return rightChild;
    }
    public void setElement(E element) {
        this.element = element;
    }
    public void setLeftChild(TreeNode<E, K> leftChild) {
        this.leftChild = leftChild;
    }
    public void setParent(TreeNode<E, K> parent) {
        this.parent = parent;
    }
    public void setRightChild(TreeNode<E, K> rightChild) {
        this.rightChild = rightChild;
    }
    
}
