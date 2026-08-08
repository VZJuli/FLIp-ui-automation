package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.components.HeaderComponent;
import java.time.Duration;



public class CatalogPage extends HeaderComponent {
    public CatalogPage (WebDriver driver){
        super(driver);
    }
    private final By catalogButton = By.cssSelector("div.menu.hover-effect");
    public boolean isCatalogButtonDisplayed(){
        return driver.findElement(catalogButton).isDisplayed();
    }
    public void clickCatalogButton(){
        driver.findElement(catalogButton).click();
    }
    private final By catalogOpened = By.className("category-list");
    public boolean isCatalogOpened(){
        return driver.findElement(catalogOpened).isDisplayed();
    }
    private final By booksCategory = By.xpath("//a[contains(@class,'condent') and .//div[normalize-space()='Книги']]");
    public void hoverBooksCategory(){
       // WebElement books = driver.findElement(booksCategory);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // WebElement books = wait.until(ExpectedConditions.elementToBeClickable(booksCategory));
        WebElement books = wait.until(ExpectedConditions.visibilityOfElementLocated(booksCategory));
        actions.moveToElement(books).perform();
    }
    private final By fantasyCategory = By.xpath("//a[@href='/catalog?subsection=134' and normalize-space()='Фантастика. Мистика']");
    public  void  clickFantasyCategory(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fantasy = wait.until(ExpectedConditions.visibilityOfElementLocated(fantasyCategory));
       // fantasy.click();
        actions.moveToElement(fantasy)
                .click()
                .perform();

    }
    private final By productCard = By.xpath("//a[contains(.,'Когда родилась луна')]");
    public  void openProductCard(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(productCard));
        //driver.findElement(productCard).click();
        product.click();
    }
}
