package base;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    private static FileInputStream fis;
    private static Logger log = Logger.getLogger(TestBase.class);
    public static FileInputStream file ;
    public static XSSFWorkbook workbook ;
    public static Sheet sheet ;
    @BeforeSuite
    public void setUp() throws IOException {
        // loading the log file
        PropertyConfigurator.configure("./src/main/resources/properties/log4j.properties");


    }

    @AfterSuite
    public void tearDown() {
        log.info("Test Execution completed !!!");
    }
}
