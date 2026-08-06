package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

public class CartPageTest extends BaseTest {
@Test
    public  void  emptyCartShouldBeDisplayed(){
    HomePage homePage = new HomePage(driver);
    CartPage cartPage = homePage.clickCartButton();
    Assert.assertTrue(cartPage.getCurrentlyUrl().contains("/cart"));
    Assert.assertTrue(cartPage.isCartTitleDisplayed());
    Assert.assertEquals(cartPage.getCartTitle(), "Корзина");
   // Assert.assertTrue(cartPage.isEmptyCartMessageDisplayed());
    //Assert.assertEquals(cartPage.getEmptyCartTitle(), "Корзина пустая");

}

}
