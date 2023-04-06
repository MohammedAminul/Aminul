package Project;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class amazondrop {
    @FindBy(id = "searchDropdownBox")
    WebElement category;

    public static void selectcategory() {
    }


    void setCategory(){
    selectDropdown(category);
}

     void selectDropdown(WebElement category) {
    }
    @FindBy(id = "[id=\"searchDropdownBox\"]")
    WebElement cateGory;
    void selectcateGory(){
        selectDropdown(cateGory);

    }
    @FindBy(css = "[id=\"searchDropdownBox\"]")
    WebElement search;
    void searchbar1(){
        search.sendKeys("powerbank");
    }
}

