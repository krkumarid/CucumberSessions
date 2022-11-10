package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AmazonHooks
{
    @Before("@Smoke")
    public void setup_app(Scenario sc)
    {
        System.out.println("Launch amazon application");
        System.out.println(sc.getName());
    }

    /*
     * @Before(order = 2) public void setup_url() {
     * System.out.println("Launch the URL"); }
     */
    /*
     * @After(order = 2) public void tearDown_Close() {
     * System.out.println("Close the DB Connection"); }
     */

    @After("@Regression")
    public void tearDown_logout(Scenario sc)
    {
        System.out.println("Close the browser");
        System.out.println(sc.getName());
        // System.out.println(sc.getStatus());
    }
}
