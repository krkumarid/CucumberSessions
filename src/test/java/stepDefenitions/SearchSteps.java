package stepDefenitions;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SearchSteps
{
    Product product;
    Search search;

    @Given("I have a search field on Amazon Page")
    public void i_have_a_search_field_on_amazon_page()
    {
        System.out.println("Step 1: I am on Amazon search page");
    }

    @When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
    public void i_search_for_a_product_with_name_and_price(String proName, int price)
    {
        System.out.println("Step 2: Search  the product with name:" + proName + " price:" + price);

        product = new Product(proName, price);
    }

    @Then("Product with name {string} should be displayed")
    public void product_with_name_should_be_displayed(String proName)
    {
        System.out.println("Step 3: Product " + proName + " is dispalyed");
        search = new Search();
        String name = search.displayProduct(product);
        System.out.println("Search product :" + name);
        Assert.assertEquals(product.getProName(), name);

    }

    @Then("Order id is {int} and username is {string}")
    public void order_id_is_and_username_is(Integer orderID, String userName)
    {
        System.out.println("Step 4: The order id" + orderID + " with user name" + userName);
    }
}
