package Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cartpage {
  @FindBy(css = "[class=\"gAUl-\"]")
    WebElement Cartbutton;
  String Textcartbutton(){
      String text = Cartbutton.getText();
      return text;
  }

}
