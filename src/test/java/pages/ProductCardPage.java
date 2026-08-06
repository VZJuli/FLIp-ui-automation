package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.components.HeaderComponent;

public class ProductCardPage extends HeaderComponent {
    public ProductCardPage(WebDriver driver){
        super(driver);
    }
    private By productImage = By.cssSelector(".prod_img img");
    private By productName = By.cssSelector("h1");
    private By productPrice = By.cssSelector(".price.text-price");
    private By addToWishListButton =By.cssSelector("div[title='В избранное'");
    private By addToCartButton = By.cssSelector("button[data-cart-add]");

    public boolean productImageDisplayed(){
        return  driver.findElement(productImage).isDisplayed();
    }
    public boolean productNameDisplayed(){
        return  driver.findElement(productName).isDisplayed();
    }
    public boolean productPriceDisplayed(){
        return  driver.findElement(productPrice).isDisplayed();
    }
    public void clickAddToWishList(){
        driver.findElement(addToWishListButton).click();
    }
public void  clickAddToCart(){
        driver.findElement(addToCartButton).click();
}

    public void clickWishlist() {
        driver.findElement(wishListButton).click();
    }

    public void clickCart() {
        driver.findElement(cartButton).click();
    }
    public boolean isProductImageDisplayed(){
        return driver.findElement(productImage).isDisplayed();
    }
    public boolean isProductNameDisplayed(){
        return driver.findElement(productName).isDisplayed();
    }
    public boolean isProductPriceDisplayed(){
        return driver.findElement(productPrice).isDisplayed();
    }
}
