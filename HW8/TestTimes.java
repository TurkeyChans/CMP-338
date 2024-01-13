import java.util.Arrays;
/*I am considering enrolling in winter classes and would like to know if my leftover spring financial aid can be applied to cover the associated costs. Could you please provide information on the specific policies related to this scenario and any eligibility criteria that may be relevant?

 */
public class TestTimes implements TestTimesInterface {
    
    private double[] testTimes = new double[10];
    private double[] testTime2 = new double[10];
    private int index = 0;
    private TimeUnits timeUnits = TimeUnits.Seconds;
    private MemoryUnits memoryUnits = MemoryUnits.Bytes;

    public void addTestTime(long runTime) {
        long startTime = System.nanoTime();
        double temp;
        double temp2;
        int i;

        if (index == 10) {
            temp = testTimes[9];
            testTimes[9] = runTime;
            temp2 = testTimes[8];
            testTimes[8] = temp;
            temp = testTimes[7];
            testTimes[7] = temp2;
            temp2 = testTimes[6];
            testTimes[6] = temp;
            temp = testTimes[5];
            testTimes[5] = temp2;
            temp2 = testTimes[4];
            testTimes[4] = temp;
            temp = testTimes[3];
            testTimes[3] = temp2;
            temp2 = testTimes[2];
            testTimes[2] = temp;
            temp = testTimes[1];
            testTimes[1] = temp2;
            temp2 = testTimes[0];
            testTimes[0] = temp;

            long endMemory = getUsedMemory();
            long memoryUsage = endMemory - startMemory;

            temp = testTime2[9];
            testTime2[9] = memoryUsage;
            temp2 = testTime2[8];
            testTime2[8] = temp;
            temp = testTime2[7];
            testTime2[7] = temp2;
            temp2 = testTime2[6];
            testTime2[6] = temp;
            temp = testTime2[5];
            testTime2[5] = temp2;
            temp2 = testTime2[4];
            testTime2[4] = temp;
            temp = testTime2[3];
            testTime2[3] = temp2;
            temp2 = testTime2[2];
            testTime2[2] = temp;
            temp = testTime2[1];
            testTime2[1] = temp2;
            temp2 = testTime2[0];
            testTime2[0] = temp;
        } 
        else {
            testTimes[index] = runTime;
            long endMemory = getUsedMemory();
            long memoryUsage = endMemory - startMemory;
            testTime2[index] = memoryUsage;
            index++;
        }

        long endTime = System.nanoTime();
        runTime = endTime - startTime;
    }
    

    @Override
    public double getAverageTestTime() {
        double sum = 0;
        int i;
        for (i = 0; i < index; i++) {
            sum += testTimes[i];
        }
        double meanRunTime = sum / index;

        switch (timeUnits) {
            case Seconds:
                return meanRunTime / 1000000000;  
            case MilliSeconds:
                return meanRunTime / 1000000;  
            case MicroSeconds:
                return meanRunTime / 1000;
            default:
                return meanRunTime;
        }
    }

    @Override
    public double getLastTestTime() {
        double lastRunTime = testTimes[index-1];
        return convertToUnits(lastRunTime, timeUnits);
    }

    @Override
    public double[] getTestTimes() {
        double[] convertedTestTimes = Arrays.copyOf(testTimes, 10);
        int i;
        for (i = 0; i < 10; i++) {
            convertedTestTimes[i] = convertToUnits(testTimes[i], timeUnits);
        }
        return convertedTestTimes;
    }

    @Override
    public void resetTestTimes() {
        testTimes = new double[10];
        testTime2 = new double[10];
        index = 0;
    }

    @Override
    public TimeUnits getTimeUnits() {
        return timeUnits;
    }

    @Override
    public void setTimeUnits(TimeUnits timeUnits) {
        this.timeUnits = timeUnits;
    }

    @Override
    public MemoryUnits getMemoryUnits() {
        return memoryUnits;
    }

    @Override
    public void setMemoryUnits(MemoryUnits memoryUnits) {
        this.memoryUnits = memoryUnits;
    }

    public double getLastMemoryUsage() {
		if (this.memoryUnits == MemoryUnits.KiloBytes) {
			return (testTime2[this.index-1]) / 1024;
		} 
        else if (this.memoryUnits == MemoryUnits.MegaBytes) {
			return (testTime2[this.index-1]) / 1048576;
		} 
        else {
			return testTime2[this.index-1];
		}

	}

    @Override
    public double[] getMemoryUsages() {
        int i;
        if (this.memoryUnits == MemoryUnits.KiloBytes) {
			double[] kiloArray = new double[10];
			for (i = 0; i < 10; i++) {
				kiloArray[i] = (this.testTime2[i]) / 1024;
			}
			return kiloArray;
		}

		else if (this.memoryUnits == MemoryUnits.MegaBytes) {
			double[] megArray = new double[10];
			for (i = 0; i < 10; i++) {
				megArray[i] = (this.testTime2[i]) / 1048576;
			}
			return megArray;
		}
        else {
            return testTime2;
        }	
	}


    @Override
    public double getAverageMemoryUsage() {
        double sum = 0;
        int i;
        for (i = 0; i < index; ++i) {
            sum += testTime2[i];
        }
        double meanMemoryUsage = sum / index;

        switch (memoryUnits) {
            case KiloBytes:
                return meanMemoryUsage / 1024;  
            case MegaBytes:
                return meanMemoryUsage / 1048576;  
            default:
                return meanMemoryUsage;
        }
    }
    private long startMemory;

    private long getUsedMemory() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    private double convertToUnits(double value, TimeUnits units) {
        switch (units) {
            case Seconds:
                return value / 1000000000;  
            case MilliSeconds:
                return value / 1000000;  
            case MicroSeconds:
                return value / 1000;  
            default:
                return value;
        }
    }
    public static void main(String[] args) {
        TestTimes Arr = new TestTimes();
        Arr.addTestTime(10);
        Arr.addTestTime(10);
        Arr.addTestTime(10);
        Arr.addTestTime(10);
        Arr.addTestTime(10);
        Arr.addTestTime(10);
        Arr.addTestTime(10);
        Arr.addTestTime(10);
        //System.out.print(Arr.getMemoryUsages());
        //System.out.print(Arr.getAverageTestTime());
    }
}
