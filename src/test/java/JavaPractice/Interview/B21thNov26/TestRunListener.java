package JavaPractice.Interview.B21thNov26;

import org.testng.IExecutionListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.concurrent.atomic.AtomicInteger;

public class TestRunListener implements IExecutionListener, ITestListener {
    private final AtomicInteger testNumber = new AtomicInteger();

    @Override
    public void onExecutionStart() {
        System.out.println("Starting B21thNov26 test program");
    }

    @Override
    public void onTestStart(ITestResult result) {
        int number = testNumber.incrementAndGet();
        String testName = result.getTestClass().getName() + "." + result.getMethod().getMethodName();
        System.out.println("Test #" + number + ": " + testName);
    }
}
