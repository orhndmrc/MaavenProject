package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.DriverMgr;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.DatePickerPage;
import pageObjects.JQueryHPage;



public class HomepageDefs  {
    WebDriver driver;
    String baseUrl;
    JQueryHPage jQueryHPage;
    DatePickerPage datePickerPage;

    @Given("I am on the jquery homepage")
    public void i_am_on_the_jquery_homepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside given");
        baseUrl= "https://jqueryui.com/";
        driver= DriverMgr.getDriver();
        jQueryHPage= new JQueryHPage(driver);
        datePickerPage= new DatePickerPage(driver);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @When("I click on controlgroup")
    public void i_click_on_controlgroup() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside when");
    }
    @Then("I land on controlgroup page")
    public void i_land_on_controlgroup_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside then");
    }

    @When("I click on datepicker")
    public void i_click_on_datepicker() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside date picker landing page");
        jQueryHPage.clickDatePicker();
    }




    @Then("I land on datepicker page")
    public void i_land_on_datepicker_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" landing page");
    }

    @When("I click on checkboxradio")
    public void i_click_on_checkboxradio() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("checkbox");
    }


    @Then("I land on checkboxradio page")
    public void i_land_on_checkboxradio_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("checkbox landing page");
    }

   @And("I switch to demo-frame")
    public void switch_demo_frame(){
       System.out.println("switching to demo-frame");
       jQueryHPage.switchFrame();
   }





}
