package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.actions.TopNavigation;


public class Page {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static String browser;
    public static TopNavigation topNav;
    public static void initConfiguration(){

        if(Constants.browser.equals("firefox")){

            driver = new FirefoxDriver();
        }else if(Constants.browser.equals("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
        }
        //System.setProperty("log4j.configurationFile", "./src/main/resources/log4j.xml");
        driver.get(Constants.testsiteurl);
        driver.manage().window().maximize();
        topNav = new TopNavigation(driver);
        //driver.findElement(By.xpath("//span[contains(text(),'I Agree')]")).click();

    }
    public static void click(WebElement element) {
        element.click();
    }
    public static void clear(WebElement element) {
        element.clear();
    }
    public static void type(WebElement element, String value) {
        element.sendKeys(value);
    }
    public static void quitBrowser(){
        driver.quit();
    }


}

