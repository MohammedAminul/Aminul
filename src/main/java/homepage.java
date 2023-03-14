import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class homepage {
    @FindBy(css = "[class=\"a-color-base headline truncate-1line gwm-u-blackjack-typography\"]")

    WebElement topdeals;
    String topdealtext(){
        return topdeals.getText();
    }

}
