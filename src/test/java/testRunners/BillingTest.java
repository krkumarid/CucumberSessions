package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "D:\\JavaXps\\CucumberSession\\src\\test\\resources\\AppFeatures\\billing.feature" }, glue = {
                "stepDefenitions" }, plugin = { "pretty" }, monochrome = false)
public class BillingTest
{

}
