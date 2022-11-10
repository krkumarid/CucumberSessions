package stepDefenitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonHomePage
{
    @Given("User is on Amazon Home Page")
    public void user_is_on_amazon_home_page()
    {
        
    }
    
    @Then("user gets a Amazon search page")
    public void user_gets_a_amazon_search_page()
    {

    }
    
    @Then("Username is also displayed next to the search filed")
    public void username_is_also_displayed_next_to_the_search_filed()
    {
        
    }
    
    @Then("Amazon logo is also displayed")
    public void amazon_logo_is_also_displayed()
    {
        
    }
    
    @Then("Cart link is also displayed")
    public void cart_link_is_also_displayed()
    {
        
    }
    
    @When("user scroll down to Todays deal section")
    public void user_scroll_down_to_todays_deal_section()
    {
        
    }
    
    @Then("user gets the list of multiple products")
    public void user_gets_the_list_of_multiple_products()
    {
        
    }
    
    @Then("user get the product image and price details")
    public void user_get_the_product_image_and_price_details()
    {
        
    }
    
    @Then("user can see more products by clicking on corousel")
    public void user_can_see_more_products_by_clicking_on_corousel()
    {
        
    }
    
    @When("User scroll down to footer of the page")
    public void user_scroll_down_to_footer_of_the_page()
    {
        
    }
    
    @Then("user gets all Country links")
    public void user_gets_all_country_links(DataTable dataTable)
    {
        List<List<String>> countryList = dataTable.asLists(String.class);
        System.out.println(countryList);
    }
    
    @Then("User gets all Amazon service links")
    public void user_gets_all_amazon_service_links(DataTable dataTable)
    {
        List<List<String>> serviceList = dataTable.asLists(String.class);
        System.out.println(serviceList);
    }
    
    @Then("User gets all privacy policy links")
    public void user_gets_all_privacy_policy_links(DataTable dataTable)
    {
        List<List<String>> privacyList = dataTable.asLists(String.class);
        System.out.println(privacyList);
    }
    
}
