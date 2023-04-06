import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class hometest extends setupselenium{
     homepage home;
    @BeforeMethod
   void setUpTest(){
        setupdriver ("https://www.jcpenney.com/");
    home = PageFactory.initElements(driver,homepage.class);

   }
   @Test
    void Clickmen(){
        home.Mentext();

        String actualsUrl = driver.getCurrentUrl();
       // Assert.assertEquals(actualsUrl,"https://www.jcpenney.com/g/men/mens-big-tall?id=cat1009640001#:~:text=Women-,Men,-Young%20Adult");
    }
    @Test
    void ClickTrending(){

        home.Trendingpage();
        String actualsUrl = driver.getCurrentUrl();
    }
    @Test
    void ClickHome(){
        home.Homepage();
        String actualsUrl = driver.getCurrentUrl();
    }
    @Test
    void ClickWomen(){

        home.Womenpage();
        String actualsUrl = driver.getCurrentUrl();
    }
    @Test
    void WomenText(){
        home.WomenText();
        String WomenText = home.Women.getText();

    }
    @Test
    void Scerchbar(){
        home.SearchBar();
        String actualsUrl = driver.getCurrentUrl();
    }
    @Test
    void Searchbartest() throws InterruptedException {

        home.SearchBar1();
        Thread.sleep(3000);
    }
    @Test
    void Mycart(){
        home.mycart();
       String actualsUrl = driver.getCurrentUrl();
    }

    @Test
    void mycartpage(){
        home.mycart();
        String actualsUrl= driver.getCurrentUrl();
    }
    @Test
    void Account(){
        home.account();
        String actualsUrl = driver.getCurrentUrl();
    }
    @Test
    void Accounttext(){
      //  String actualsText = home.accountext();
      //  Assert.assertEquals(actualsText,"My Account sign in");
    }



    @Test
    void Cheakingcareer(){
        boolean a = home.CheakingCareers(driver);
        Assert.assertTrue(a);

    }
    @Test
    void careertest() throws InterruptedException {
        home.careers1();
        Thread.sleep(3000);
    }
    @Test
    void Sale(){
        home.Sale();
        String sale = driver.getCurrentUrl();

        }

        @Test
        void Sale1() throws InterruptedException {


         home.Sale1();

         Thread.sleep(3000);
        }
     @Test
    void JCpennylogo(){
        home.JCpennylogo();
        String Jcpenny = driver.getCurrentUrl();
     }
     @Test
     void JCpennylogo1(){
        home.JCpennylogo();
     }
     @Test
    void SignUp(){

        home.SignUp();
        System.out.equals(driver.getCurrentUrl());
     }
     @Test
    void Shoes(){


         home.Shoes();
        String Shoes = driver.getCurrentUrl();
     }
     @Test
     void Shoestest(){
        home.ShoesPage();
     }

     @Test
    void Jewlery (){
        home.Jewlery();
         driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        System.out.equals(driver.getCurrentUrl());
     }
     @Test
     void Jewlerytest(){
        home.Jewlery();
     }
     @Test
    void Handbags(){
        home.Handbags();
         driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        String Handbags = driver.getCurrentUrl();
     }
     @Test
    void Handbagstest(){
         driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        home.Handbagspage();

     }
     @Test
     void clickHandbags() throws InterruptedException {
        home.ClickHanbag();
        Thread.sleep(4000);
        driver.quit();
     }
     @Test
     void handbagtext(){

        String actuaalsText = home.Handbagtext();
   //    driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
      //  Assert.assertEquals(actuaalsText,"Handbags");

     }

     @Test
    void MothersDay() {
         String actualText = home.MothersDaytext();
         String Mothersday = home.MothersDaytext();

     }
     @Test
    void MothersDay1(){

        String MothersDay = driver.getCurrentUrl();
         }
         @Test

       void testTwitterlogo(){
        String movemouse = driver.getCurrentUrl();


       // Assert.assertTrue(home.movemouse();
    }
    @Test
    void search() throws InterruptedException {
        home.searchBar.sendKeys("Shirt");
        Thread.sleep(5000);
    }


   @Test

    void MyAccount() throws InterruptedException {

        home.myaccount.click();
        Thread.sleep(3000);
        driver.quit();
   }
   @Test
    void Youngadult() throws InterruptedException {
        home.YoungAdult.click();
        Thread.sleep(3000);
        driver.quit();
   }
   @Test
    void YoungAdult() throws InterruptedException {
        home.Youngadult();
        Thread.sleep(3000);
        driver.quit();
   }

   @Test
  void BEAUTYsalon() throws InterruptedException {
        String salon = driver.getCurrentUrl();
        Thread.sleep(3000);
        driver.quit();
   }


   @Test
    void KIDS() throws InterruptedException {
        home.ClickKIds();
        Thread.sleep(3000);
        driver.quit();

   }
   @Test
    void Signuptest() throws InterruptedException {
        home.SIGNUP.sendKeys("new1238@gmail.com");
        home.SIGNUP.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
   }
















     }

















