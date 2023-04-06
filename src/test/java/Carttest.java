import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Carttest extends setupselenium {
    Carttest cart;
    @BeforeMethod

    public void openbrowser(){
        setupdriver("https://www.jcpenney.com/cart");
        cart = PageFactory.initElements(driver,Carttest.class);

    }
    @Test

    public void testcartbutton(){

        cart.setupdriver("https://www.jcpenney.com/cart");
    }
}
