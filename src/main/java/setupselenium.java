import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class setupselenium {
    WebDriver driver;

    void setupdriver(String url) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);



    }
    void moveMouse(WebDriver dr, WebElement element){
        Actions actions = new Actions(dr);
        actions.moveToElement(element).perform();
    }

    public void ScrollDown(WebDriver dr, String script) {
        JavascriptExecutor js = ((JavascriptExecutor) dr);
        js.executeScript(script);
    }
    void selectDropdown(WebElement element,int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    void quitBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    void selectdropDown(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    void movemouse(WebElement element){

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

}