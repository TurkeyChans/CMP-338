import java.util.List;
import java.util.ArrayList;

public class ListDriver implements ListDriverInterface {
    @Override  
	public ListInterface<Integer> createList(ListType listType,
            TestType forTestType) { {

		ListInterface<Integer> lising = null;
		
		switch(listType) {
			case LinkedList:
				lising = new LinkedList<Integer>();
				break;
			case ArrayBasedList:
				lising = new ArrayBasedList<Integer>();
				break;
		}
			
		switch (forTestType) {
		case AddSortedEven:
			lising = initializeList(lising, 1, 9999, 2);
			break;
		case RemoveAllEven:
			lising = initializeList(lising,1,10000,1);	
			break;
		case AddSortedOdd:
			lising = initializeList(lising,0,0,0);
			break;
		case RemoveAllOdd:
			lising = initializeList(lising,1,10000,1);
			break;
			
		case AddAll:
			lising = initializeList(lising,0,0,0);
			break;
			
		case AddAllAtIndexZero:
			lising = initializeList(lising,0,0,0);
			break;
		
		default:
			break;
		}
		
		
		return lising;
    }
	}
    
    public static void main(String[] args) {
        ListDriverInterface.ListType ArrayBasedList;
        ListDriverInterface.TestType AddSortedEven;
            ListDriver l = new ListDriver();/* 
        ListType r = ListType.ArrayBasedList;
        TestType b = TestType.AddSortedOdd;
        int count = 0;
        int max = 10;
        int i;
        int testtimess = 1;
        long totalTime;
        String[] testype = {"AddSortedOdd", "AddSortedEven", "AddAll", "AddAllAtIndexZero", "RemoveAllEven", "RemoveAllOdd"};
            
            for(int sr = 0; sr <= 5; ++sr) {
                System.out.print("Running test = " + testype[count]);
                count++;
                System.out.println();
            for(i = 0; i <= 9; ++i) {
                if(i == 0) {
                    System.out.print("        ");
                }
                
                
                System.out.print("Run " + testtimess + "");
                
                testtimess++;
                if(testtimess >= 11) {
                    testtimess = 1;
                }
                if(i <= 8 && i >= 0) {
                    System.out.print("        ");
                }
        
            }
            System.out.print("         Average  ");
            System.out.print("   Memory Usage");
            System.out.println("");
            for(i = 0; i <= 9; ++i) {
                System.out.print("       ");
                System.out.print("Seconds  ");
            } 
            System.out.print("       Seconds  ");
            System.out.print("   Mega Bytes");
            System.out.println("");
            for(i = 0; i <= 10; ++i) {
                System.out.print("       ");
                System.out.print("-------  ");
            }
            System.out.print("   ------------  ");
            System.out.println("");
            System.out.print("ArrayBasedList  "); 
            System.out.println("");
            System.out.print("LinkedList        ");
            System.out.println("");
            System.out.println("");
            */
            System.out.print(l.runTestCase(ListType.LinkedList.ArrayBasedList, TestType.AddSortedEven, 5));
           
        }


    


    @Override
    public ListInterface<Integer> initializeList(ListInterface<Integer> list, int firstNumber, int lastNumber, int increment) {
        int i = firstNumber;
        if(increment == 0) {
            return list;
        }
        else {
            while (i <= lastNumber) {
                list.add(i);
                i += increment;
            }
            return list;
        }
    }

    @Override
    public double memoryUsage() {
        Runtime time = Runtime.getRuntime();
        long memory = time.totalMemory() - time.freeMemory();
        double memoryMB = memory / (1024.0 * 1024.0);
        return memoryMB;
    }

    public Object[] runTestCase(ListType listType, TestType testType, int numberOfTimes) {
        return null;
    }
    


}


   
