package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class SearchSteps extends DriverManager  {




    @Given("^I am on Homepage$")
    public void i_am_on_Homepage() {
        openBrowser();
    }


    @When("^I search for a \"([^\"]*)\"$")
    public void i_search_for_a(String arg1) {
        driver.findElement(By.id("srchInput")).clear();
        driver.findElement(By.id("srchInput")).clear();
        driver.findElement(By.id("srchInput")).sendKeys("Nike");
        driver.findElement(By.id("srchInput")).sendKeys(Keys.ENTER);



    }

    @Then("^I should be able to see desired products$")
    public void i_should_be_able_to_see_desired_products()  {
        String actualTitle=driver.getTitle();
        assert actualTitle.contains("Nike");
        closeBrowser();






    }
}
