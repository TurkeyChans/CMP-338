
/**
 * 
 * @author Sameh A. Fakhouri
 *
 */
public interface ListDriverInterface {
	
	/**
	 * 
	 * This <code>enum</code> is used to specify which list implementation to use. All list implementations 
	 * used in this assignment will be lists of <b>Integer</b>:
	 * 
	 * The <code>ListType</code> enum has the following choices:
	 * 							<ol>
	 * 								<li>ArrayBasedList</li>
	 * 								<li>LinkedList</li>
	 * 							</ol>
	 *
	 */
	public static enum ListType {ArrayBasedList, LinkedList};


	
	/**
	 * 
	 * This <code>enum</code> is used to specify which test scenario will be executed.
	 * 
	 * The <code>TestType</code> enum has the following choices:
	 * 							<ol>
	 * 								<li>AddSortedOdd</li>
	 * 								<li>AddSortedEven</li>
	 * 								<li>AddAll</li>
	 * 								<li>AddAllAtIndexZero</li>
	 * 								<li>RemoveAllEven</li>
 	 * 								<li>RemoveAllOdd</li>
	 * 							</ol>
	 *
	 */
	public static enum TestType {AddSortedOdd, AddSortedEven, AddAll, AddAllAtIndexZero, RemoveAllEven, RemoveAllOdd};
 
	
	
	
	/**
	 * 
	 * This method is used to create a new list of the specified <b>listType</b>. 
	 * If the specified <b>testType</b> requires the list to be initialized to contain some elements, 
	 * this method will make a call to <code>initializeList</code> to populate the list with the required elements.
	 * <br>
	 * <dl>
	 * <dt>
	 * AddSortedOdd
	 * </dt>
	 * <dd>
	 * For this test case, this method will return an empty list.
	 * </dd>
	 * <dt>
	 * AddSortedEven
	 * </dt>
	 * <dd>
	 * For this test case, this method will call initializeList to populate the list with all the odd numbers from 1 to 9,999
	 * before returning the list.
	 * </dd>
	 * <dt>
	 * AddAll
	 * </dt>
	 * <dd>
	 * For this test case, this method will return an empty list.
	 * </dd>
	 * <dt>
	 * AddAllAtIndexZero
	 * </dt>
	 * <dd>
	 * For this test case, this method will return an empty list.
	 * </dd>
	 * <dt>
	 * RemoveAllEven
	 * </dt>
	 * <dd>
	 * For this test case, this method will call initializeList to populate the list with all the odd numbers from 1 to 10,000
	 * before returning the list.
	 * </dd>
	 * <dt>
	 * RemoveAllOdd
	 * </dt>
	 * <dd>
	 * For this test case, this method will call initializeList to populate the list with all the odd numbers from 1 to 10,000
	 * before returning the list.
	 * </dd>
	 * </dl>
	 * 
	 * See {@link #initializeList(ListInterface, int, int, int)}
	 * 
	 * @param listType		This parameter specifies the type of list to create. See the enum {@link ListType}.
	 * 
	 * @param forTestType 	This parameter specifies the type of test that the list is being created for. See the enum
	 * {@link TestType}. 
	 * 
	 * @return	The method will return the created list as a ListInterface.
	 * 
	 */
	public ListInterface<Integer> createList(ListType listType, TestType forTestType);
	

	
	/**
	 * 
	 * This method is called by the createList() method to initialize the list with the required elements.
	 * The list could either be an ArrayList or a LinkedList. This method will add <code>Integer</code> objects
	 * starting with <code>firstNumber</code> and ending with <code>lastNumber</code> incrementing each time by
	 * <code>increment</code>. Please note that when the increment == 0, this method does not add anything to the
	 * list.  
	 * 
	 * @param 	list		The list to be initialized.
	 * @param 	firstNumber	The first number to be added to the list.
	 * @param 	lastNumber	The last number to be added to the list
	 * @param 	increment	The increment to be used by the for loop for each iteration. If the increment is zero, this
	 * method will not add anything to the list.
	 * 
	 * @return	The initialized list.
	 * 
	 */
	public ListInterface<Integer> initializeList(ListInterface<Integer> list,  int firstNumber, int lastNumber, int increment);

	
	
	/**
	 * 
	 * This method is used to calculate the amount of memory being used in the JVM currently.
	 * 
	 * @return	a <code>double</code> representing the amount of memory in megabytes currently allocated in
	 * 			the JVM. Please note that you must convert from kilobytes to megabytes.
	 */
	public double memoryUsage();

	
	
	/**
	 *
	 * <p>
	 * This method will run the <b>testType</b> on a list of type <b>listType</b> for <b>numberOfTimes</b>. 
	 * </p>
	 * 
	 * <p>
	 * This method repeats the following <code>numberOfTimes</code>:
	 * <ul>
	 * <li>
	 * Obtain and initialize a list of type <b>listType</b>
	 * </li>
	 * <li>
	 * Make a copy of the initialized list
	 * </li>
	 * <li>
	 * Capture <b>startTime</b>
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
	 * Make a copy of list after <b>testType</b> is completed
	 * </li>
	 * </ul>
	 * </p>
	 *
	 * @param 	listType		The type of list needed. See the enum {@link ListType}.
	 * 
	 * @param 	testType		The type of test case being run. See the enum {@link TestType}.
	 * 
	 * @param 	numberOfTimes 	This parameter specifies the number of times to run the specified test.
	 * 
	 * @return The method must return an array of <b>Object</b> containing the following:
	 * <ul>
	 * <li>
	 * array[0] - Must contain a copy of the initialized list for the first test.
	 * </li>
	 * <li>
	 * array[1] - Must contain a copy of the list after the first test.
	 * </li>
	 * <li>
	 * array[2] - Must contain a copy of the initialized list for the second test.
	 * </li>
	 * <li>
	 * array[3] - Must contain a copy of the list after the second test.
	 * </li>
	 * <li>
	 * ...
	 * </li>
	 * <li>
	 * array[numberOfTimes*2-2] - Must contain a copy of the initialized list before for the last test.
	 * </li>
	 * <li>
	 * array[numberOfTimes*2-1] - Must contain a copy of the list after the last test.
	 * </li>
	 * <li>
	 * array[numberOfTimes*2] - Must contain the TestTimes class that was used to save the measured test times for the sorts performed.
	 * </li>
	 * </ul> 
	 * 
	 */
	public Object[] runTestCase(ListType listType, TestType testType, int numberOfTimes); 

}
