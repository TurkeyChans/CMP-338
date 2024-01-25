import java.util.Vector;

public interface BinarySearchTreeDriverInterface {

	
	/**
	 * 
	 * This <code>enum</code> is used to specify which test scenario will be executed.
	 * 
	 * The <code>TestType</code> enum has the following choices:
	 * 							<ol>
	 * 								<li>Insert</li>
	 * 								<li>Find</li>
 	 * 								<li>Delete</li>
 	 * 								<li>Balance</li>
 	 * 								<li>FindBalanced</li>
 	 * 								<li>DeleteBalanced</li>
	 * 							</ol>
	 *
	 */
	public static enum TestType {Insert, Find, Delete, Balance, FindBalanced, DeleteBalanced};
	
	
	
	/**
	 * 
	 * <p>
	 * This method is used to obtain a <b>Vector&lt;Person&lt;Integer&gt;&gt;</b> with 
	 * <code>Person&lt;Integer&gt;</code> objects.
	 * </p>
	 * 
	 * @param numberOfPersons	The number of persons to create
	 * 
	 * @return	Returns a <b>Vector&lt;Person&lt;Integer&gt;&gt;</b> containing 
	 * <b>numberOfPersons</b> <code>Person&lt;Integer&gt;</code> objects.
	 * 
	 */
	public Vector<Person<Integer>> createPersons(int numberOfPersons);
	
	
	/**
	 * 
	 * This method will create a new BinarySearchTree&lt;Person&lt;Integer&gt;, Integer&gt; for the specified 
	 * TestType.
	 * 
	 * @param testType	The type of test for the created BinarySearchTree.
	 * 					<dl>
	 * 						<dt>
	 * 							Insert
	 * 						</dt>
	 * 						<dd>
	 * 							The returned BinarySearchTree must be empty
	 * 						</dd>
	 * 						<dt>
	 * 							Find
	 * 						</dt>
	 * 						<dd>
	 * 							The returned BinarySearchTree must contain 131,071 <code>Person&lt;Integer&gt;</code>
	 * 							objects obtained from @link createPersons}
	 * 						</dd>
	 * 						<dt>
	 * 							Delete
	 * 						</dt>
	 * 						<dd>
	 * 							The returned BinarySearchTree must contain 131,071 <code>Person&lt;Integer&gt;</code>
	 * 							objects obtained from @link createPersons}
	 * 						</dd>
	 * 						<dt>
	 * 							Balance
	 * 						</dt>
	 * 						<dd>
	 * 							The returned BinarySearchTree must contain 131,071 <code>Person&lt;Integer&gt;</code>
	 * 							objects obtained from @link createPersons}
	 * 						</dd>
	 * 						<dt>
	 * 							FindBalanced
	 * 						</dt>
	 * 						<dd>
	 * 							The returned BinarySearchTree must be <b>balanced</b> and must contain 131,071 <code>Person&lt;Integer&gt;</code>
	 * 							objects obtained from @link createPersons}
	 * 						</dd>
	 * 						<dt>
	 * 							DeleteBalanced
	 * 						</dt>
	 * 						<dd>
	 * 							The returned BinarySearchTree must be <b>balanced</b> and must contain 131,071 <code>Person&lt;Integer&gt;</code>
	 * 							objects obtained from @link createPersons}
	 * 						</dd>
	 * 					</dl>
	 * 
	 * @return	A reference to BinarySearchTree that TestType.
	 * 
	 */
	public BinarySearchTree<Person<Integer>, Integer> createBinarySearchTree(TestType testType, Vector<Person<Integer>> persons);

	
	
	/**
	 * 
	 *
	 * <p>
	 * This method is called to run a particular <b>testType</b> on a <b>BinarySearchTree</b> for the specified 
	 * <b>numberOfTimes</b>. 
	 * </p>
	 * 
	 * <p>
	 * This method repeats the following <code>numberOfTimes</code>:
	 * <ul>
	 * <li>
	 * Obtain and initialize a BinarySearchTree for the <b>testType</b>
	 * </li>
	 * <li>
	 * Make a copy of the initialized BinarySearchTree
	 * </li>
	 * <li>
	 * Run the specified <b>testType</b> 
	 * </li>
	 * <li>
	 * Capture <b>endTime</b>
	 * </li>
	 * <li>
	 * Calculate <b>testTime</b> and add it to your TestTimes class 
	 * </li>
	 * <li>
	 * Make a copy of BinarySearchTree after <b>testType</b> is completed
	 * </li>
	 * </ul>
	 * </p>
	 * 
	 * @param testType		The test type to be run.
	 * 
	 * @param numberOfTimes The type of test case being run. See the enum {@link TestType}.
	 *
	 * 
	 * @return The method must return an array of <b>Object</b> containing the following:
	 * <ul>
	 * <li>
	 * array[0] - Must contain a copy of the initialized BinarySearchTree for the first test.
	 * </li>
	 * <li>
	 * array[1] - Must contain a copy of the BinarySearchTree after the first test.
	 * </li>
	 * <li>
	 * array[2] - Must contain a copy of the initialized BinarySearchTree for the second test.
	 * </li>
	 * <li>
	 * array[3] - Must contain a copy of the BinarySearchTree after the second test.
	 * </li>
	 * <li>
	 * ...
	 * </li>
	 * <li>
	 * array[numberOfTimes*2-2] - Must contain a copy of the initialized BinarySearchTree before for the last test.
	 * </li>
	 * <li>
	 * array[numberOfTimes*2-1] - Must contain a copy of the BinarySearchTree after the last test.
	 * </li>
	 * <li>
	 * array[numberOfTimes*2] - Must contain the TestTimes class that was used to save the measured test times and memory
	 * usages for the <b>testType</b> performed.
	 * </li>
	 * </ul> 
	 *
	 */
	public Object[] runTestCase(TestType testType, int numberOfPersons, int numberOfTimes);

}
