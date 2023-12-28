public class BinarySearch implements SearchInterface{

    @Override
    public int search(int[] listOfNumbers, int target) {
        int mid = 0;
        int low = 0;
        int high = listOfNumbers.length - 1;
   
    while (high >= low) {
    mid = (high + low) / 2;
    if (listOfNumbers[mid] < target) {
        low = mid + 1;
    }
    else if(listOfNumbers[mid] > target) {
        high = mid - 1;
    }
    else {
        return mid;
    }
    

    }
    return -1;
    
}
}
