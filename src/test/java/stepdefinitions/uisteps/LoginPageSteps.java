package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("base_url"));
    }
    @Given("user clicks on login dropdown")
    public void user_clicks_on_login_dropdown() {
        Driver.waitAndClick(loginPage.loginDropdown);
    }
    @Given("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        Driver.waitAndClick(loginPage.signInButton);
    }
    @Given("user enters {string} and {string}")
    public void user_enters_and(String userName, String password) {
        Driver.waitAndSendText(loginPage.username, userName);
        Driver.waitAndSendText(loginPage.password, password);
    }
    @Given("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        Driver.waitAndClick(loginPage.loginButton);
    }
    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {

    }


}
