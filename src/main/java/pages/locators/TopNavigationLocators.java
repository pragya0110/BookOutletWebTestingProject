package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopNavigationLocators {
    @FindBy(xpath = "//input[@type='text']")
    public WebElement searchInput;

    @FindBy(xpath = "//div[@class='jss56 in']")
    public WebElement searchSuggestionBox;
    @FindBy(xpath = "/div[@id='header-search-input']//ul[@class='search-autocomplete']//li")
    public List<WebElement> searchSuggestionItems;

    @FindBy(xpath = "//span[contains(text(),'I Agree')]")
    public WebElement cookiesAccept;

    @FindBy(xpath = "//button[@aria-label='clear search terms']//span[@class='MuiIconButton-label']")
    public WebElement crossButton;

    @FindBy(xpath="//nav[@aria-label='author search suggestions']/div")
    public List<WebElement> authorNameSuggestionList;

    @FindBy(xpath="//nav[@aria-label='product search suggestions']/div")
    public List<WebElement> productNameSuggestionList;

}
