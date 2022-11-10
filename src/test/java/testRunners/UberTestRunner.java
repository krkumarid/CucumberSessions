package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "D:\\JavaXps\\CucumberSession\\src\\test\\resources\\AppFeatures\\Uber.feature" }, glue = {
                "stepDefenitions" }, tags = "@Regression or @Smoke", plugin = {
                        "pretty" }, monochrome = false, dryRun = false)
public class UberTestRunner
{

}
