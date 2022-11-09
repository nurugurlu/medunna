package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="account-menu")
    public WebElement loginDropdown;
    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public  WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@class='svg-inline--fa fa-sign-out-alt fa-w-16 fa-fw ']")
    public WebElement signOut;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement dropDownMenu;

    @FindBy(linkText = "Settings" )
    public WebElement SettingsButton;

    //If you want to sign in, you can try the default accounts:
    //- Administrator (login="admin" and password="admin")
    //- User (login="user" and password="user").
    //    Creating a reusable login method
//    I will call this in the test classes to login
    public void loginApplication(String userName, String passWord) {
        loginDropdown.click();
        signInButton.click();
        username.sendKeys(userName);
        password.sendKeys(passWord);
        loginButton.click();
    }



}
