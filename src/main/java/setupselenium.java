
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class setupselenium {
    static WebDriver driver;
    static void setupdriver(String url) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

         driver = new ChromeDriver();

        driver.get(url);



    }

}
