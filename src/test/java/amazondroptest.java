import Project.amazondrop;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazondroptest extends setupselenium {

    amazondrop Amazon ;
    @BeforeMethod
    void setUpTest()  {
        setupdriver("https://amazon.com/");
        Amazon = PageFactory.initElements(driver, amazondrop.class);
    }
    @Test
    void validateCategory() throws InterruptedException {

    }
    @Test
    void validatecategory() throws InterruptedException {
        amazondrop.selectcategory();
        Thread.sleep(10000);
    }
    @Test
    void volidatecategory() throws InterruptedException {
        amazondrop.selectcategory();
        Thread.sleep(3000);


    }
    @Test
    void searchb1(){

    }


}
