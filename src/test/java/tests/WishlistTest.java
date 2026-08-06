package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.WishlistPage;

public class WishlistTest extends BaseTest {
    @Test
    public void WishListPageShouldBeDisplayed(){
        HomePage homePage = new HomePage(driver);
        WishlistPage wishListPage = homePage.clickWishListButton();
        Assert.assertTrue(wishListPage.getCurrentlyUrl().contains("/favorites"));
       Assert.assertTrue(wishListPage.isWishListTitleDisplayed());

    }
}
