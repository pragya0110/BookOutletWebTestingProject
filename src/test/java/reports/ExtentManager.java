package reports;


import base.Page;
import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class ExtentManager extends Page {

    private static ExtentReports extent;

    public static ExtentReports createInstance() {

        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("MyReport");


        /*htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle("DomainNameProject");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("FunctionalTesting");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Automation Tester", "Pragya");
        extent.setSystemInfo("Build no", "T-1001");*/


        return extent;
    }


    public static String screenshotPath;
    public static String screenshotName;

    public static void captureScreenshot() {

        TakesScreenshot scrshots= (TakesScreenshot) driver;
        File scrFile=scrshots.getScreenshotAs(OutputType.FILE);

        Date d = new Date();
        screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

        screenshotPath=".//" + screenshotName;
        try {
            FileUtils.copyFile(scrFile, new File(".//" + screenshotName));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }


}

