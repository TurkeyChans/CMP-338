
public interface StackDriverInterface {
	
	
	
	/**
	 * 
	 * The <code>StackType</code> enum has the following values:
	 * <ol>
	 * <li>ArrayBasedStack</li>
	 * <li>LinkedStack</li>
	 * </ol>
	 *
	 */
	public static enum StackType {ArrayBasedStack, LinkedStack};

	
	
	/**
	 * 
	 * The <code>StackTestType</code> enum has the following values:
	 * <ol>
	 * <li>Push</li>
	 * <li>Pop</li>
	 * </ol>
	 *
	 */
	public static enum TestType {Push, Pop};

	
	
	/**
	 * 
	 * This method is used to create a new stack of the specified <b>stackType</b>. Depending on the 
	 * specified <b>stackTestType</b>, this method may need to initialize the queue with some entries.
	 * 
	 * @param stackType		This parameter specifies the type of stack to create. See the enum {@link StackType}.
	 * 
	 * @param stackTestType	This parameter specifies the type of test that the stack is being created for. See the enum
	 * {@link TestType}.
	 * 
	 * @return				The method will return the created stack as a StackInterface&lt;String&gt;.
	 * 
	 */
	public StackInterface<String> createStack(StackType stackType, TestType stackTestType);

	
	
	/**
	 *
	 * <p>
	 * This method is called to run a particular <b>testType</b> on a stack of type <b>stackType</b> for the specified 
	 * <b>numberOfTimes</b>. The test time and memory usage for each test is saved in the TestTimes class. 
	 * </p>
	 * 
	 * <p>
	 * This method repeats the following <code>numberOfTimes</code>:
	 * <ul>
	 * <li>
	 * Obtain and initialize a stack of type <b>stackType</b>
	 * </li>
	 * <li>
	 * Make a copy of the initialized stack
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
	 * Make a copy of stack after <b>testType</b> is completed
	 * </li>
	 * </ul>
	 * </p>
	 * 
	 * @param 	stackType		The type of stack needed for the test case. See the enum {@link StackType}.
	 * 
	 * @param 	testType	The type of test case being run. See the enum {@link TestType}.
	 * 
	 * @param 	numberOfTimes 	This parameter specifies the number of times to run the specified test.
	 * 
	 * 
	 * @return The method must return an array of <b>Object</b> containing the following:
	 * <ul>
	 * <li>
	 * array[0] - Must contain a copy of the initialized stack for the first test.
	 * </li>
	 * <li>
	 * array[1] - Must contain a copy of the stack after the first test.
	 * </li>
	 * <li>
	 * array[2] - Must contain a copy of the initialized stack for the second test.
	 * </li>
	 * <li>
	 * array[3] - Must contain a copy of the stack after the second test.
	 * </li>
	 * <li>
	 * ...
	 * </li>
	 * <li>
	 * array[numberOfTimes*2-2] - Must contain a copy of the initialized stack before for the last test.
	 * </li>
	 * <li>
	 * array[numberOfTimes*2-1] - Must contain a copy of the stack after the last test.
	 * </li>
	 * <li>
	 * array[numberOfTimes*2] - Must contain the TestTimes class that was used to save the measured test times and memory
	 * usages for the <b>testType</b> performed.
	 * </li>
	 * </ul> 
	 * 
	 */
	public Object[] runTestCase(StackType stackType, TestType testType, int numberOfTimes); 
	
	
	
}
