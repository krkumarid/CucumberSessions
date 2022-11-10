package stepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberStepDefenitions
{
    
    @Given("User wants to select a car type {string} from uber application")
    public void user_wants_to_select_a_car_type_from_uber_app(String carType)
    {
        System.out.println("Step 1 :" + carType);
    }
    
    @When("User select car {string} and pick up point {string} and drop location {string}")
    public void user_select_car_and_pick_up_point_and_drop_location(String carType, String pickUp, String dropOff)
    {
        System.out.println("Step 2:" + carType + ":" + pickUp + ":" + dropOff);
    }
    
    @Then("Driver stars the journey")
    public void driver_stars_the_journey()
    {
        System.out.println("Step 3");
    }
    
    @Then("cDriver Ends the journey")
    public void c_driver_ends_the_journey()
    {
        System.out.println("Step 4");
    }
    
    @Then("user pays {int} USD")
    public void user_pays_usd(Integer amount)
    {
        System.out.println("Step 5:" + amount);
    }
}
