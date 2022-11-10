package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "D:\\JavaXps\\CucumberSession\\src\\test\\resources\\AppFeatures\\registration.feature" }, glue = {
                "stepDefenitions" }, plugin = { "pretty", "json:target/MyReports/report.json",
                        "junit:target/MyReports/report.xml" }, monochrome = false)
public class UserRegistrationTest
{

}
