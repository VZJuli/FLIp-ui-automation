package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import org.testng.Assert;
import pages.CartPage;

public class HomePageTest extends BaseTest {
    private HomePage homePage;

    @Test
    public void openHomePageTest() {
        HomePage homePage = new HomePage(driver);
        homePage.enterSearchText("Java");

    }
    @Test
    public void searchProductTest(){
        HomePage homePage = new HomePage(driver);
        homePage.enterSearchText("Java");
        homePage.pressEnter();

        Assert.assertTrue(homePage.getPageTitle().contains("Java"));
    }
    @Test
    public void searchInputIsDisplayedTest(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isSearchInputDisplayed());
    }
    @Test
    public void enteredTextIsCorrectTest(){
        HomePage homePage = new HomePage(driver);
        homePage.enterSearchText("Java");
        Assert.assertEquals(homePage.getSearchText(),"Java");
    }
    @Test
    public void verifyLogoIsDisplayed(){
        homePage =new HomePage(driver);
        Assert.assertTrue(homePage.isLogoDisplayed());

    }
    @Test
    public void verifyCatalogButtonIsDisplayed(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isCatalogButtonDisplayed());
    }
    @Test
    public void verifyWishListButtonIsDisplayed(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isWishListButtonDisplayed());
    }
    @Test
    public void  cartPageShouldOpenWhenCartButtonClicked(){
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = homePage.clickCartButton();
        Assert.assertTrue(cartPage.getCurrentUrl().contains("/cart"));
    }
  @Test
    public void citySelectionWindowShouldOpen(){
        HomePage homePage = new HomePage(driver);
        homePage.clickCityButton();
        Assert.assertTrue(homePage.isCitySearchDisplayed());
  }
//@Test
   // public void cityShouldBeSelectedAfterSearch(){
      //  HomePage homePage = new HomePage(driver);
       // homePage.clickCityButton();
        //homePage.enterCity("Алматы");
    // homePage.selectCity();
   // Assert.assertEquals(homePage.getSelectedCity(),"Алматы");
//}
}

