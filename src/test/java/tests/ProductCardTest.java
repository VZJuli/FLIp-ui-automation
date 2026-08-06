package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ProductCardTest extends BaseTest {

    @Test
    public void productCardDisplayedTest(){

        catalogPage.openProductCard();
        Assert.assertTrue(productCardPage.isProductImageDisplayed());
        Assert.assertTrue(productCardPage.isProductNameDisplayed());
        Assert.assertTrue(productCardPage.isProductPriceDisplayed());
    }

    @Test
    public void addProductToWishlistTest(){

        catalogPage.openProductCard();

        productCardPage.clickAddToWishList();
        productCardPage.clickWishlist();
        Assert.assertTrue(wishlistPage.isWishListTitleDisplayed());
        Assert.assertEquals(wishlistPage.getWishListTitle(),"Избранное");
    }

@Test
    public void addProductToCartTest(){

        catalogPage.openProductCard();
        productCardPage.clickAddToCart();
        productCardPage.clickCart();
    Assert.assertTrue(cartPage.isCartTitleDisplayed());
    Assert.assertEquals(cartPage.getCartTitle(),"Корзина");
}

}
