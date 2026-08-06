package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.CatalogPage;

public class CatalogPageTest extends BaseTest {

    @Test
    public void catalogButtonShouldBeDisplayed(){
        CatalogPage catalogPage = new CatalogPage(driver);
        Assert.assertTrue(catalogPage.isCatalogButtonDisplayed());
    }
    @Test
    public void shouldOpenCatalog(){
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.clickCatalogButton();
    }
    @Test
    public void shouldOpenCatalogPage(){
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.clickCatalogButton();
        Assert.assertTrue(catalogPage.isCatalogOpened());
    }
    @Ignore
    public  void shouldOpenFantasyCategory()  {
        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.clickCatalogButton();
        Assert.assertTrue(catalogPage.isCatalogOpened());
        catalogPage.hoverBooksCategory();
        catalogPage.clickFantasyCategory();
Assert.assertTrue(driver.getCurrentUrl().contains("subsection=134"));
    }
}
