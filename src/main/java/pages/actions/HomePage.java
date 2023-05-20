package pages.actions;

import base.Page;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.HomePageLocators;


public class HomePage extends Page {

    public HomePageLocators home;
    public HomePage(){

        this.home = new HomePageLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory, this.home);

    }



    /*public void selectDomainExtension(String domainExtension) {
        for (WebElement button : home.domainExtensionButtons) {
            if (button.getText().equalsIgnoreCase(domainExtension)) {
                Page.click(button);
                break;
            }
        }
    }
    public String getSearchBarInput(){
        return home.searchBar.getAttribute("value");
    }*/


}
