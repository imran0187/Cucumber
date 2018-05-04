package Steps;

import Base.BaseUtil;
import Utils.RandomGenerator;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import page_repo.RegistrationPageObject;

/**
 * Created by imranhossan on 11/12/17.
 */
public class RegistrationSteps extends BaseUtil {
    private BaseUtil base;
    RandomGenerator randUser = new RandomGenerator();

    public RegistrationSteps(BaseUtil base) {
        this.base = base;
    }

    @Then("^I verify registration page is displayed$")
    public void i_verify_registration_page_is_displayed() throws Throwable {
        RegistrationPageObject register = new RegistrationPageObject(base.driver);
        String text = register.registration_Form_Header.getText();
        Assert.assertEquals(text, "Registration Form");

    }

    @When("^I enter all valid information on registration$")
    public void i_enter_all_valid_information_on_registration() throws Throwable {
        Thread.sleep(10000);
        RegistrationPageObject register = new RegistrationPageObject(base.driver);
        register.getFirstNameinputField().sendKeys("Imran");
        register.getLastNameinputField("Hossan");
        register.getMaritalStatus_Married().click();
        register.getHobby_Cricket().click();
        register.getPhone_Number_inputField().sendKeys("6462092962");
        register.getUsernameinputField().sendKeys("imran" + "test" + randUser.generateRandomIntIntRange());
        register.getEmail_inputField().sendKeys( "test" + randUser.generateRandomIntIntRange() + "@yahoo.com");
        register.getAboutYourself_inputField().sendKeys("A productive man");
        register.getPassword_inputField().sendKeys("password");
        register.getConfirmPassword_inputField().sendKeys("password");
        Select drpCountry = new Select(register.getCountry_Dropdown());
        drpCountry.selectByValue("United States");
        Select drpMonth = new Select(register.getDob_Month_dropdown());
        drpMonth.selectByValue("1");
        Select drpDay = new Select(register.getDob_Day_Dropdown());
        drpDay.selectByValue("10");
        Select drpYear = new Select(register.getDob_Year_Dropdown());
        drpYear.selectByValue("1986");
        register.getSubmit_Button().click();

    }

    @Then("^I verify registration successful message is displayed$")
    public void i_verify_registration_successful_message_is_displayed() throws Throwable {
        RegistrationPageObject register = new RegistrationPageObject(base.driver);
        Thread.sleep(5000);
        Assert.assertEquals(register.getRegistration_Successfull_Text().getText(), "Thank you for your registration");

    }


}
