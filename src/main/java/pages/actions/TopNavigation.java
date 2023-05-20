package pages.actions;


import base.Page;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.TopNavigationLocators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TopNavigation{
    public TopNavigationLocators topNavigation;
    public SearchResultPage searchPage;
    public TopNavigation(WebDriver driver){

        this.topNavigation = new TopNavigationLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory, this.topNavigation);
        Page.click(topNavigation.cookiesAccept);
    }

    public void enterSearchQuery(String searchQuery) {
        if(topNavigation.crossButton.isDisplayed()){
            Page.click(topNavigation.crossButton);
        }
        Page.type(topNavigation.searchInput,searchQuery );
    }
    public void clearSearch(){
        Page.click(topNavigation.crossButton);
    }


    public boolean isSearchSuggestionDisplayed(){
        return topNavigation.searchSuggestionBox.isDisplayed();
    }
    public List<WebElement> listOfSearchSuggestion(){
        return topNavigation.searchSuggestionItems;
    }
    public SearchResultPage clickSearchButton() {
        Page.type(topNavigation.searchInput, String.valueOf(Keys.ENTER));
        return new SearchResultPage();
    }
    public SearchResultPage clickFromSearchSuggestion(String query,String category) throws InterruptedException {
        List<WebElement> list;
        if(category.equalsIgnoreCase("author")){list=topNavigation.authorNameSuggestionList;}
        else { list=topNavigation.productNameSuggestionList;}
        for(WebElement element:list){
            if(element.getText().contains(query)){
                Page.click(element);
                break;
            }
        }
        return new SearchResultPage();
    }
    public boolean isOrderCorrect(List<WebElement> webElementList){
        List<String> list=new ArrayList<>();
        for(WebElement element:webElementList){
            list.add(element.getText());
        }
        HashSet<String> hashSet=new HashSet<>(list);

        return list.equals(new ArrayList<>(hashSet));

    }

    public void validateSearchSuggestion(String str){

        for(WebElement element:Page.topNav.listOfSearchSuggestion())
        {
            Assert.assertTrue(element.getText().contains(str));
        }
    }
   public List<WebElement> searchSuggestionList(String searchQuery,String category){
       enterSearchQuery(searchQuery);
       if(category.equalsIgnoreCase("author")){
           return topNavigation.authorNameSuggestionList;
       }
       else{
           return topNavigation.productNameSuggestionList;
       }
   }



    /*public BulkSearchPage gotoBulkSearch() throws InterruptedException {
        Page.click(topNavigation.domainMenuDropdown);
        Page.click(topNavigation.bulkSearchSubmenu);
        Page.click(topNavigation.acceptCookies);
        Thread.sleep(5000);
        try{
            Page.click(topNavigation.recaptcha);
        }finally{
            return new BulkSearchPage();
        }
    }*/


}

