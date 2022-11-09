package stepdefinitions.uisteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AppointmentPage;
import pojos.AppointmentGet;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utilities.WriteToTxt.saveAppointData;

public class AppointmentSteps {

    AppointmentPage appointmentPage = new AppointmentPage();
    Faker faker = new Faker();
    AppointmentGet appointment = new AppointmentGet();

    public AppointmentSteps() {

        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }

    @Given("user clicks on make an appointment")
    public void user_clicks_on_make_an_appointment() {

        Driver.waitAndClick(appointmentPage.MakeAnAppointmentButton);


    }

    @Given("user provides the appoinment name {string}")
    public void user_provides_the_appoinment_name(String firstname) {

        appointment.setFirstName(firstname);
        Driver.waitAndSendText(appointmentPage.firstnameTextbox, firstname);
        Assert.assertNotEquals("", firstname);

    }

    @Given("user provides the appointment lastname {string}")
    public void user_provides_the_appointment_lastname(String lastname) {
//        lastname = faker.name().lastName();
        appointment.setLastName(lastname);
        Driver.waitAndSendText(appointmentPage.lastnameTextbox, lastname);
        Assert.assertNotEquals("", lastname);

    }

    @Given("user provides ssn and email {string} and {string}")
    public void user_provides_ssn_and_email_and(String ssn, String email) {
//        ssn = faker.idNumber().ssnValid();
//        email = faker.internet().emailAddress();
        appointment.setSsn(ssn);
        appointment.setEmail(email);

        Driver.waitAndSendText(appointmentPage.ssnTextbox, ssn);
        Pattern ssnPattern = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
        Matcher ssnMatcher = ssnPattern.matcher(ssn);
        Assert.assertTrue(ssnMatcher.find());

        Driver.waitAndSendText(appointmentPage.emailTextbox, email);

        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9_-]+[.]?[A-Za-z0-9_-]+@.+\\..+$");
        Matcher emailMatch = emailPattern.matcher(email);
        Assert.assertTrue(emailMatch.find());


    }

    @When("user provides the phone number {string}")
    public void user_provides_the_phone_number(String phoneNumber) {
//        phoneNumber = faker.phoneNumber().cellPhone();
        appointment.setPhone(phoneNumber);

        Driver.waitAndSendText(appointmentPage.phoneTextbox, phoneNumber);

        Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher matcher = pattern.matcher(phoneNumber);

        Assert.assertTrue(matcher.find());
    }

    @When("user provides the date {string}")
    public void user_provides_the_date(String date) {
        //05-04-2022
//        date = getDate();
        appointment.setStartDate(date);

        Driver.waitAndSendText(appointmentPage.dateTextbox, date);

    }

    @Then("user requests appointment and verifies the success message")
    public void user_requests_appointment_and_verifies_the_success_message() {

        Driver.waitAndClick(appointmentPage.requestButton);
        saveAppointData(appointment);
        Assert.assertTrue(Driver.waitForVisibility(appointmentPage.successMessageToastContainer, 5).isDisplayed());
    }


}
