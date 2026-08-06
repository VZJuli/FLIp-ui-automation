package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.components.HeaderComponent;

public class WishlistPage extends HeaderComponent {
   // private WebDriver driver;
   public WishlistPage(WebDriver driver){
       super(driver);
   }
   private final By wishListTitle = By.tagName("h1");
   public String getCurrentlyUrl(){
       return driver.getCurrentUrl();
   }
   public boolean isWishListTitleDisplayed(){
       return driver.findElement(wishListTitle).isDisplayed();
   }
   public String getWishListTitle(){
       return driver.findElement(wishListTitle).getText();
   }
  // public  boolean productDisplayed(){
    //   return  driver.findElement(product).isDisplayed();
//   }

}
