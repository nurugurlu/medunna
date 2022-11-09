package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {

    public static RequestSpecification spec;

    @Before( value = "@ApiRegistrant")
    public void setup(){
        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("base_url")).build();
    }

    @Before(value = "@UserSettingsInfoEdit")
    public void navigateToUserSettings(){
        Driver.getDriver().get(ConfigurationReader.getProperty("base_url"));
    }

    @Before(order = 1, value = "@UIRegistration")
    public void navigateToRegistrationPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_registration_url"));
    }

    @Before(order = 1, value = "@Appointment")
    public void navigateToLandingPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_registration_url"));
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
        }

//        Driver.closeDriver();

    }

}