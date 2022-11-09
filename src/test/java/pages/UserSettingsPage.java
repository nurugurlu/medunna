package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserSettingsPage {

    public UserSettingsPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[contains(@name, 'firstName')]")
    public WebElement firstName;

    @FindBy(xpath = "//*[contains(@name, 'lastName')]")
    public WebElement lastName;

    @FindBy(xpath = "//*[contains(@name, 'email')]")
    public WebElement email;

    @FindBy(xpath = "//*[contains(@type, 'submit')]")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Settings saved!']")
    public WebElement successMessageToastContainer;






}
