package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;

public class SearchPageTest extends BaseTest {
    @Test
    public void searchExistingProductTest(){
        HomePage homePage = new HomePage(driver);
        homePage.enterSearchText("Java");
        homePage.pressEnter();
        SearchPage searchPage = new SearchPage(driver);
        Assert.assertTrue(searchPage.getSearchTitle().equalsIgnoreCase("Java"));
    }
    @Test
    public void searchWithEmptyFieldTest(){
        HomePage homePage = new HomePage(driver);
        homePage.clearSearchInput();
        homePage.pressEnter();
        Assert.assertTrue(homePage.getPageTitle().contains("Flip"));
    }
}
