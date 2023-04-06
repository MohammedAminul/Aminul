import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import javax.xml.xpath.XPath;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class homepage  extends setupselenium {
    @FindBy(xpath = "//*[@id=\"subMenuLevel1\"]/li[4]/div")

    WebElement men;

    void Mentext() {
        men.click();

    }


    @FindBy(xpath = "//*[@id=\"subMenuLevel1\"]/li[1]/div")
    WebElement Trending;

    void Trendingpage() {
        Trending.click();
    }

    @FindBy(xpath = "//*[@id=\"subMenuLevel1\"]/li[2]/div")
    WebElement Home;

    void Homepage() {

        Home.click();
    }

    @FindBy(xpath = "//*[@id=\"subMenuLevel1\"]/li[3]/div")
    WebElement Women;

    void Womenpage() {

        Women.isDisplayed();
    }void WomenText(){
        Women.click();
    }

    @FindBy(xpath = "//*[@id=\"typeaheadInputContainer\"]/div/button")
    WebElement Searchbar;

    void SearchBar() {

        Searchbar.sendKeys("Babycloth");
    }
    boolean SearchBar1(){
        return Searchbar.isDisplayed();
    }

    @FindBy(xpath = "//*[@id=\"ctaBlock\"]/div[3]/div/a/div")
    WebElement Mycart;

    void mycart() {
        Mycart.click();


    }
    boolean mycartpage(){
        return Mycart.isDisplayed();
    }



    @FindBy(xpath = "//*[@id=\"accountBlock\"]/div/div/div/button")
    WebElement Account;

    void account() {
        Account.click();


    }
    String accouttext(){
        return Account.getText();
    }

    @FindBy(xpath = "//*[@id=\"footer\"]/div[2]/div[1]/div/article/section/div[4]/div/div/ul/li[1]/a")
    WebElement careers;

    boolean careers1(){

        return careers.isDisplayed();
    }


    @FindBy(xpath = "//*[@id=\"footer\"]/div[2]/div[1]/div/article/section")
    List<WebElement> Trackmyorder;

    @FindBy(xpath = "//*[@id=\"subMenuLevel1\"]/li[10]/div")
    WebElement Sale;

    void Sale() {

        Sale.click();
    }
    boolean Sale1(){
        return Sale.isDisplayed();
    }

    @FindBy(xpath = "//button[@title=\"search\"]")

    WebElement search;

    void search() {
        search.click();

    }


    @FindBy(xpath = "//a[@data-automation-id=\"jcp-logo\"]")

    WebElement JCpennylogo;

    void JCpennylogo() {

        JCpennylogo.click();
    }
    boolean Jcpennylogo1(){
        return JCpennylogo.isDisplayed();
    }

    @FindBy(xpath = "//*[@id=\"footer\"]/div[2]/div[1]/div/div/ul/li[1]/form/div/div[2]/button")
    WebElement SignUp;

    void SignUp() {
        SignUp.click();
    }

    @FindBy(xpath = "//*[@id=\"comp_imagehotspots_1\"]/div/map/area[4]")
    WebElement Shoes;

    void Shoes() {


        Shoes.getLocation();
    }
    @FindBy(css = "[class=\"iQ2RY tooltip GWA60\"]")
    WebElement myaccount;

    void myaccount(){
        myaccount.click();
    }
   // boolean Clickingmyaccount(WebDriver dr1){
      //  moveMouse(dr1,myaccount);
       // boolean MYaccount= myaccount.click();
     //   return myaccount;
 //   }
   // String mYaccount(WebDriver dr1){
      //  moveMouse(dr1,myaccount);
   // }
    boolean ShoesPage(){
        return Shoes.isDisplayed();
    }

    @FindBy(css = "[alt=\"SPRING SAVINGS JEWLERY\"]")
    WebElement Jewlery;

   void Jewlery(){
       Jewlery.click();
   }
   boolean Jewlerypage(){


       return Jewlery.isDisplayed();
   }
   @FindBy(css = "[title=\"HANDBAGS\"]")
   WebElement Handbags;
   void Handbags(){


       Handbags.click();
   }
   @FindBy(css = "[data-automation-id=\"search-text-box\"]")
   WebElement searchBar;

    void searchbar(){

       searchBar.sendKeys("Shirt");
    }


   boolean Handbagspage(){


       return Handbags.isDisplayed();
   }
   void ClickHanbag(){

        Handbags.click();
   }
   String Handbagtext(){
       return Handbags.getText();
   }



   @FindBy(css = "[data-automation-id=\"menu-item-link-0\"]")
   WebElement MothersDay;
   String MothersDaytext(){


       return MothersDay.getText();
   }
   void MothersDay(){

       MothersDay.click();
   }


    boolean CheakingCareers(WebDriver dr1){

        moveMouse(dr1,careers);
        boolean career = careers.isDisplayed();
        return career;
    }



    String careertext(WebDriver dr1){
        moveMouse(dr1,careers);
        return careers.getText();
    }

ArrayList<String> linkText(){

         ArrayList<String> text = new ArrayList<>();
         for(WebElement a :  Trackmyorder){
             text.add(a.getText());
         }
         return text;
      }
      @FindBy(id = "[aria-label=\"Twitter\"]")
      WebElement Twitterlogo;

   boolean movemouse()  {
       movemouse(Twitterlogo);
       return  Twitterlogo.isDisplayed();
   }
   @FindBy(css = "[data-automation-id=\"menu-item-link-5\"]")

    WebElement YoungAdult;
     void Youngadult(){
         YoungAdult.click();
     }
     boolean Yonugadultpage(){
         return YoungAdult.isDisplayed();

     }
     @FindBy(css = "//*[@id=\"subMenuLevel1\"]/li[10]/div")

    WebElement beautysalon;
     void Beautysalon(){

         beautysalon.click();
    }
    @FindBy(css = "[data-analytics-tag=\"KIDS\"]")

    WebElement kids;

     void ClickKIds(){
         kids.click();
     }
     String Kidstext(){
         return kids.getText();
     }
     @FindBy(css = "[class=\"wdoYj yOFxD Wq659 MWirk O9B68 QEM80 _28ES1 xHWUC _6FzcK CYQjT VhxJp -Uhms  kR8H8 _4re9- _2wJbk xHWUC _6FzcK CYQjT _1h9W5 _06mTn _28ES1 QEM80 -AIRG\"]")
      WebElement SIGNUP;

     void SINGup() {
         SIGNUP.sendKeys("new1238@gmail.com");

     }



    }
