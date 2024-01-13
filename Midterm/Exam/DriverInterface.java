
/**
 * 
 * This is the DriverInterface for 
 * <a href="http://bit.ly/cmp338-f20-midterm">
 *    Midterm Exam
 * </a>
 * of CMP-338 in the Fall 2020 semester.
 * 
 * @author Sameh A. Fakhouri
 *
 */
public interface DriverInterface {
	
	/**
	 * 
	 * This <code>enum</code> is used to specify which test will be executed.
	 * 
	 * The <code>TestType</code> enum has the following choices:
	 * 							<dl>
	 * 								<dt>
	 * 									AddAllToFront
	 * 								</dt>
	 * 	                            <dd>
	 * 									Add all elements (1...1,000) in numerical order at the front of the DoubleEndedQueue
	 * 								</dd>
	 * 
	 * 
	 * 								<dt>
	 * 									AddAllToBack
	 * 								</dt>
	 * 	                            <dd>
	 * 									Add all elements (1...1,000) in numerical order at the back of the DoubleEndedQueue
	 * 								</dd>
	 * 
	 * 
	 * 								<dt>
	 * 									AddEvenFrontOddBack
	 * 								</dt>
	 * 	                            <dd>
	 * 									Add all elements (1...1,000) in numerical order with the even numbers added to the front of 
	 * 									the DoubleEndedQueue and the odd numbers added to the back of the DoubleEndedQueue.
	 * 								</dd>
	 * 							</dl>
	 *
	 */
	public static enum TestType {AddAllToFront, AddAllToBack, AddEvenFrontOddBack};
	
	/**
	 * 
	 * This method is called to populate your <code>DoubleEndedQueue&lt;Integer&gt;</code> class with
	 * instances of the <code>Integer</code> class representing the integers <b>from
	 * 1 to 1,000</b>. You will add the <code>Integer</code> instances in numerical order
	 * according to the specified <code>testType</code> 
	 *  
	 * @param 	testType		The type of test case being run. See the enum {@link TestType}.
	 * 
	 * @return	An instance of the resulting <code>DoubleEndedQueue&lt;Integer&gt;</code> class.
	 * 
	 */
	public DoubleEndedQueue<Integer> fillDoubleEndedQueue(TestType testType); 

}
