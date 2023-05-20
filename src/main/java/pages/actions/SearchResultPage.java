package pages.actions;

import base.Page;
import org.apache.poi.ss.usermodel.ExtendedColor;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.SearchResultPageLocators;

public class SearchResultPage extends Page{

    public SearchResultPageLocators searchResult;

    public SearchResultPage() {

        this.searchResult = new SearchResultPageLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this.searchResult);

    }

    public void validateSearchResult(String query, String category) {
        int lastIndexOf = query.lastIndexOf(" ");
        String transformedQuery = query.substring(lastIndexOf + 1, query.length())
                + ", " + query.substring(0, lastIndexOf);
        if (category.equalsIgnoreCase("Author")) {
            for (WebElement result : searchResult.getSearchResultAuthors) {
                Assert.assertEquals(transformedQuery, result.getText());
            }
        } else {
            for (WebElement result : searchResult.getSearchResultTitle) {
                Assert.assertEquals(result.getText(), query);
            }
        }
    }
    public void validateKeyword(String str){
        for(WebElement element:searchResult.searchResultInfo){
            System.out.println(element.getText());

            Assert.assertTrue(element.getText().contains(str));
        }
    }
    public void checkErrorMsg(){
        Assert.assertTrue(searchResult.errorMsg.isDisplayed());
        Assert.assertEquals("not match", "NO MATCHES FOUND",searchResult.errorMsg.getText());
    }

    /*public boolean isErrorMessageDisplayed(){
        return searchResult.errorMessage.isDisplayed();
    }
    public boolean isSearchResultDisplayed(){
        return searchResult.searchResultItems.size()>0;
    }*/


}
