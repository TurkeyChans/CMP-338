public class SearchDriver implements SearchDriverInterface{
    @Override
    public int[] getListOfNumbers() {
        int[] testing = new int[10000000];
        int i;
        for(i = 0; i < 10000000; ++i) {
            testing[i] = i + 1;
        }
        return testing;
    }

    @Override
    public int[] getTargets() {
        int[] testing = new int[] {500, 10000, 100000, 1000000, 5000000, 7500000, 10000000};
        return testing;
    }

    @Override
    public TestTimes runLinearSearch(int[] listOfNumbers, int target, int numberOfTimes) {
        LinearSearch Search = new LinearSearch();
        TestTimes Times = new TestTimes();
        for(int i = 0; i < numberOfTimes; ++i) {
            long startTime = System.nanoTime();
            Search.search(listOfNumbers, target);
            long endTime = System.nanoTime();
            Times.addTestTime(endTime - startTime);
        }
        return Times;
    }

    @Override
    public TestTimes runBinarySearch(int[] listOfNumbers, int target, int numberOfTimes) {
        BinarySearch Search = new BinarySearch();
        TestTimes Times = new TestTimes();
        for(int i = 0; i < numberOfTimes; ++i) {
            long startTime = System.nanoTime();
            Search.search(listOfNumbers, target);
            long endTime = System.nanoTime();
            Times.addTestTime(endTime - startTime);
        }
        return Times;
    }
    
}
