package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import pages.components.HeaderComponent;

public class HomePage extends HeaderComponent {

    public HomePage(WebDriver driver){
        super(driver);
    }

public void  enterCity(String city){
        super.enterCity(city);
}
public void selectCity(){
        super.selectCity();
}
public String getSelectedCity(){
        return super.getSelectedCity();
}
    private final  By wishListButton = By.id("w_cart");
    public WishlistPage clickWishListButton(){
        driver.findElement(wishListButton).click();
        return new WishlistPage(driver);
    }

}

