package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


    public class SearchResultPageLocators {

        @FindBy(xpath = "//div[@class='empty-search-result']//p")
        public WebElement errorMessage;

        @FindBy(xpath = "//ul[@class='result-items']//li")
        public List<WebElement> searchResultItems;

        @FindBy(xpath="//div[contains(@class,'MuiGrid-grid-xs-true')]/p[2]//strong")
        public List<WebElement> getSearchResultAuthors;

        @FindBy(xpath="//div[contains(@class,'MuiGrid-grid-xs-true')]/p[1]")
        public List<WebElement> getSearchResultTitle;

        @FindBy(xpath = "//div[contains(@class,'MuiGrid-grid-md-4')]//a/div/div[2]")
        public List<WebElement> searchResultInfo;

        @FindBy(xpath = "//h3[contains(@class,'h3')]")
        public WebElement errorMsg;
    }


