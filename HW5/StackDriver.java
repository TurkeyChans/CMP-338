public class StackDriver implements StackDriverInterface{
    private double[] kilosA = new double[11];
    private double[] kilosL = new double[11];
    private double savekilosA;
    private double savekilosL;

   
    
    public static void main(String[] args) {
        StackDriver test = new StackDriver();
        String s = "Push";
        String tester = "ArrayBasedStack";
        test.printer_Micro(s,tester);
        test.test_run_ArrayBasedStack(StackType.ArrayBasedStack, TestType.Push, 10);
        System.out.println();
        System.out.print("LinkedStack     ");
        test.test_run_ArrayBasedStack(StackType.LinkedStack, TestType.Push, 10);
        System.out.println();
        test.printer_Kilos(s, tester);
        for(int i = 1; i < test.kilosA.length; ++i) {
            System.out.print(test.kilosA[i] + " ");
        }
        System.out.println(test.savekilosA);
        System.out.print("LinkedStack     ");
        for(int i = 1; i < test.kilosL.length; ++i) {
            System.out.print(test.kilosL[i] + " ");
        }
        System.out.println(test.savekilosL);
        s = "Pop";
        test.printer_Micro(s,tester);
        test.test_run_ArrayBasedStack(StackType.ArrayBasedStack, TestType.Pop, 10);
        System.out.println();
        System.out.print("LinkedStack     ");
        test.test_run_ArrayBasedStack(StackType.LinkedStack, TestType.Pop, 10);
        System.out.println();
        test.printer_Kilos(s, tester);
        for(int i = 1; i < test.kilosA.length; ++i) {
            System.out.print(test.kilosA[i] + " ");
        }
        System.out.println(test.savekilosA);
        System.out.print("LinkedStack     ");
        for(int i = 1; i < test.kilosL.length; ++i) {
            System.out.print(test.kilosL[i] + " ");
        }
        System.out.println(test.savekilosL);

        Object[] sss = new Object[test.runTestCase(StackType.ArrayBasedStack, TestType.Pop, 10).length];
        sss = test.runTestCase(StackType.ArrayBasedStack, TestType.Pop, 10);
        for(int i = 0; i < sss.length; ++i) {
            System.out.print(sss[i].toString() + " ");
        }
    }
    
    
    
    
    @Override
    public StackInterface<String> createStack(StackDriverInterface.StackType stackType, StackDriverInterface.TestType stackTestType) {
        StackInterface<String> stack = null;

        switch (stackType) {
            case ArrayBasedStack:
                stack = new ArrayBasedStack<String>();
                break;
            case LinkedStack:
                stack = new LinkedStack<String>();
                break;
        }

        if (stack != null) {
            int i;
            if (stackTestType == TestType.Pop) {
                for (i = 1; i <= 10000; i++) {
                    stack.push("String " + i);
                }
            } 
        }
        return stack;
    }

    public Object[] runTestCase(StackDriverInterface.StackType stackType, StackDriverInterface.TestType testType, int numberOfTimes) {
        Object[] result = new Object[numberOfTimes*2+1];
        int i,j;
        TestTimes testTimes = new TestTimes();
        for (i = 0; i < numberOfTimes; ++i) {
            StackInterface<String> stack = createStack(stackType, testType);
            StackInterface<String> copy = createStack(stackType, testType);
            long startTime = System.nanoTime();
            switch (testType) {
                case Push:
                    for (j = 0; j < 10000; ++j) {
                        stack.push("String " + (j + 1));
                    }
                    break;
                case Pop:
                    for (j = 0; j < 10000; ++j) {
                        stack.pop();
                    }
                    break;
            }
            long endTime = System.nanoTime();
            long testTime = endTime - startTime;
            testTimes.addTestTime(testTime);
            result[i*2] = copy;
            result[i*2+1] = stack;
        }
        result[numberOfTimes*2] = testTimes;
        return result;
    }
    public void printer_Micro(String s, String Tester) {
        System.out.println("Test Type = " + s);
        System.out.println("                   Run 1      Run 2      Run 3      Run 4      Run 5      Run 6      Run 7      Run 8      Run 9      Run 10    Average");
        System.out.println("                   Micro      Micro      Micro      Micro      Micro      Micro      Micro      Micro      Micro      Micro      Micro ");
        System.out.println("                  Seconds    Seconds    Seconds    Seconds    Seconds    Seconds    Seconds    Seconds    Seconds    Seconds    Seconds\r" + "\r" + "");
        System.out.println("                ---------- ---------- ---------- ---------- ----------- ---------- ---------- ---------- ---------- --------- ----------\r" + "\r" + "");
        System.out.print(Tester + " ");
       
    }
    public void printer_Kilos(String s, String Tester) {
        System.out.println("Test Type = " + s);
        System.out.println("                   Run 1      Run 2      Run 3      Run 4      Run 5      Run 6      Run 7      Run 8      Run 9      Run 10    Average");
        System.out.println("                   Kilo       Kilo       Kilo       Kilo       Kilo       Kilo       Kilo       Kilo       Kilo       Kilo       Kilo ");
        System.out.println("                  Bytes      Bytes      Bytes      Bytes      Bytes      Bytes      Bytes      Bytes      Bytes      Bytes      Bytes \r" + "\r" + "");
        System.out.println("                ---------- ---------- ---------- ---------- ----------- ---------- ---------- ---------- ---------- --------- ----------\r" + "\r" + "");
        System.out.print(Tester + " ");
       
    }
    

    public void test_run_ArrayBasedStack(StackType type, TestType testing, int num) {
        StackDriver driver = new StackDriver();
        long totalTime = 0;
        for (int i = 1; i <= 10; ++i) {
            long startTime = System.nanoTime();
            driver.runTestCase(type, testing, num);
            long endTime = System.nanoTime();
            long testTime = endTime - startTime;
            double ans = testTime / 1000.0;
            if(type == StackType.ArrayBasedStack) {
                kilosA[i] = ans / 1024.0;
            }
            else {
                kilosL[i] = ans / 1024.0;
            }
            System.out.print(ans + "  ");
            totalTime += testTime;
        }
       
       
        double ave = totalTime / 10.0;
        if(type == StackType.ArrayBasedStack) {
            savekilosA = ave / 1024.0;
        }
        else {
            savekilosL = ave / 1024.0;
        }
        System.out.print(ave);

        
    }
    

    
    
        
    
    
    
    
}
