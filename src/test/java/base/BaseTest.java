package base;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected CatalogPage catalogPage;
    protected ProductCardPage productCardPage;
    protected WishlistPage wishlistPage;
    protected CartPage cartPage;
    protected SearchPage searchPage;


    @BeforeMethod
    public void setUP() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flip.kz/");
        homePage = new HomePage(driver);
        catalogPage = new CatalogPage(driver);
        productCardPage = new ProductCardPage(driver);
        wishlistPage = new WishlistPage(driver);
        cartPage = new CartPage(driver);
        searchPage = new SearchPage(driver);
    }
@AfterMethod
    public void tearDown(){
        driver.quit();
}
}
