package page_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by imranhossan on 11/12/17.
 */
public class RegistrationPageObject {
    public RegistrationPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void getLastNameinputField(String lastName) {
        lastNameinputField.sendKeys(lastName);

    }

    public WebElement getMaritalStatus_Married() {
        return maritalStatus_Married;
    }

    public WebElement getHobby_Cricket() {
        return hobby_Cricket;
    }

    public WebElement getCountry_Dropdown() {
        return country_Dropdown;
    }

    public WebElement getDob_Month_dropdown() {
        return dob_Month_dropdown;
    }

    public WebElement getDob_Day_Dropdown() {
        return dob_Day_Dropdown;
    }

    public WebElement getDob_Year_Dropdown() {
        return dob_Year_Dropdown;
    }

    public WebElement getPhone_Number_inputField() {
        return phone_Number_inputField;
    }

    public WebElement getUsernameinputField() {
        return usernameinputField;
    }

    public WebElement getEmail_inputField() {
        return email_inputField;
    }

    public WebElement getAboutYourself_inputField() {
        return aboutYourself_inputField;
    }

    public WebElement getPassword_inputField() {
        return password_inputField;
    }

    public WebElement getConfirmPassword_inputField() {
        return confirmPassword_inputField;
    }

    public WebElement getSubmit_Button() {
        return submit_Button;
    }

    public WebElement getError_Text_Required() {
        return error_Text_Required;
    }

    public WebElement getFirstNameinputField() {
        return firstNameinputField;
    }

    public WebElement getRegistration_Successfull_Text() {
        return registration_Successfull_Text;
    }

    public WebElement getRegistration_Form_Header() {
        return registration_Form_Header;
    }


    @FindBy(how = How.ID, using = "name_3_firstname")
    public WebElement firstNameinputField;

    @FindBy(how = How.ID, using = "name_3_lastname")
    public WebElement lastNameinputField;

    @FindBy(how = How.XPATH, using = "//*[contains(@value,'married')]")
    public WebElement maritalStatus_Married;

    @FindBy(how = How.XPATH, using = "//*[contains(@value,'cricket')]")
    public WebElement hobby_Cricket;

    @FindBy(how = How.ID, using = "dropdown_7")
    public WebElement country_Dropdown;

    @FindBy(how = How.ID, using = "mm_date_8")
    public WebElement dob_Month_dropdown;

    @FindBy(how = How.ID, using = "dd_date_8")
    public WebElement dob_Day_Dropdown;

    @FindBy(how = How.ID, using = "yy_date_8")
    public WebElement dob_Year_Dropdown;

    @FindBy(how = How.ID, using = "phone_9")
    public WebElement phone_Number_inputField;

    @FindBy(how = How.ID, using = "username")
    public WebElement usernameinputField;

    @FindBy(how = How.ID, using = "email_1")
    public WebElement email_inputField;

    @FindBy(how = How.ID, using = "description")
    public WebElement aboutYourself_inputField;

    @FindBy(how = How.ID, using = "password_2")
    public WebElement password_inputField;

    @FindBy(how = How.ID, using = "confirm_password_password_2")
    public WebElement confirmPassword_inputField;

    @FindBy(how = How.NAME, using = "pie_submit")
    public WebElement submit_Button;

    @FindBy(how = How.CSS, using = ".legend.error")
    public WebElement error_Text_Required;

    @FindBy(how = How.CLASS_NAME, using = "piereg_message")
    public WebElement registration_Successfull_Text;

    @FindBy(how = How.ID, using = "piereg_pie_form_heading")
    public WebElement registration_Form_Header;
}
