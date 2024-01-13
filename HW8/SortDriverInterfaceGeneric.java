/**
 * 
 * @author Sameh A. Fakhouri
 *
 */
public interface SortDriverInterfaceGeneric {

	/**
	 * This <code>enum</code> is used to specify the type of Array. All arrays used in this
	 * assignment will be arrays of <b>Integer</b>:
	 * 
	 * <ol>
	 * <li>Equal - The elements in the array are all equal.</li>
	 * <li>Random - The elements in the array are randomly generated.</li>
	 * <li>Increasing - The elements of the array are arranged in increasing order.</li>
	 * <li>Decreasing - The elements of the array are arranged in decreasing order.</li>
	 * <li>IncreasingAndRandom - The first 90% of the elements are arranged in increasing order and the last 10%
	 * of the elements are randomly generated.</li>
	 * </ol>
	 *
	 */
	public static enum ArrayType {Equal, Random, Increasing, Decreasing, IncreasingAndRandom};
	
	/**
	 * This <code>enum</code> is used to specify the desired sort algorithm:
	 * 
	 * <ol>
	 * <li>MergeSort - Indicates the Merge Sort algorithm.</li>
	 * <li>QuickSort - Indicates the Quick Sort algorithm.</li>
	 * <li>HeapSort - Indicates the Heap Sort algorithm.</li>
	 * </ol>
	 *
	 */
	public static enum SortType {MergeSort, QuickSortFirstElement, QuickSortRandomElement, QuickSortMidOfFirstMidLastElement, HeapSort};
	
	/**
	 * 
	 * This method is used to create a new array of <b>Integer</b> objects of the type and size
	 * specified.
	 * 
	 * @param arrayType	This parameter specifies the type of array to create. See the enum {@link ArrayType}.
	 * 
	 * @param arraySize This parameter specifies the size of array to create.
	 * 
	 * @return	The method will return the array of <b>Integer</b> objects that was created.
	 * 
	 */
	public Integer[] createArray(ArrayType arrayType, int arraySize);
	
	/**
	 *
	 * <p>
	 * This method will run the <b>sortType</b> for <b>numberOfTimes</b>. 
	 * </p>
	 * 
	 * <p>
	 * This method repeats the following <code>numberOfTimes</code>:
	 * <ul>
	 * <li>
	 * Obtain an array of type <b>arrayType</b>
	 * </li>
	 * <li>
	 * Make a copy of the array you obtained
	 * </li>
	 * <li>
	 * Capture <b>startTime</b>
	 * </li>
	 * <li>
	 * Call the appropriate sort 
	 * </li>
	 * <li>
	 * Capture <b>endTime</b>
	 * </li>
	 * <li>
	 * Calculate <b>testTime</b> and add it to your TestTimes class 
	 * </li>
	 * <li>
	 * Make a copy of the sorted array
	 * </li>
	 * </ul>
	 * </p>
	 * 
	 * @param sortType This parameter specifies the sort algorithm that will be used. See the enum {@link SortType}.
	 * 
	 * @param arrayType This parameter specifies the type of array to create each time the sort is run. 
	 * See the enum {@link ArrayType}.
	 * 
	 * @param arraySize This parameter specifies the size of array to create each time the sort is run.
	 * 
	 * @param numberOfTimes This parameter specifies the number of times to run the specified sort.
	 * 
	 * @return The method must return an array of <b>Object</b> containing the following:
	 * <ul>
	 * <li>
	 * array[0] - Must contain a copy of the unsorted array for first test.
	 * </li>
	 * <li>
	 * array[1] - Must contain a copy of the sorted array for first test.
	 * </li>
	 * <li>
	 * array[2] - Must contain a copy of the unsorted array for second test.
	 * </li>
	 * <li>
	 * array[3] - Must contain a copy of the sorted array for second test.
	 * </li>
	 * <li>
	 * ...
	 * </li>
	 * <li>
	 * array[numberOfTimes*2-2] - Must contain a copy of the unsorted array for the last test.
	 * </li>
	 * <li>
	 * array[numberOfTimes*2-1] - Must contain a copy of the sorted array for the last test.
	 * </li>
	 * <li>
	 * array[numberOfTimes*2] - Must contain the TestTimes class that was used to save the measured test times for the sorts performed.
	 * </li>
	 * </ul> 
	 * 
	 */
	public Object[] runSort(SortType sortType, ArrayType arrayType, int arraySize, int numberOfTimes);

}
