import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class hometest extends setupselenium {

        homepage home;
        @BeforeMethod

                void setuptest(){
            setupdriver("https://amazon.com");

            home = PageFactory.initElements(driver,homepage.class);
        }
              @Test
        void topdealtest(){
            String Actualtest = home.topdealtext();

            Assert.assertEquals(Actualtest,"Top Deal");
        }

    }

