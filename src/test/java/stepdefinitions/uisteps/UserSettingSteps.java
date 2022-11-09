package stepdefinitions.uisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import pages.UserSettingsPage;
import utilities.Driver;

public class UserSettingSteps {
    UserSettingsPage userSettingsPage = new UserSettingsPage();
    LoginPage loginPage = new LoginPage();


    @Given("user will be login with {string} and {string}")
    public void user_will_be_login_with_and(String userName, String password) {
        loginPage.loginApplication(userName, password);

    }

    @Given("user clicks on account name")
    public void user_clicks_on_account_name() {
        loginPage.dropDownMenu.click();
    }

    @Given("user clicks on settings")
    public void user_clicks_on_settings() {
        loginPage.SettingsButton.click();
    }

    @Given("user edits firstname as {string}")
    public void user_edits_firstname_as(String firstName) {
        userSettingsPage.firstName.clear();
     Driver.waitAndSendText(userSettingsPage.firstName, firstName);
    }
    @Given("user edits lastname as {string}")
    public void user_edits_lastname_as(String lastName) {
        userSettingsPage.lastName.clear();
        Driver.waitAndSendText(userSettingsPage.lastName, lastName);
    }
    @Given("user edits email as {string}")
    public void user_edits_email_as(String email) {
        userSettingsPage.email.clear();
     Driver.waitAndSendText(userSettingsPage.email, email );
    }

    @Given("user click on save")
    public void user_click_on_save() {
     Driver.waitAndClick(userSettingsPage.saveButton);
    }


    @Then("user validates the toast message {string}")
    public void user_validates_the_toast_message(String string) {

        Driver.wait(1);

        Assert.assertTrue(userSettingsPage.successMessageToastContainer.isDisplayed());

    }

    @Then("user sign out")
    public void user_sign_out() throws InterruptedException {
        Thread.sleep(3000);
        loginPage.dropDownMenu.click();
        Thread.sleep(1000);
        Driver.waitAndClick(loginPage.signOut);
    }


}
