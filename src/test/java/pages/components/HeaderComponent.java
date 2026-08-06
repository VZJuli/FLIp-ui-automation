package pages.components;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CartPage;
import org.openqa.selenium.interactions.Actions;
import pages.WishlistPage;

import javax.swing.*;
import java.time.Duration;

public class HeaderComponent {
    protected  WebDriver driver;

    private  final By searchInput = By.id("search_input");
    public void enterSearchText(String text){

        driver.findElement(searchInput).sendKeys(text);
    }
    public void pressEnter(){

        driver.findElement(searchInput).sendKeys(Keys.ENTER);
    }
    public String getPageTitle(){

        return driver.getTitle();
    }
    public boolean isSearchInputDisplayed(){

        return driver.findElement(searchInput).isDisplayed();
    }
    public void clearSearchInput(){

        driver.findElement(searchInput).clear();
    }
    public String getSearchText(){

        return driver.findElement(searchInput).getAttribute("value");
    }
    protected By logo = By.className("logo");
    public boolean isLogoDisplayed(){

        return driver.findElement(logo).isDisplayed();
    }
    protected By catalogButton = By.cssSelector("div.menu.hover-effect");
    public boolean isCatalogButtonDisplayed(){

        return driver.findElement(catalogButton).isDisplayed();
    }
    protected   By wishListButton = By.id("w_cart");
    public boolean isWishListButtonDisplayed(){

        return driver.findElement(wishListButton).isDisplayed();
    }
    protected By cartButton = By.cssSelector("a[href='/cart']");
    public boolean isCartButtonDisplayed(){

        return driver.findElement(cartButton).isDisplayed();
    }


    public CartPage clickCartButton(){
        driver.findElement(cartButton).click();
        return new CartPage(driver);
    }
    protected final By cityButton = By.id("location-selected");
    public void clickCityButton(){
        driver.findElement(cityButton).click();
    }
    protected final By citySearchInput = By.id("locationSearch");
    public boolean isCitySearchDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds (5));
        WebElement input= wait.until(ExpectedConditions.visibilityOfElementLocated(citySearchInput));

        return input.isDisplayed();

    }
    protected final By cityResult = By.xpath("//span[text()='Алматы']");

    public void enterCity(String city){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(citySearchInput));
       // input.click();
        input.clear();
        input.sendKeys(city);
    }

    public void selectCity() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(cityResult)).click();
    }
     public String getSelectedCity(){
        return driver.findElement(cityButton).getText();
    }
    protected Actions actions;
    public HeaderComponent(WebDriver driver){
        this.driver=driver;
        actions = new Actions(driver);
    }


}
