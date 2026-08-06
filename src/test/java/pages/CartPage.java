package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver = driver;
    }
    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
private final By cartTitle = By.tagName("h1");
    private final By emptyCartTitle = By.cssSelector(".cart-block h2");
    //private final  By emptyCartMessage = By.cssSelector(".cart-block p:nth-of-type(1)");
    public String getCurrentlyUrl(){
        return driver.getCurrentUrl();
    }
    public String getEmptyCartTitle(){
        return  driver.findElement(emptyCartTitle).getText();
    }
    public String getCartTitle(){
        return driver.findElement(cartTitle).getText();
    }
    //public String getEmptyCartMessage(){
        //return driver.findElement(emptyCartMessage).getText();
   // }
    public boolean isCartTitleDisplayed(){
        return  driver.findElement(cartTitle).isDisplayed();
    }
    //public boolean isEmptyCartMessageDisplayed(){
      //  return driver.findElement(emptyCartMessage).isDisplayed();
    //}
  //  public boolean productDisplayed(){
     //   return  driver.findElement(product).isDisplayed();
  //  }
}
