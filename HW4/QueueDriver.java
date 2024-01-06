import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class QueueDriver implements QueueDriverInterface {
    /*public enum TimeUnits {
        MicroSeconds, MilliSeconds, Seconds
    }
    
    public enum MemoryUnits {
        Bytes, KiloBytes, MegaBytes, GigaBytes
    }*/
    
    public static void main(String[] args) {
        QueueDriver test = new QueueDriver();
        QueueType q = QueueType.ArrayBasedQueue;
        TestType t = TestType.Enqueue;
        Object[] w = new Object[1000];
        test.runTestCase(q, t, 1);
        //
        //
        
    }
        
    

    @Override
    public QueueInterface<String> createQueue(QueueType queueType, TestType testType) {
        QueueInterface<String> queue = null;

        switch (queueType) {
            case ArrayBasedQueue:
                queue = new ArrayBasedQueue<String>();
                break;
            case LinkedQueue:
                queue = new LinkedQueue<String>();
                break;
        }

        if (queue != null) {
            int i;
            if (testType == TestType.Dequeue) {
                for (i = 1; i <= 10000; i++) {
                    queue.enqueue("String " + i);
                }
            } 
            else if (testType == TestType.DequeueRandom) {
                List<String> s = new ArrayList<>();
                for (i = 1; i <= 10000; i++) {
                    s.add("String " + i);
                }
                Collections.shuffle(s);
                for (i = 0; i < s.size(); i++) {
                    String string = s.get(i);
                    queue.enqueue(string);
                }
            }
        }

        return queue;
    }




    @Override
    public Object[] runTestCase(QueueType queueType, TestType queueTestType, int numberOfTimes) {
        Object[] result = new Object[numberOfTimes*2+1];
        int i,j;
        TestTimes testTimes = new TestTimes();
        for (i = 0; i < numberOfTimes; ++i) {
            QueueInterface<String> queue = createQueue(queueType, queueTestType);
            QueueInterface<String> copy = createQueue(queueType, queueTestType);
            long startTime = System.nanoTime();
            switch (queueTestType) {
                case Enqueue:
                    for (j = 0; j < 10000; ++j) {
                        queue.enqueue("String " + (j + 1));
                    }
                    break;
                case Dequeue:
                    for (j = 0; j < 10000; ++j) {
                        queue.dequeue();
                    }
                    break;
            }
            long endTime = System.nanoTime();
            long testTime = endTime - startTime;
            testTimes.addTestTime(testTime);
            result[i*2] = copy;
            result[i*2+1] = queue;
        }
        result[numberOfTimes*2] = testTimes;
        return result;
    }
}

        

        
