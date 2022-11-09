package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        //features = "C:\\Users\\piski\\IdeaProjects\\medunna\\src\\test\\java\\resources\\features",
        features = "./src/test/java/resources/features",
        glue = {"stepdefinitions","hooks"},
        tags = "@ApiRegistrant",
        dryRun = false
)
public class Runner {
}