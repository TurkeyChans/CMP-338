public class LinearSearch implements SearchInterface{

    @Override
    public int search(int[] listOfNumbers, int target) {
        for(int i = 0; i < listOfNumbers.length; i++) {
            if(listOfNumbers[i] == target) {
                return i;
            }
        }    
        return -1;
    }
    
}
