package page_repo;


import Base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by imranhossan on 11/11/17.
 */
public class HomePageObject {

    public HomePageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.CSS, using = "#menu-item-374")
    public WebElement registration_Button;

    public WebElement getRegistration_Button() {

        return registration_Button;
    }


}
