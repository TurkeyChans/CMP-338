public class Driver implements DriverInterface {

    @Override
    public DoubleEndedQueue<Integer> fillDoubleEndedQueue(DriverInterface.TestType testType) {
        DoubleEndedQueue<Integer> ans = new DoubleEndedQueue<>();
        int i;
        String s = "String ";
        int save = 0;
        int a,f;
        
        switch (testType) {
            case AddAllToFront:
                for (i = 1; i <= 1000; ++i) {
                    ans.addFront(i);
                }
                break;
            case AddAllToBack:
                for (i = 1; i <= 1000; ++i) {
                    ans.addBack(i);
                }
                break;
            case AddEvenFrontOddBack:
                for (i = 1; i <= 1000; ++i) {
                    if (i % 2 == 0) {
                        ans.addFront(i);
                    } 
                    else {
                        ans.addBack(i);
                    }
                }
                break;
        }

        return ans;
    }
    public static void main(String[] args) {
        //Driver test = new Driver();
        //test.fillDoubleEndedQueue(TestType.AddEvenFrontOddBack);
    }
    
}
