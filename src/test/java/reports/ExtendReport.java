package reports;

import annotation.Author;
import annotation.Category;
import annotation.TestName;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.util.concurrent.ConcurrentHashMap;


public class ExtendReport implements ITestListener {

    public ExtentReports extent;
    public static ConcurrentHashMap<Long, ExtentTest> testMap = new ConcurrentHashMap<Long, ExtentTest>();
    public ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        //test = extent.createTest("Test");


    }
    @Override
    public void onTestStart(ITestResult result) {
        TestName testNameAnnotation = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(TestName.class);
        String testName = testNameAnnotation != null ? testNameAnnotation.name() : result.getName();
        test = extent.createTest(testName);
        testMap.put(Thread.currentThread().getId(), test);

        String description = result.getMethod().getDescription();
        test.info(description);

        // Assign author
        Author authorAnnotation = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Author.class);
        if (authorAnnotation != null) {
            test.assignAuthor(authorAnnotation.name());
        }

        // Assign category
        Category categoryAnnotation = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Category.class);
        if (categoryAnnotation != null) {
            test.assignCategory(categoryAnnotation.name());
        }
    }
    @Override
    public void onTestSuccess(ITestResult result) {

        test.log(Status.PASS,"Passed");
    }


    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
