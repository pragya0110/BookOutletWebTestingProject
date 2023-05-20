package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageLocators {

    @FindBy(xpath = "//div[@class='flex-wrapper']//span")
    public List<WebElement> domainExtensionButtons;

    @FindBy(xpath = "//input[@id='search-keyword']")
    public WebElement searchBar;
}
