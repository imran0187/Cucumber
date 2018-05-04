package Steps;

import Base.BaseUtil;
import Pojo.Users;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;
import page_repo.HomePageObject;
import page_repo.RegistrationPageObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by imranhossan on 10/23/17.
 */
public class Stepdefs extends BaseUtil {

    private BaseUtil base;

    public Stepdefs(BaseUtil base) {

        this.base = base;
    }

    @Given("^I am on home page$")
    public void iAmOnHomePage() throws Throwable {
        System.out.println(" home page displayed");
        base.driver.navigate().to("http://demoqa.com/");
    }

    @When("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {
        HomePageObject homePageObject = new HomePageObject(base.driver);
        homePageObject.getRegistration_Button().click();
        System.out.println(" Successfully clicked on login button ");

    }


    @And("^I click on submit button$")
    public void iClickOnSubmitButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" Successfully clicked on submit button ");

    }

    @Then("^I verify profile page is displayed$")
    public void iVerfyProfilePageIsDisplayed() throws Throwable {
        System.out.println(" profiled page displayed Successfully ");

    }


    @And("^I enter following details for login$")
    public void iEnterFollowingDetailsForLogin(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       /* List <List<String>> data = table.raw();
        System.out.println("The Value is " + data.get(2).get(0).toString());
        System.out.println("The Value is " + data.get(2).get(1).toString());*/

        List<Users> users = new ArrayList<Users>();
        users = table.asList(Users.class);

        for (Users user : users) {
            System.out.println(" The user name is " + user.userName);
            System.out.println(" The password name is " + user.passWord);

        }
    }


    @When("^I enter enter invalid user name as ([^\"]*) and password as ([^\"]*)$")
    public void iEnterEnterInvalidUserNameAndPassWord(String invalidUsername, String invalidPass) throws Throwable {
        System.out.println(" invalid user name displayed as " + invalidUsername);
        System.out.println(" invalid user password displayed as " + invalidPass);

    }

    @Then("^I verify profile page is not displayed$")
    public void i_verify_profile_page_is_not_displayed() throws Throwable {
        System.out.println(" fail to display profile page ");

    }

    @When("^I click on registration button$")
    public void i_click_on_registration_button() throws Throwable {
        HomePageObject homePageObject = new HomePageObject(base.driver);
        homePageObject.getRegistration_Button().click();
        System.out.println(" Successfully clicked on registration button ");

    }

 /*   @When("^I enter all valid information on registration$")
    public void i_enter_all_valid_information_on_registration() throws Throwable {
        Thread.sleep(10000);
        RegistrationPageObject register = new RegistrationPageObject(base.driver);
        register.getFirstNameinputField().sendKeys("Imran");
        register.getLastNameinputField().sendKeys("Hossan");
        register.getMaritalStatus_Married().click();
        register.getHobby_Cricket().click();
        register.getPhone_Number_inputField().sendKeys("6462092962");
        register.getUsernameinputField().sendKeys("imran123");
        register.getEmail_inputField().sendKeys("imran0187@yahoo.com");
        register.getAboutYourself_inputField().sendKeys("A productive man");
        register.getPassword_inputField().sendKeys("password");
        register.getConfirmPassword_inputField().sendKeys("password");
        Select drpCountry = new Select(register.getCountry_Dropdown());
        drpCountry.selectByValue("United States");
        Select drpMonth = new Select(register.getDob_Month_dropdown());
        drpMonth.selectByValue("January");
        Select drpDay = new Select(register.getDob_Day_Dropdown());
        drpDay.selectByValue("10");
        Select drpYear = new Select(register.getDob_Year_Dropdown());
        drpDay.selectByValue("1986");
        register.getSubmit_Button().click();

    }*/
}



