package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "D:\\JavaXps\\CucumberSession\\src\\test\\resources\\AppFeatures\\Search.feature" }, glue = { "stepDefenitions",
                "MyHooks" }, tags = "@Smoke or @Regression", plugin = { "pretty", "json:target/MyReports/report.json",
                        "junit:target/MyReports/report.xml" }, monochrome = false)
public class AmazonTest
{

}
