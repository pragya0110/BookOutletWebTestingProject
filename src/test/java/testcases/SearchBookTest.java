package testcases;

import annotation.Author;
import annotation.Category;
import annotation.TestName;
import base.Page;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.actions.SearchResultPage;

import java.util.List;
import reports.ExtendReport;


public class SearchBookTest extends ExtendReport {


    @BeforeClass
    public void setUp(){
        Page.initConfiguration();
    }

    /*@Test
    @Author(name="Pragya")
    @Category(name="Search")
    public void clearSearch() throws InterruptedException {
        test.info(" clear");
        Page.clear(Page.topNav.topNavigation.searchInput);
        Thread.sleep(5000);
    }*/

    //Verify that the search suggestions are displayed in real-time as the query is entered.
    @Test(description = "Verify that the search suggestions are displayed in real-time as the query is entered.")
    @TestName(name="Real Time Search SuggestionsTest")
    @Author(name="Pragya")
    @Category(name = {"Functional", "Smoke"})
    public void  realTimeSearchSuggestionsTest() {
        String str="Ali";
        String s="";
        for (char c : str.toCharArray()) {
            s=s+c;
            ExtendReport.testMap.get(Thread.currentThread().getId()).info("Entering"+s+"in search field");
            Page.topNav.enterSearchQuery(String.valueOf(c));
            Assert.assertTrue(Page.topNav.isSearchSuggestionDisplayed());
            ExtendReport.testMap.get(Thread.currentThread().getId()).info("Validating search suggestion contains "+s);
            Page.topNav.validateSearchSuggestion(s);
            ExtendReport.testMap.get(Thread.currentThread().getId()).log(Status.PASS,"search suggestion are displayed as expected");
        }
    }

    @Test(description = "Verify that the autocomplete suggestions are displayed")
    @TestName(name="Auto Suggestion Search Test")
    @Author(name="Pragya")
    @Category(name="Functional")
    public void autoSuggestionSearchTest(){
        String str="Strange";
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Setting search query to: " + str);
        Page.topNav.enterSearchQuery(str);
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Verifying search suggestions are displayed");
        Assert.assertTrue(Page.topNav.isSearchSuggestionDisplayed());
    }

    @Test(description = "Verify that the author names in the autosuggestion dropdown are displayed in alphabetical order.")
    @TestName(name="Author Name Suggestion Order Test")
    @Author(name="Pragya")
    @Category(name="Functional")
    public void  authorNameSuggestionOrderTest() {
        String str="Alice";
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Entering"+str+"in search field");
        Page.topNav.enterSearchQuery(str);
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("verifying whether author name in suggestion box in in alphabetical order)");
        Page.topNav.isOrderCorrect(Page.topNav.topNavigation.authorNameSuggestionList);

    }
    //Verify that the book titles in the autosuggestion dropdown are displayed in alphabetical order.
    @Test(description = "Verify that the book titles in the autosuggestion dropdown are displayed in alphabetical order.")
    @TestName(name="Book Title Suggestion Order Test")
    @Author(name="Pragya")
    @Category(name="Functional")
    public void  bookTitleSuggestionOrderTest() {
        String str="Alice";
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Entering"+str+"in search field");
        Page.topNav.enterSearchQuery(str);
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("verifying whether title name in suggestion box in in alphabetical order)");
        Page.topNav.isOrderCorrect(Page.topNav.topNavigation.productNameSuggestionList);

    }
    @Test(description = "Verify that the search results page displays books by the selected author.")
    @TestName(name="Select Author From Autosuggestion Test")
    @Author(name="Pragya")
    @Category(name="Functional")
    public void selectAuthorFromAutosuggestionTest() throws InterruptedException {
        String str="Alice";
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Entering"+str+"in search field");
        Page.topNav.enterSearchQuery(str);
        Thread.sleep(5000);
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Selected Alice Barker from author suggestion list");
        SearchResultPage searchResultPage=Page.topNav.clickFromSearchSuggestion("Alice Barker","author");
        Thread.sleep(5000);
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Verifying whether selected author get autopopulated in search field");
        Assert.assertEquals(Page.topNav.topNavigation.searchInput.getAttribute("value"),"Alice Barker");
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Verifying whether search result page displays books/series whose author is Alice Barker");
        searchResultPage.validateSearchResult("Alice Barker","author");
    }
    @Test(description = "Verify that the search results page displays books by the selected title.")
    @TestName(name="Select Title From Autosuggestion Test")
    @Author(name="Pragya")
    @Category(name="Functional")
    public void selectTitleFromAutosuggestionTest() throws InterruptedException {
        String str="Alice";
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Entering"+str+"in search field");
        Page.topNav.enterSearchQuery("Alice");
        Thread.sleep(5000);
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Selected Alice Adams from title suggestion list");
       SearchResultPage searchResultPage=Page.topNav.clickFromSearchSuggestion("Alice Adams: Portrait of a Writer","Title");
        Thread.sleep(5000);
        //Assert.assertEquals(Page.topNav.topNavigation.searchInput.getAttribute("value"),"Alice Knott");
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Verifying whether search result page displays books/series whose title is Alice Adams");
        searchResultPage.validateSearchResult("Alice Adams: Portrait of a Writer","Title");
    }

    @Test(description = "Verify that the search results page displays books by the selected keyword.")
    @TestName(name="Search By Keyword")
    @Author(name="Pragya")
    @Category(name="Functional")
    public void searchByKeyword() throws InterruptedException {
        String str="Alice";
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Entering"+str+"in search field");
        Page.topNav.enterSearchQuery("Alice");
        Thread.sleep(5000);
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("clicking on search button");
        SearchResultPage searchResultPage=Page.topNav.clickSearchButton();
        Thread.sleep(5000);
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("verifying search results contains keyword as"+str);
        searchResultPage.validateKeyword("Alice");
    }

    @Test(description = "Verify that the search results page displays error message for invalid search query.")
    @TestName(name="Invalid Search Query")
    @Author(name="Pragya")
    @Category(name="Functional")
    public void invalidSearchQuery() throws InterruptedException {
        String str="###";
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Entering"+str+"in search field");
        Page.topNav.enterSearchQuery("###");
        SearchResultPage searchResultPage=Page.topNav.clickSearchButton();
        Thread.sleep(5000);
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Verifying error message displayed on invalid search query");
        searchResultPage.checkErrorMsg();
    }

    @Test(description = "Verify that the search is case-insensitive and returns results regardless of the case used in the search query.")
    @TestName(name="Case Insensitivity Search Query")
    @Author(name="Pragya")
    @Category(name="Functional")
    public void caseInsensitivitySearchQuery() throws InterruptedException {
        String str="AlIce";
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Entering"+str+"in search field");
        Thread.sleep(5000);
        Page.topNav.enterSearchQuery(str);
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Verify whether search suggestion are displayed irrespective of uppercase or lowercase ");
        Page.topNav.validateSearchSuggestion("Alice");
    }

    @Test(description = "Verify that the search results page handles the special characters appropriately, returning relevant results.")
    @TestName(name="Special Character Search Query")
    @Author(name="Pragya")
    @Category(name="Functional")
    public void specialCharacterSearchQuery() throws InterruptedException {


        String actualInput = "Al1ice@#3!*&";
        String expectedInput = actualInput.replaceAll("[^a-zA-Z]", "");

        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Entering"+actualInput+"in search field");
        List<WebElement> actualAuthorsuggestionList=Page.topNav.searchSuggestionList(actualInput,"author");
        List<WebElement> actualTitleSuggestionList=Page.topNav.topNavigation.productNameSuggestionList;
        Thread.sleep(2000);
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Storing all search suggestion webelements in list for actualInput");

        List<WebElement> expectedAuthorsuggestionList=Page.topNav.searchSuggestionList(expectedInput,"author");
        List<WebElement> expectedTitlesuggestionList=Page.topNav.topNavigation.productNameSuggestionList;
        Thread.sleep(2000);
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Storing all search suggestion webelements in list for expectedInput");

        Assert.assertTrue(actualAuthorsuggestionList.equals(expectedAuthorsuggestionList));
        Assert.assertTrue(actualTitleSuggestionList.equals(expectedTitlesuggestionList));
        ExtendReport.testMap.get(Thread.currentThread().getId()).info("Comparing actual Suggestionlist and ExpectedSuggestionList");

    }
    @AfterClass
    public void tearDown(){
        if(Page.driver!=null){
            Page.quitBrowser();
        }
    }



}
