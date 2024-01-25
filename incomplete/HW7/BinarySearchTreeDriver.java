import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class BinarySearchTreeDriver implements BinarySearchTreeDriverInterface {
    private int size = 0;
    public BinarySearchTreeDriver() {
        this.size = 0;
    }
    @Override
    public Vector<Person<Integer>> createPersons(int numberOfPersons) {
        // TODO Auto-generated method stub
        int i;
        Vector<Person<Integer>> persons = new Vector<>(numberOfPersons);
    
        for (i = 1; i <= numberOfPersons; ++i) {
            persons.add(new Person<>(i));
        }
        
        Collections.shuffle(persons);
        return persons;
    }

    @Override
    public BinarySearchTree<Person<Integer>, Integer> createBinarySearchTree(TestType testType, Vector<Person<Integer>> persons) {
        return null; 
        
    }
    
   



    @Override
    public Object[] runTestCase(BinarySearchTreeDriverInterface.TestType testType, int numberOfPersons, int numberOfTimes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runTestCase'");
    }
    public static void main(String[] args) {
        BinarySearchTreeDriver bstd = new BinarySearchTreeDriver();
        System.out.println(bstd.createPersons(2));
        System.out.println(bstd.createPersons(3));
        System.out.println(bstd.createPersons(1));
        
        
    }
    
}
