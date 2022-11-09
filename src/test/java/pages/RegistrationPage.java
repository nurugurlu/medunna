package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {

    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="ssn")
    public WebElement ssnTextBox;
    @FindBy(id = "firstName")
    public WebElement firstnameTextBox;
    @FindBy(id = "lastName")
    public WebElement lastnameTextBox;
    @FindBy(id = "username")
    public WebElement usernameTextBox;
    @FindBy(id = "email")
    public WebElement emailTextbox;
    @FindBy(xpath = "//*[text()='New password']/following::input")
    public WebElement firstPasswordTextBox;
    @FindBy(id= "secondPassword")
    public WebElement newPasswordTextBox;
    @FindBy(id = "register-submit")
    public WebElement registerButton;
    @FindBy(xpath = "//*[contains(text(),'Registration Saved')]")
    public WebElement successMessageToastContainer;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(255, 0, 0)')]")
    public WebElement passwordStrength1;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(255, 153, 0)')]")
    public WebElement passwordStrength2;

    @FindBy(xpath = "//*[@id='strengthBar']/li[contains(@style,'rgb(153, 255, 0)')]")
    public WebElement passwordStrength3;

}

///** Create a function to generate a list of numbers from 0 + x to 100 + x. Here x is a parameter of the function craeted. Result should look something like this: [0+x, 1+x,2+x, 3+x, ..........100+x].
// Say x = 2,
// Result will look like this:
// [2,3,4,......102
//*/
//
// // 2. Write a function that takes 3 required arguments,
//// The function adds the first argument to the second argument and keeps adding the second argument to the new sum until we finally just exceed the third optional argument. The function then returns an array with the first item being the number of times it took to just exceed the third optional argument and the second item being the final sum number.
//
//
//// Example 1:
//// first argument = 1
//// second argument = 2
//// third argument = 5
////[3,7]
//
//// we  add 1 and 2, then we check if 3 is greater than 5. Since it is not, we add 3 with second arugment which is 2 and see if then exceeds 5. It does not since 5 is not greater than 5, then we add 5 with 2 (second argument again) and then see if 7 which is greater than 5. In this case it is true. So we see that it took us 3 additions to get our value to exceed 5, so the first return array value is 3, and the second return array value is 7, our final sum value.


