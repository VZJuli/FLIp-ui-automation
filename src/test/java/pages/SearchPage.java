package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
        public SearchPage(WebDriver driver){

            this.driver = driver;
        }
        private  final By searchTitle = By.tagName("h1");
        public String getSearchTitle(){
            return driver.findElement(searchTitle).getText();
        }
}
